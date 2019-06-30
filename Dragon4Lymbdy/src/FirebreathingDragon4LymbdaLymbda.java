import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;

// для задачи №5
public class FirebreathingDragon4LymbdaLymbda extends Dragon4lymbda implements Flyable, FireBreathable {


    private int wings = 0;

    @Override
    public int getWings() {
        return wings;
    }

    // Для 5 задачи
    public static class FBHead {

        private double firePower;
        private int rechargeTime;

        public FBHead(double firePower, int rechargeTime) {
            this.firePower = firePower;
            this.rechargeTime = rechargeTime;
        }

        public String toString() {
            return "[" + firePower + ": " + rechargeTime + "]";
        }

        double getFirePower() {
            return firePower;
        }

        void setFirePower(double fp) {
            firePower = fp;
        }

        //  функциональный интерфейс можно использовать для метода установки огневой мощи и времени перезарядки отдельной головы дракона.
        public Consumer<Double> setFirePowerConsumer = (Double fp) -> firePower = fp;

        int getRechargeTime() {
            return rechargeTime;
        }

        void setRechargeTime(int rt) {
            rechargeTime = rt;
        }

        //  функциональный интерфейс можно использовать для метода установки огневой мощи и времени перезарядки отдельной головы дракона.
        public Consumer<Integer> setrechargeTime2 = (Integer rt) -> rechargeTime = rt;
    }

    private List<FBHead> fbheads;

    public Supplier<Double> middlePowerPerHeadSupplier = () -> {
        if (fbheads != null && fbheads.size() > 0) {
            return fbheads.stream().mapToDouble(FBHead::getFirePower)
                    .average().orElse(0);
        }
        return null;
    };

    public Supplier<Double> fullPowerAllHeadSupplier = () -> {
        if (fbheads != null && fbheads.size() > 0) {
            return fbheads.stream().mapToDouble(FBHead::getFirePower)
                    .sum();
        }
        return null;
    };

    private class FBIterator implements Iterator<FBHead> {

        private int nextIndex = 0;

        public boolean hasNext() {
            return (nextIndex < getHeads() - 1 && fbheads.get(nextIndex).firePower > 0);
        }

        private int getHeads() {
            return 0;
        }

        public FBHead next() {
            if (fbheads.size() > nextIndex) {
                FBHead value = fbheads.get(nextIndex);
                nextIndex++;
                return value;
            }
            return null;
        }
    }

    public FirebreathingDragon4LymbdaLymbda(double minHeadPower, double maxHeadPower, int minRestorPower, int maxRestorPower) {
        // 1 конструктор должен принимать в качестве параметров нижнее и верхнее значение огневой мощи головы,
        // а также нижнее и верхнее значение времени восстановления огневой мощи.
        // но в заданных диапазонах.
        // Значения огневой мощи и времени восстановления огневой мощи при создании голов дракона должны генерироваться по-прежнему случайным образом,
        super();


        fbheads = new ArrayList<FBHead>(heads);
        Random rnd = new Random();
        for (int i = 0; i < heads; i++) {
            fbheads.add(new FBHead((maxHeadPower - minHeadPower) * rnd.nextDouble() * 10,
                    (maxRestorPower - minRestorPower) * rnd.nextInt(100) + 1));
        }
    }

    public FirebreathingDragon4LymbdaLymbda(int rt, int... headerFirePower) {
        // 2 конструктор должен принимать в качестве параметров время восстановления огневой мощи (одинаковое для всех голов)
        // и список значений огневой мощи (последовательность вещественных значений в порядке нумерации голов).
        super();
        heads = headerFirePower.length;
        fbheads = new ArrayList<FBHead>(heads);
        for (int power : headerFirePower) {

            fbheads.add(new FBHead(power, rt));
        }
    }


    public FirebreathingDragon4LymbdaLymbda(List<FBHead> spisokpar) {
        // 3 конструктор  должен принимать в качестве параметра список пар вида вещественное число, целое число,
        // обозначающих огневую мощь и время её восстановления. Определите для такой пары новый статический вложенный класс (класс FBHead мы ещё будем дорабатывать;
        // этот же класс потребуется только для ввода данных)
        super();
        heads = spisokpar.size();
        fbheads = new ArrayList<FBHead>(heads);
        for (FBHead head : spisokpar) {
            fbheads.add(head);
        }
    }


    public FirebreathingDragon4LymbdaLymbda(String name, int heads) {
        super(heads, name, 0);
        fbheads = new ArrayList<FBHead>(heads);
        Random rnd = new Random();
        for (int i = 0; i < heads; i++) {
            fbheads.add(new FBHead(rnd.nextDouble() * 10, rnd.nextInt(100) + 1));
        }
    }

