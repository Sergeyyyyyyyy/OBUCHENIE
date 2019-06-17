import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// для решения задач по СтримАпи
public class TestclassStreamApi10dgagons {
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
//        zadanie№1ProverkaDragondsonHeads(newDragons);
        zadanie2SortirovkaDragondspoUbyvaniu(newDragons);
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
}