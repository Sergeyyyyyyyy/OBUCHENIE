import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;


public class Dragon4lymbda<localheads> {
    private static int count;
    private String name;
    private double powerPerHead;

    public Dragon4lymbda(int heads, String name, double pph) {
        this.heads = heads;
        this.name = name;
        powerPerHead = pph;
        count++;
    }

    public Dragon4lymbda() {
        heads = 3;
        name = "Goryynych";
        powerPerHead = 100;
        count++;
    }

    private List<FirebreathingDragon4LymbdaLymbda.FBHead> heads;

    public Supplier<Double> middlePowerPerHeadSupplier = () -> {
        if (heads != null && heads.size() > 0) {
            return heads.stream().mapToDouble(FirebreathingDragon4LymbdaLymbda.FBHead::getFirePower)
                    .average().orElse(0);
        }
        return null;
    };


        public List<FirebreathingDragon4LymbdaLymbda.FBHead> localheads = new List<FirebreathingDragon4LymbdaLymbda.FBHead>
        return localheads;
    }


    public double getPowerPerHead() {
        return powerPerHead;
    }

    public void setPowerPerHead(double pph) {
        this.powerPerHead = powerPerHead;
    }

    public List heads() {
        return heads;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFullPower() {
        return heads * powerPerHead;
    }

    public void changeHeads(int addh) {
        heads += addh;
    }

    @Override
    public String toString() {
        return "Dragon heads: " + heads + ", name: " + name + ", powerPerHead: " + powerPerHead;
    }

    public static int getCount() {
        return count;
    }

    private void addRandomHeads(int maxHeads) {
        Random rnd = new Random();
        this.heads += rnd.nextInt(maxHeads);
    }

    public void removedHead(int heads) {
        if (this.heads > heads) {
            this.heads -= heads;
            this.addRandomHeads(3);
        }
        heads

    }

}