    public double getPowerPerHead() {
        return getFullPower() / getHeads();
    }

    public double getMaxPowerPerHead() {
        double maxHeadpower = 0;
        for (FBHead fbh : fbheads) {
            maxHeadpower = Math.max(maxHeadpower,fbh.firePower);
        }
        return maxHeadpower;

    }


    public double getFullPower() {  // общая суммарная мощность
        double fullp = 0;
        for (FBHead fbh : fbheads) {
            fullp += fbh.firePower;
        }
        return fullp;
    }

    public FBHead getHead(int index) {
        return fbheads.get(index);
    }

    public void setHead(int index, double fp, int rt) {
        fbheads.get(index).setFirePowerConsumer.accept(fp);
        fbheads.get(index).setrechargeTime2.accept(rt);

    }

    public int getFbHeadsCount() {
        return fbheads != null ? fbheads.size() : 7;
    }

    public void printActiveHeads() {
        Iterator<FBHead> iterator = new FBIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(String.format("Имя: %s\nГоловы: %s\nМощность на голову: %s",
                name, heads, powerPerHead));

    }

    private Function<Integer, List<FBHead>> addRandomFbHeads = (Integer maxKolHeads) -> {
        Random rnd = new Random();
        int kolHeads = rnd.nextInt(maxKolHeads);
        if (kolHeads > 0) {
            List<FBHead> newHeads = new ArrayList<>(kolHeads);
            while (newHeads.size() < kolHeads) {
                newHeads.add(new FBHead(rnd.nextDouble() * 10,
                        rnd.nextInt(100) + 1));
            }
            return newHeads;
        }
        return Collections.emptyList();
    };

    @Override
    public void removedHead2(int heads) {
        // 1. Передаем голову после регенерции, по нндексу в метод "removedHead2"
        // 2. Задаем поток данных
        // 3. Превращаем список голов в поток данных
        // 4. Реализовать "пересборку" голов, средствами потоков данных (превратите список голов в поток данных
        // 5. Для решения 4 задания:
        // В предыдущей записи (о функциональных интерфейсах и лямбда-выражениях) предлагалось реализовать
        // "пересборку" списка голов после регенерации (с использованием какой-либо удобной структуры данных).
        // Реализуйте эту "пересборку" средствами потоков данных (превратите список голов в поток данных,
        // примените к каждой голове процедуру регенерации, а после вновь соберите в список).

//  как работал старый метод:
//  объявляем все головы драконов в новом методе removedHead2 через переменную " heads", которая "protected int heads;"
//  в родительском классе
//  присваиваем объектам драконам метод регенерации голов2 - (dragon.removedHead2(0);)
//  выводим на печать новое кол-во голов : (System.out.println("Новое кол-во голов =  " + dragon.getHeads());)
//
//  задаем условие: если конструктор регененрированных голов больше прежних голов то:
//                  конструктор регененрированные головы меньше или равны значениям прежних голов
//                  вызываем конструктор, "private" метода, добавления случайных голов (до 5 голов), который находится
//   в родительском классе;
//   Болеее подробно о методе "private void addRandomHeads(int maxHeads)":
//   Создаем ссылку "rnd", объекта "Random" -     Random rnd = new Random();
//   вызываем конструктор "addHeads"  для добавления голов, ссылка "rnd" указывает на
//   чтение следующей головы : this.addHeads.apply(this.heads, rnd.nextInt(maxHeads));
//   опять вызываем конструктор голов "heads" для получения случайного значения кол-ва голорв , которые нужно добавить
//        this.heads += rnd.nextInt(maxHeads);
//
        int maxCOuntOHrsfd =  3;

        Random rnd = new Random() ;
        fbheads = fbheads.stream().flatMap(head -> {
            List<FBHead> result = new ArrayList<>();
            int headsCount = rnd.nextInt(maxCOuntOHrsfd);
            for (int i =0; i <= headsCount;i++) {
                FBHead newHead = new FBHead(14, 45);
                result.add(newHead);
            }
            return result.stream();
        } ).collect(Collectors.toList());
        System.out.println("Новый список регенерированных голов = " + fbheads);

    }

    public void removeHead() {
        if (fbheads == null || fbheads.size() == 0) {
            return;
        }
// Для 4 задачи
        Random rnd = new Random();
        int removeHeadIndex = rnd.nextInt(fbheads.size());
        fbheads.remove(removeHeadIndex);
        fbheads.addAll(removeHeadIndex, this.addRandomFbHeads.apply(7));
    }

    public List<FBHead> getFbheads() {
        return fbheads;
    }
}
