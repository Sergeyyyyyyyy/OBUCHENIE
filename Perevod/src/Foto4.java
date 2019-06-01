import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class Foto4 {
    public static void main(String[] args) {
    }



    Set<String> knownWords = new HashSet<>(Arrays.asList(new String[]{"go", "name", "is", "friends"}));
    List<String> text = Arrays.asList("today", "we", "go", "to", "the", "cinema",
            "with", "our", "friends", "the", "file", "is", "very", "intresting", "friends", "go",
            "to", "the", "park", "after", "the", "film");

    class Reshenie {
        int unknowWordsDistance = 0;
        //SlovaTest slovo = new SlovaTest();
        //slovo.calcRepeatedSlovaCount();
        //slovo.print();


        // Бежим по переменной text,
        // Сравниваем слова с knownWords
        // Подсчитываем кол=во слов которые незнакомы и идут подряд
        // Сравниваем длину последовательности unknowWordsDistance с
        // Если последовательность < unknowWordsDistance  то пропускаем
        // Если последовательность >= unknowWordsDistance  то вколючаем в коллекцию слов котторые точно не известны
        //  После пробегания по всему тексту выводим кол-во уникальных неизвестных слов

        Reshenie() {
            Scanner sc = new Scanner(System.in);
            int unknowWordsDistance = sc.nextInt();
            text = new ArrayList<>(text);


            Set<String> uknowswords = new HashSet<>();
            List<String> tempuknown = new ArrayList<>();
            AtomicBoolean begintext = new AtomicBoolean(true);
            text.forEach(word -> {
                if (knownWords.contains(word)) {
                    System.out.println("known word: " + word);
                    if (begintext.get()) {
                        uknowswords.addAll(tempuknown);
                    }
                    begintext.set(false);

                    if (tempuknown.size() >= unknowWordsDistance) {
                        uknowswords.addAll(tempuknown);
                    }
                    tempuknown.clear();

                } else {
                    System.out.println("unknown word: " + word);

                    tempuknown.add(word);
                }
            });
            uknowswords.addAll(tempuknown);

            System.out.println("unknown word: " + uknowswords.size());

        }

    }
}

