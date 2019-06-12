import java.util.Random;
import java.util.function.Predicate.*;
import java.util.function.Consumer.*;
import java.util.function.Supplier.*;
import java.util.function.*;
import java.util.function.UnaryOperator.*;
import java.util.function.BinaryOperator.*;

public class Dragon4 {

    public static void main(String... args) {

    }

    protected int heads;
    protected String name;
    protected double powerPerHead;

    protected int id;
    protected static int numberOfDragons = 0;

    public Dragon4() {
        this.heads = 1;
        name = "Obychnyi";
        powerPerHead = 10.0;
        id = ++numberOfDragons;
    }

    public Dragon4(String name, int heads, double pph) {
        this.heads = heads;
        this.name = name;
        this.powerPerHead = pph;
        id = ++numberOfDragons;
    }

    public int getHeads() {
        return heads;
    }

    protected void setHeads(int heads) {
        this.heads = heads;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPowerPerHead() {
        return powerPerHead;
    }

    public void changePowerPerHead(double add) {
        powerPerHead += add;
    }

    public double getFullPower() {
        return powerPerHead * heads;
    }

    public int getID() {
        return id;
    }

    public String toString() {
        return name + " (" + id + ") [" + heads + ": " + getFullPower () + "]";
    }

    public static int getNumberOfDragons() {
        return numberOfDragons;
    }

    private void addRandomHeads(int maxHeads) {
        Random rnd = new Random (  );
        this.heads += rnd.nextInt(maxHeads);
    }

    public void removedHead(int heads) {
        if (this.heads > heads) {
            this.heads -= heads;
            this.addRandomHeads ( 3 );
        }
    }



}
