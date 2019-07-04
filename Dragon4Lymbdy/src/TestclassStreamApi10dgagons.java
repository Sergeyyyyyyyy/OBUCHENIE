import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.sun.xml.internal.ws.client.ContentNegotiation.none;

// для решения задач по СтримАпи
public class TestclassStreamApi10dgagons {

    private static Object String;

    // к заданию № 3
    public static double rnd(int min, int max) {
        max -= min;
        return (double) (Math.random() * ++max) + min;
    }

    public static void main(String... args) {


        //String[] arrs = {"drag5", "drag6", "drag7", "drag8", "drag9", "drag10"};
        //Stream<String> drags = Arrays.stream ( arrs );
        //long n1 = drags.filter ( s -> s.length () < 4 ).count ();
        //System.out.println ( n1 );

        FirebreathingDragon4LymbdaLymbda drag5 = new FirebreathingDragon4LymbdaLymbda(0, 0, 0, 0, 0, 0);
        drag5.setHead(0, 0, 0);
        drag5.setName("RRRRRR");
        FirebreathingDragon4LymbdaLymbda drag6 = new FirebreathingDragon4LymbdaLymbda(53, 98, 8, 4, 8);
        drag6.setHead(3, 84, 23);
        drag6.setName("TTTTTTTTTTT");
        FirebreathingDragon4LymbdaLymbda drag7 = new FirebreathingDragon4LymbdaLymbda(23, 30, 2, 4, 8);
        drag7.setHead(2, 98, 44);
        drag7.setName("WWW");
        FirebreathingDragon4LymbdaLymbda drag8 = new FirebreathingDragon4LymbdaLymbda(66, 84, 11, 21, 1);
        drag8.setHead(3, 9, 41);
        drag8.setName("yyyyyy");
        FirebreathingDragon4LymbdaLymbda drag9 = new FirebreathingDragon4LymbdaLymbda(21, 28, 77, 88, 99, 14);
        drag9.setHead(4, 37, 27);
        drag9.setName("kkkkkkkkkkk");
        FirebreathingDragon4LymbdaLymbda drag10 = new FirebreathingDragon4LymbdaLymbda(88, 33, 48, 40, 48);
        drag10.setHead(3, 78, 35);
        drag10.setName("SSSSSSS");
        FirebreathingDragon4LymbdaLymbda drag12 = new FirebreathingDragon4LymbdaLymbda(68, 22, 98, 87, 98);
        drag12.setHead(2, 523, 98);
        drag12.setName("ZZZZZZZZZZZZ");
        FirebreathingDragon4LymbdaLymbda drag13 = new FirebreathingDragon4LymbdaLymbda(77, 11, 87, 65, 10, 54);
        drag13.setHead(4, 90, 56);
        drag13.setName("vvvvvvvvv");
        FirebreathingDragon4LymbdaLymbda drag14 = new FirebreathingDragon4LymbdaLymbda(99, 55, 45, 4, 15);
        drag14.setHead(2, 21, 95);
        drag14.setName("XXXXXXXXXXXXXXXXXPPPPPPPPP");
        FirebreathingDragon4LymbdaLymbda drag15 = new FirebreathingDragon4LymbdaLymbda(44, 20, 87, 6, 4);
        drag15.setHead(3, 41, 54);
        drag15.setName("POUYTREEWW");

        List<FirebreathingDragon4LymbdaLymbda> newDragons = Arrays.asList(drag5, drag6, drag7, drag8, drag9, drag10, drag12, drag13, drag14, drag15);
        zadanie1ProverkaDragondsonHeads(newDragons);
        zadanie2SortirovkaDragondspoUbyvaniu(newDragons);
        zadanie3SortirovkaDragondspoMinMAx(newDragons);
        zadanie4PeresborkaSpiskagolovcherezPotokDannyh(newDragons);
        zadanie6(newDragons);
        zadanie7(newDragons);

        newDragons.get(0).getFbheads().get(0).setFirePower(0); // изменяю тестовые данные
        zadanie8(newDragons); // изменяю тестовые данные
        zadanie9(newDragons);
        zadanie10(newDragons);
        zadanie11(newDragons);
    }

