package home_work_5.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class WorkingWithFiles {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите адрес папки с текстовыми файлами:");
        Scanner scanner = new Scanner(System.in);
        String directory = null;
        String textFromFile;
        File folder;
        while (true) {
            try {
                directory = scanner.nextLine(); //C:\Users\HP\IdeaProjects\Books for HW
                folder = new File(directory);
                for (File file : folder.listFiles()) {
                    System.out.println(file.getName());
                }
                break;
            } catch (NullPointerException exception) {
                System.out.println("Адрес введен некорректно");
            }
        }

        String nameOfFile = directory + "\\Results of search.txt";
        Files.createFile(Path.of(nameOfFile));

        String text;
        String book;

        while (true) {
            System.out.println("Выберите книгу, с которой будем работать (для прекращения поиска введите END):");
            book = scanner.nextLine();
            if (book.equals("END")) {
                System.out.println("Поиск завершен");
                break;
            }
            System.out.println("Поиск по книге " + book);
            String bookLikeString = reader(directory + "\\" + book);

            System.out.println("Введите текст, который хотите найти в книге (для прекращения поиска введите END):");
            text = scanner.nextLine();
            if (text.equals("END")) {
                System.out.println("Поиск завершен");
                break;
            }
            long i = search(bookLikeString, text);
            if (i > 0) {
                System.out.println("Такой текст встречается в книге " + i + " раз(а)");
                textFromFile = Files.readString(Path.of(nameOfFile)) + book + " - " + text + " - " + i + "\n";
                Files.writeString(Path.of(nameOfFile), textFromFile);
            } else {
                System.out.println("Такой текст не встречается в книге");
            }
        }
    }

    public static String reader(String fileName) {
        StringBuilder builder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(fileName);
            int symbol = -1;

            while ((symbol = fileReader.read()) != -1) {
                if (symbol != '('
                        && symbol != ')'
                        && symbol != ','
                        && symbol != '.'
                        && symbol != '!'
                        && symbol != '?'
                        && symbol != '"'
                        && symbol != ';'
                        && symbol != ':'
                        && symbol != '='
                        && symbol != '-'
                        && symbol != '\n') {
                    builder.append((char) symbol);
                }
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("Ошибка, файл не найден");
        } catch (IOException ex) {
            System.out.println("Ошибка чтения файла");
        }
        return new String(builder);
    }

    public static long search(String text, String word) {
        long count = 0;
        int i = 0;
        while (i >= 0) {
            if (i >= 0) {
                i++;
            }
            i = text.indexOf(word, i);
            if (i > 0) {
                count++;
            }
        }
        return count;
    }
}
