package interfaced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class FirebreathingDragon extends Dragon implements FireBreathing {

    static class FBHead {

        private double firePower;
        private int rechargeTime;

        FBHead(double firePower, int rechargeTime) {
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
            return (nextIndex < getHeads () - 1 && fbheads.get ( nextIndex ).firePower > 0);
        }

        public FBHead next() {
            if (fbheads.size () > nextIndex) {
                FBHead value = fbheads.get ( nextIndex );
                nextIndex++;
                return value;
            }
            return null;
        }
    }

    public FirebreathingDragon(String name, int heads) {
        super ( name, heads, 0 );
        fbheads = new ArrayList<FirebreathingDragon.FBHead> ( heads );
        Random rnd = new Random ();
        for (int i = 0; i < heads; i++) {
            fbheads.add ( new FBHead ( rnd.nextDouble () * 10, rnd.nextInt ( 100 ) + 1 ) );


            public FirebreathingDragon ( double pph, int rt){
                // 1 конструктор должен принимать в качестве параметров нижнее и верхнее значение огневой мощи головы,
                // а также нижнее и верхнее значение времени восстановления огневой мощи.
                // Значения огневой мощи и времени восстановления огневой мощи при создании голов дракона должны генерироваться по-прежнему случайным образом,
                // но в заданных диапазонах.
                super ( pph, rt );
                this.pph = pph;
                this.rt = rt;
                pph = new ArrayList<interfaced.FirebreathingDragon.FBHead> ( heads );
                Random pph = new Random ();
                for (int i = 0; i < heads; i++) {
                    pph.add ( new FBHead ( rnd.nextDouble () * 10, rnd.nextInt ( 100 ) + 1 ) );



            public FirebreathingDragon ( int rt, ArrayList<double pph> ){
                // 2 конструктор должен принимать в качестве параметров время восстановления огневой мощи (одинаковое для всех голов)
                // и список значений огневой мощи (последовательность вещественных значений в порядке нумерации голов).
                    super ( rt, pph );
                    this.rt = rt;


            public FirebreathingDragon ( HashMap<powerPerHead, rt>){
                // 3 конструктор  должен принимать в качестве параметра список пар вида вещественное число, целое число,
                // обозначающих огневую мощь и время её восстановления. Определите для такой пары новый статический вложенный класс (класс FBHead мы ещё будем дорабатывать;
                        // этот же класс потребуется только для ввода данных)
                    super ( pph, rt );
                    this.pph = pph;


                    }
                }

                public double getPowerPerHead () {
                    return getFullPower () / getHeads ();
                }

                public double getFullPower () {
                    double fullp = 0;
                    for (FBHead fbh : fbheads) {
                        fullp += fbh.firePower;
                    }
                    return fullp;
                }

                public FBHead getHead ( int index){
                    return fbheads.get ( index );
                }

                public void setHead ( int index, double fp, int rt){
                    fbheads.get ( index ).setFirePower ( fp );
                    fbheads.get ( index ).setRechargeTime ( rt );
                }

                public void printActiveHeads () {
                    Iterator<FBHead> iterator = new FBIterator ();
                    while (iterator.hasNext ()) {
                        System.out.println ( iterator.next () );
                    }
                    System.out.println ( String.format ( "Имя: %s\nГоловы: %s\nМощность на голову: %s\nПорядковый номер: %s",
                            name, heads, powerPerHead, numberOfDragons ) );

                }
            }