    // Задание 1  Проверка кол-во голов у новых драконов
    private static void zadanie1ProverkaDragondsonHeads(List<FirebreathingDragon4LymbdaLymbda> newDragons) {

        int minKolGolov = 4; // эквивалентно n1  по задаче
        int maxKolGolov = 4; // эквивалентно n2 по задаче

        newDragons.stream().filter(dragon ->
                dragon.getFbHeadsCount() >= minKolGolov && dragon.getFbHeadsCount() <= maxKolGolov)
                .map(dragon -> dragon.name)
                .forEach(dragonName -> {
                    System.out.println(dragonName);
                });
    }


    // Задание 2
    private static void zadanie2SortirovkaDragondspoUbyvaniu(List<FirebreathingDragon4LymbdaLymbda> newDragons) {
        int firstN = 3;
        //int map;
        // Collector<Object, ?, List<Object>> toList = Collectors.toList();

        //int PromejutochnayFiltracia;

        List<FirebreathingDragon4LymbdaLymbda> tmp = newDragons.stream().sorted(
                (x, y) -> ((Double) x.getFullPower()).compareTo(y.getFullPower())
        )
                .collect(Collectors.toList());
//                .forEach(dragon -> {
//                    System.out.println(dragon + ",getFullPower = " + dragon.getFullPower());
//                })
        ;

        for (int i = 0; i < Math.min(firstN, tmp.size()); i++) {
            System.out.println(tmp.get(i) + ",getFullPower = " + tmp.get(i).getFullPower());
        }
    }

    // Задание 3
    private static void zadanie3SortirovkaDragondspoMinMAx(List<FirebreathingDragon4LymbdaLymbda> newDragons) {
        double polnayaVelichina = 20000;
        //int map;
        // Collector<Object, ?, List<Object>> toList = Collectors.toList();

        final int minA = 0; // Минимальное число для диапазона
        final int maxB = 1000; // Максимальное число для диапазона


        List<FirebreathingDragon4LymbdaLymbda> tmp = newDragons.stream()
                .filter(dragon -> dragon.getMaxPowerPerHead() <= polnayaVelichina)  // кол-во драконов почему-то - 0
                .map(dragon -> {
                    // в условие вставили "getFbHeadsCount" вместо "polnayaVelichina"
                    for (int i = 0; i < dragon.getFbHeadsCount(); i++) {
                        FirebreathingDragon4LymbdaLymbda.FBHead head = dragon.getHead(i);
                        head.setFirePower(head.getFirePower() + rnd(minA, maxB));
                    }
                    return dragon;
                })
// отбрасываем 1 и последнего дракона
//                .skip ( 1 )
//                .limit ( newDragons.size () - 2 )
                .sorted(
                        (x, y) -> ((Double) x.getPowerPerHead()).compareTo(y.getPowerPerHead())
                )
                .collect(Collectors.toList());
// Вывод полной мощности дракона , средней  огневой мощности,приходящейся на голову.
        for (
                int i = 1; i < (tmp.size() - 1); i++) {
            System.out.println(tmp.get(i) + " ,getFullPower = " + tmp.get(i).getFullPower() + " ,getPowerPerHead = " + tmp.get(i).getPowerPerHead());
        }

    }

    // Задание 4  В предыдущей записи (о функциональных интерфейсах и лямбда-выражениях) предлагалось реализовать
    // "пересборку" списка голов после регенерации (с использованием какой-либо удобной структуры данных).
    // Реализуйте эту "пересборку" средствами потоков данных (превратите список голов в поток данных,
    // примените к каждой голове процедуру регенерации, а после вновь соберите в список).

