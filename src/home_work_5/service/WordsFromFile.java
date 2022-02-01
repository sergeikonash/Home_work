package home_work_5.service;

import javax.management.ObjectName;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordsFromFile {

    public StringBuilder reader(String fileName) {
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
        return builder;
    }

    public Set<String> addWordsToSet(StringBuilder string) {
        Set<String> wordsSet = new HashSet<>();
        String str = new String(string);
        String[] wordsArray = str.split(" ");
        for (String word : wordsArray) {
            wordsSet.add(word);
        }
        wordsSet.remove("");
        return wordsSet;
    }

    public Map<String, Integer> addWordsToMap(StringBuilder string, int countOfWords) {
        Map<String, Integer> wordsMap = new HashMap<>();
        String str = new String(string);
        String[] wordsArray = str.split(" ");
        for (String word : wordsArray) {
            if (!wordsMap.containsKey(word)) {
                wordsMap.put(word, 1);
            } else {
                int i = wordsMap.get(word);
                wordsMap.put(word, i + 1);
            }
        }
        return wordsMap;
    }

    public void printMaxValues(Map<String, Integer> wordsMap, int countOfWords) {
        wordsMap.remove("");
        List<Integer> list = new ArrayList<>(wordsMap.values());
        Collections.sort(list);
        System.out.println("Топ-" + countOfWords + " слов в тексте:");
        for (int i = 1; i <= countOfWords; i++) {
            int j = list.get(list.size() - i);
            for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
                if (entry.getValue() == j) {
                    System.out.println(entry.getKey() + " - " + j + " раз");
                }
            }
        }
    }
}


