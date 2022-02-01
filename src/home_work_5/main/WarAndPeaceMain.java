package home_work_5.main;

import home_work_5.service.EasySearch;
import home_work_5.service.WordsFromFile;

import java.util.Map;
import java.util.Set;

public class WarAndPeaceMain {
    public static void main(String[] args) {
        WordsFromFile fromFileToSet = new WordsFromFile();
        Set<String> wordsSet = fromFileToSet.addWordsToSet(fromFileToSet.reader("Война и мир_книга.txt"));
//        System.out.println(words);
        System.out.println("Количество уникальных слов в Set - " + wordsSet.size());
        Map<String, Integer> wordsMap = fromFileToSet.addWordsToMap(fromFileToSet.reader("Война и мир_книга.txt"), 3);
        System.out.println("Количество ключей в Map - " + wordsMap.size());
//        System.out.println(wordsMap);
        fromFileToSet.printMaxValues(wordsMap, 5);

        EasySearch easySearch = new EasySearch();

        String str = new String(fromFileToSet.reader("Война и мир_книга.txt"));
        easySearch.printToConsole(str);
    }
}
