import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FirebreathingDragon4 extends Dragon4 implements Flyable, FireBreathable {


    private int wings = 0;

    @Override
    public int getWings() {
        return wings;
    }


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

        public Consumer<Double> setFirePowerConsumer = (Double fp) -> firePower = fp;

        int getRechargeTime() {
            return rechargeTime;
        }

        void setRechargeTime(int rt) {
            rechargeTime = rt;
        }

        public Consumer <Integer> setrechargeTime2 = (Integer rt) ->  rechargeTime = rt;
    }



    private ArrayList<FBHead> fbheads;

    public Supplier<Double> middlePowerPerHeadSupplier = () -> {
        if (fbheads != null && fbheads.size () > 0) {
           return fbheads.stream ().mapToDouble (FBHead::getFirePower)
                    .average ().orElse ( 0 );
        }
        return null;
    };

    public Supplier<Double> fullPowerAllHeadSupplier = () -> {
        if (fbheads != null && fbheads.size () > 0) {
            return fbheads.stream ().mapToDouble (FBHead::getFirePower)
                    .sum ();
        }
        return null;
    };

    private class FBIterator implements Iterator<FBHead> {

        private int nextIndex = 0;

        public boolean hasNext() {
            return (nextIndex < getHeads() - 1 && fbheads.get(nextIndex).firePower > 0);
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

    public FirebreathingDragon4(double minHeadPower, double maxHeadPower, int minRestorPower, int maxRestorPower) {
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

    public FirebreathingDragon4(int rt, int... headerFirePower) {
        // 2 конструктор должен принимать в качестве параметров время восстановления огневой мощи (одинаковое для всех голов)
        // и список значений огневой мощи (последовательность вещественных значений в порядке нумерации голов).
        super();
        heads = headerFirePower.length;
        fbheads = new ArrayList<FBHead>(heads);
        for (int power : headerFirePower) {
            fbheads.add(new FBHead(power, rt));
        }
    }


    public FirebreathingDragon4(List<FBHead> spisokpar) {
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


    public FirebreathingDragon4(String name, int heads) {
        super(name, heads, 0);
        fbheads = new ArrayList<FBHead>(heads);
        Random rnd = new Random();
        for (int i = 0; i < heads; i++) {
            fbheads.add(new FBHead(rnd.nextDouble() * 10, rnd.nextInt(100) + 1));
        }
    }

    public double getPowerPerHead() {
        return getFullPower() / getHeads();
    }



    public double getFullPower() {
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
        fbheads.get(index).setFirePowerConsumer.accept (fp);
        fbheads.get(index).setrechargeTime2.accept ( rt );

    }

    public void printActiveHeads() {
        Iterator<FBHead> iterator = new FBIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(String.format("Имя: %s\nГоловы: %s\nМощность на голову: %s\nПорядковый номер: %s",
                name, heads, powerPerHead, numberOfDragons));

    }
}