    private static void zadanie4PeresborkaSpiskagolovcherezPotokDannyh(List<FirebreathingDragon4LymbdaLymbda> newDragons) {


        int minKolGolov = 0;
        int maxKolGolov = 100;
        newDragons.stream().filter(dragon ->
                dragon.getFbHeadsCount() >= minKolGolov && dragon.getFbHeadsCount() <= maxKolGolov)
                .map(dragon -> dragon.name)
                .forEach(dragonName -> {
                    System.out.println(dragonName);
                });

        Function<Integer, List<FirebreathingDragon4LymbdaLymbda.FBHead>> addRandomFbHeads = (Integer maxKolHeads) -> {
            Random rnd = new Random();
            int kolHeads = rnd.nextInt(maxKolHeads);
            if (kolHeads > 0) {
                List<FirebreathingDragon4LymbdaLymbda.FBHead> newHeads = new ArrayList<>(kolHeads);
                while (newHeads.size() < kolHeads) {
                    newHeads.add(new FirebreathingDragon4LymbdaLymbda.FBHead(rnd.nextDouble() * 10,
                            rnd.nextInt(100) + 1));
                }
                return newHeads;
            }
            return Collections.emptyList();
        };

    }

    //  Задание 6
    //Выберите из потока дракона, имеющего максимальную (минимальную) среднюю огневую мощность, приходящуюся на голову.
    // Используйте метод max (min).

    private static void zadanie6(List<FirebreathingDragon4LymbdaLymbda> newDragons) {
        FirebreathingDragon4LymbdaLymbda minDragon = newDragons.stream()
                .min((dragon, dragon2) -> {
                    return dragon.getPowerPerHead() > dragon2.getPowerPerHead() ? 1 :
                            dragon.getPowerPerHead() < dragon2.getPowerPerHead() ? -1 : 0;
                }).get();
        FirebreathingDragon4LymbdaLymbda maxDragon = newDragons.stream()
                .max((dragon, dragon2) -> {
                    return dragon.getPowerPerHead() > dragon2.getPowerPerHead() ? 1 :
                            dragon.getPowerPerHead() < dragon2.getPowerPerHead() ? -1 : 0;
                }).get();

        System.out.println("Min power dragon: " + minDragon.getName());
        System.out.println("Max power dragon: " + maxDragon.getName());
    }


    //  Задание 7
//  Используя методы anyMatch, noneMatch и allMatch (соответственно), определите:
//1) есть ли в потоке такой дракон,суммарная огневая мощность голов  которого больше заранее заданной величины p;
//2) верно ли, что в потоке драконов нет ни одного, у которого нулевая суммарная огневая мощность голов;
//3) верно ли, что каждый дракон в потоке имеет среднюю огневую мощность голов, не меньшую заранее заданной величины ap.


    private static void zadanie7(List<FirebreathingDragon4LymbdaLymbda> newDragons) {
        int p = 100; // заданная величина для сравнения суммарной огневой мощности голов  и получения такого дракона на печать

// Решение
// Создаем тестовый класс testDragon ,связываем его с существующим потоком  newDragons.stream()
// Создаем новый список отсортированных драконов
// Присваиваем созданный тестовый класс  testDragon к новому списку отсортированных голов
// Проверяем, есть ли в потоке дракон дракон,суммарная огневая мощность голов  которого больше заранее заданной величины p
// используя метод anyMatch
// используя метод noneMatch
// используя метод  allMatch
// Вывод на экран результатов всех 3-х сравнений

        FirebreathingDragon4LymbdaLymbda testDragon = newDragons.stream().findAny().orElse(null);
        {

            //       ArrayList<FirebreathingDragon4LymbdaLymbda> testDragon = newDragons.stream()
            boolean any = newDragons.stream().anyMatch(s -> s.getFullPower() > p);

            boolean all = newDragons.stream().allMatch(s -> s.getFullPower() > 0);

            boolean none = newDragons.stream().noneMatch(s -> s.getPowerPerHead() < p);

            System.out.println("У какого-либо дракона getFullPower > p: " + any);
            System.out.println("нет ни одного, у которого нулевая суммарная огневая мощность голов: " + all);
            System.out.println("Каждый ли Дракон, getPowerPerHead > p: " + none);
        }
    }


// Задание 8
// С помощью метода reduce посчитайте количество драконов, у которых все головы имеют ненулевую огневую мощность.
// Запишите решение, использующее версию метода с одним параметром и версию метода с двумя параметрами.

