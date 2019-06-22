import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// для решения задач по СтримАпи
public class TestclassStreamApi10dgagons {

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

        FirebreathingDragon4LymbdaLymbda drag5 = new FirebreathingDragon4LymbdaLymbda(35, 57, 56, 78, 7, 85);
        drag5.setHead(4, 51, 67);
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
        zadanie5PeresborkaSpiskagolovcherezPotokDannyh(newDragons);

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
                .skip(1)
                .limit(newDragons.size() - 2)
                .sorted(
                        (x, y) -> ((Double) x.getPowerPerHead()).compareTo(y.getPowerPerHead())
                )
                .collect(Collectors.toList());
        tmp.forEach(dragon -> {
            System.out.println(dragon + ",getFullPower = " + dragon.getFullPower());
        });
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
        // задаем 2 метод регенерации голов
        // 1. Записать в переменную первого дракона из списка драконов ?
        // 2. Вывести на печать текущее кол-во голов
        // 3. Произвести регенерацию головы
        // 5. Посчитать сколько получилось "новых голов" и вывести на печать

        FirebreathingDragon4LymbdaLymbda dragon = newDragons.get(0);
        //
        System.out.println("Текущее кол-во голов =  " + dragon.getHeads());
        //

        dragon.removedHead2(0);
        System.out.println("Новое кол-во голов =  " + dragon.getHeads());
    }




    // Задание 5 Выберите из потока данных драконов, имеющих не менее заданного количества голов.
    // Примените к случайно выбранной голове каждого такого дракона процедуру регенерации.
    // Посчитайте среднее количество голов, приходящееся на дракона, и выведите это число на печать.

    private static void zadanie5PeresborkaSpiskagolovcherezPotokDannyh(List<FirebreathingDragon4LymbdaLymbda> newDragons) {

        int kolgolov = 10;


        int srednyykolvogolov = newDragons.stream()
                .filter(dragon -> dragon.getHeads() <= kolgolov)
                .mapToInt(dragon -> {
                    //    dragon.

                    final int minA = 0; // Минимальное число для диапазона
                    final int maxB = dragon.getHeads() - 1;
                    int index = (int) rnd(minA, maxB);
                    FirebreathingDragon4LymbdaLymbda.FBHead golova = dragon.getHead(index);
                    dragon.removedHead(index);


                    System.out.println(dragon.name + dragon.getFbHeadsCount());
                    return dragon.getFbHeadsCount();

                })
                .sum() / newDragons.size();
        System.out.println("среднее количество голов, приходящееся на дракона " + srednyykolvogolov);
        ;

    }
}




































