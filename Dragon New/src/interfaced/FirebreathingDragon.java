package interfaced;

import java.util.*;

public class FirebreathingDragon extends Dragon implements FireBreathing {

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

        int getRechargeTime() {
            return rechargeTime;
        }

        void setRechargeTime(int rt) {
            rechargeTime = rt;
        }
    }

    private ArrayList<FBHead> fbheads;

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

    public FirebreathingDragon(double minHeadPower, double maxHeadPower, int minRestorPower, int maxRestorPower) {
        // 1 конструктор должен принимать в качестве параметров нижнее и верхнее значение огневой мощи головы,
        // а также нижнее и верхнее значение времени восстановления огневой мощи.
        // но в заданных диапазонах.
        // Значения огневой мощи и времени восстановления огневой мощи при создании голов дракона должны генерироваться по-прежнему случайным образом,
        super();
        fbheads = new ArrayList<FirebreathingDragon.FBHead>(heads);
        Random rnd = new Random();
        for (int i = 0; i < heads; i++) {
            fbheads.add(new FBHead((maxHeadPower - minHeadPower) * rnd.nextDouble() * 10,
                    (maxRestorPower - minRestorPower) * rnd.nextInt(100) + 1));
        }
    }

    public FirebreathingDragon(int rt, int... headerFirePower) {
        // 2 конструктор должен принимать в качестве параметров время восстановления огневой мощи (одинаковое для всех голов)
        // и список значений огневой мощи (последовательность вещественных значений в порядке нумерации голов).
        super();
        heads = headerFirePower.length;
        fbheads = new ArrayList<FirebreathingDragon.FBHead>(heads);
        for (int power : headerFirePower) {
            fbheads.add(new FBHead(power, rt));
        }
    }


    public FirebreathingDragon(List<FBHead> spisokpar) {
        // 3 конструктор  должен принимать в качестве параметра список пар вида вещественное число, целое число,
        // обозначающих огневую мощь и время её восстановления. Определите для такой пары новый статический вложенный класс (класс FBHead мы ещё будем дорабатывать;
        // этот же класс потребуется только для ввода данных)
        super();
        heads = spisokpar.size();
        fbheads = new ArrayList<FirebreathingDragon.FBHead>(heads);
        for (FBHead head : spisokpar) {
            fbheads.add(head);
        }
    }


    public FirebreathingDragon(String name, int heads) {
        super(name, heads, 0);
        fbheads = new ArrayList<FirebreathingDragon.FBHead>(heads);
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
        fbheads.get(index).setFirePower(fp);
        fbheads.get(index).setRechargeTime(rt);
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