    private static void zadanie8(List<FirebreathingDragon4LymbdaLymbda> newDragons) {

// Решение
// Создаем переменную testDragon ,связываем его с существующим потоком  newDragons.stream()
// Создаем новый список отсортированных драконов
// Присваиваем созданный тестовый класс  testDragon к новому списку отсортированных голов
// Проверяем через условие, есть ли в потоке дракон, у которых все головы имеют ненулевую огневую мощность.
// fbheads == 0
// через метод с одним параметром
// через метод с двумя параметрами
// Вывод на экран результата всех 2-х сравнений


        int testDragon; // количество драконов, у которых все головы имеют ненулевую огневую мощность.
        testDragon = newDragons.stream()
                .map(drag -> {
                    int headsNonZeroPerower = (int) drag.getFbheads().stream()
                            .filter(head -> head.getFirePower() != 0).count();
                    if (headsNonZeroPerower == drag.getFbHeadsCount()) {
                        return 1;
                    } else {
                        return 0;
                    }
                })
                .reduce((x, y) -> x + y)
                .orElse(0)
        ;

        System.out.println("Драконы, которые имеют ненулевую огневую мощность =  " + testDragon);

//    }

    }
// Задание 9
// Используя метод reduce, найдите в потоке дракона, у которого минимальная разность между максимальной огневой
// мощностью головы и минимальной огневой мощностью головы. Очень желательно использовать версию метода
//// с тремя параметрами.

    private static void zadanie9(List<FirebreathingDragon4LymbdaLymbda> newDragons) {


// Решение
// Создаем тестовый класс testDragon ,связываем его с существующим потоком  newDragons.stream()
// Создаем новый список отсортированных драконов
// Присваиваем созданный тестовый класс  testDragon к новому списку отсортированных голов


    }


//Задание 10
//Используя метод reduce, получите строку, состоящую из имён драконов, перечисленных через запятую.
// Имя дракона следует включать в строку только в том случае, если в нём отсутствует заранее заданный символ.
// Очень желательно использовать версию метода с тремя параметрами. Использование регулярных выражений приветствуется.

    private static void zadanie10(List<FirebreathingDragon4LymbdaLymbda> newDragons) {

        String stroka = "q";
        /*
        U = строка
        T - дракон

СТРОКА reduce(СТРОКА identity,
	 BiFunction<СТРОКА,? super ДРАКОН,СТРОКА> accumulator,
	 BinaryOperator<СТРОКА> combiner)

         */
        String dragonNames = newDragons.stream().reduce("" ,
                (laststring,dragon)-> laststring + (dragon.getName().contains(stroka) ? "":
                        "," + dragon.getName()),
                (name1,name2) -> name1 + "," + name2);


        System.out.println("Драконы : " + dragonNames);/// dragonName;
    }

//    //Задание 11
//    Используя метод summing, посчитайте суммарную огневую мощь драконов в потоке.

    private static void zadanie11(List<FirebreathingDragon4LymbdaLymbda> newDragons) {
        /*
items.stream()
  .mapToInt(x -> x.getPrice())
  .sum();
         */
        double sumHeadpower = newDragons.stream()
                .mapToDouble(x -> {
                    System.out.println ("Cуммарная мощность каждой головы - " + x.getFullPower());
                    return x.getFullPower();
                } )
                .sum();


        System.out.println("Cуммарная огневая мощь драконов : "   + sumHeadpower);
    }
    }

























