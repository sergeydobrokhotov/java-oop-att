package hw;

import org.junit.jupiter.api.Test;

import java.util.*;

/*
Создать массив с набором из 10–20 слов, должны встречаться повторяющиеся.
Найти и вывести список уникальных слов, из которых состоит массив.
Посчитать, сколько раз встречается каждое слово.
 */
public class FirstTask {

    @Test
    public void firstTask() {
        String text = "Налей же, налей, налей мне чашу влаги живящей,\n" +
                "Возьми же, возьми, возьми свой чанг, в сто ладов звенящий." +
                "\n" +
                "Отдам я, отдам, отдам всю жизнь ради милой сердцу,\n" +
                "Прильну я, прильну, прильну к устам, что нектара слаще.\n" +
                "\n" +
                "От уст твоих, дивных уст в стыде потускнеет яхонт,\n" +
                "А зубкам, зубкам твоим - не ровня и перл блестящий.\n" +
                "\n" +
                "А слово, слово твое вкуснее, чем мед и сахар,\n" +
                "А лик твой, прекрасный лик - как солнце с луной всходящей.\n" +
                "\n" +
                "А косы, косы твои - померкнет пред ними мускус,\n" +
                "А брови, брови - как лук, ресницами стрел разящий.\n" +
                "\n" +
                "Меня ты, меня, меня коварной стрелой сгубила,\n" +
                "Тобой, тобой я сражен, очей красотой томящей.\n" +
                "\n" +
                "Терпи, Насими, терпи, тебе любимая скажет,\n" +
                "Кто люб ей, кто люб, кто люб, кто сердцу друг настоящий.";
        String[] array = text.split(" ");
        List<String> list = Arrays.asList(array);
        Set<String> set = new HashSet<>(list);

        for (String word : set) {
            System.out.println("Слово '" + word + "' встречается " + Collections.frequency(list, word) + " раз(а).");
        }
    }
}
