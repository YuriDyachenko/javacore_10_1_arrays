package kurs;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String[] WORDS = {"Мухин", "Пономарёв", "Сусаренко", "Спивак", "Авдеев", "Куликов",
            "Сусаренко", "Авдеев", "Щербаков", "Никитин", "Бородай", "Князев", "Якушев", "Авдеев", "Сусаренко",
            "Бородай", "Романов", "Гурьев", "Авдеев", "Копылов", "Виноградов", "Сусаренко", "Родионов",
            "Хитрук", "Гурьев", "Авдеев", "Бородай", "Гурьев", "Евсеев", "Бородай", "Правый", "Беспалов"};

    public static void main(String[] args) {

        List words = new ArrayList();
        for (String word: WORDS) {
            boolean found = false;
            List repeatingWords;
            for (Object o : words) {
                repeatingWords = (ArrayList) o;
                if (repeatingWords.get(0).equals(word)) {
                    repeatingWords.add(word);
                    found = true;
                }
            }
            if (!found) {
                repeatingWords = new ArrayList();
                repeatingWords.add(word);
                words.add(repeatingWords);
            }
        }
        for (Object o : words) {
            List repeatingWords = (ArrayList) o;
            System.out.printf("%s = %d\n", repeatingWords, repeatingWords.size());
        }
    }
}
