import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class Dragon4lymbda<localheads> {
    private static int count; // для чего этот счетчик?
    public String name;
    public double powerPerHead;
    private Random rnd;
    private int maxKolHeads;

    public Dragon4lymbda(int heads, String name, double pph) {
        this.heads = new ArrayList<>(heads);
        this.name = name;
        powerPerHead = pph;
        count++;
    }

    public Dragon4lymbda() {
        heads = new ArrayList<>(3);
        name = "Goryynych";
        powerPerHead = 100;
        count ++;
    }


    public List<FBHead> heads;

    public Supplier<Double> middlePowerPerHeadSupplier = this::get;


    public List<FirebreathingDragon4LymbdaLymbda.FBHead> getkolHeads() {
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
    }

    ;
//    public void removeHead() {
//        boolean fbheads = false;
//        if (fbheads == null || fbheads.size () == 0) {
//            return;
//        }
//
//        Random rnd = new Random();
//        int removeHeadIndex;
//        removeHeadIndex = rnd.nextInt ( fbheads.size () );
//        fbheads.remove ( removeHeadIndex );
//        fbheads.addAll ( removeHeadIndex, this.addRandomFbHeads.apply ( 10 ) );
//
//    }


    public double getPowerPerHead() {
        return powerPerHead;
    }

    public void setPowerPerHead(double pph) {
        this.powerPerHead = powerPerHead;
    }

    public List<FBHead> heads() {
        return heads;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFullPower() {
        return  heads.size() * powerPerHead;
    }

//    public void changeHeads(int addh) {
//        heads += addh;
//    }

    @Override
    public String toString() {
        return "Dragon heads: " + heads + ", name: " + name + ", powerPerHead: " + powerPerHead;
    }

    public static int getCount() {
        return count;
    }

    private void addRandomHeads(int maxHeads) {
        Random rnd = new Random();
        int случайноеКоличествоГоловКотороеНеобходимоДобавить = rnd.nextInt(maxHeads);
        this.heads += случайноеКоличествоГоловКотороеНеобходимоДобавить; //
        for (int i=0;i<случайноеКоличествоГоловКотороеНеобходимоДобавить;i++) {
            вызвать конструктор класса , создать новую голоу, добавить в список голов
            adds.heads

                    число = список   // число привести к списку
        }
    }

    public void removedHead(int индексГоловыКоторуюХочуУдалить) {
        if (this.heads.size() > индексГоловыКоторуюХочуУдалить && индексГоловыКоторуюХочуУдалить >= 0) {
            this.heads.remove(индексГоловыКоторуюХочуУдалить);

            this.addRandomHeads(3);
        }


    }

    private Double get() {
        if (heads != null && heads.size() > 0) {
            return heads.stream().mapToDouble(FBHead::getFirePower)
                    .average().orElse(0);
        }
        return null;
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
}

