package home_work_5.service;

import home_work_5.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
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

    public void printToConsole(String text){
        //Реализация никакая, но на сегодняшний день так... Сколько времени было, так и сделал =(
        long word1 = search(text, "Война") + search(text, "война");
        long word2 = search(text, "И") + search(text, "и");
        long word3 = search(text, "Мир") + search(text, "мир");
        System.out.println("Слово " + "'война'" + "упоминается в тексте " + word1 + " раз, независимо от регистра");
        System.out.println("Союз " + "'и'" + "упоминается в тексте " + word2 + " раз, независимо от регистра");
        System.out.println("Слово " + "'мир'" + "упоминается в тексте " + word3 + " раз, независимо от регистра");
    }
}
