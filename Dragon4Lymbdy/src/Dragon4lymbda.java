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

// для задачи № 4
public class Dragon4lymbda<localheads> {
    private static int count;
    protected String name;
    protected double powerPerHead;

    // 4. Реализовать "пересборку" голов, средствами потоков данных (превратите список голов в поток данных
    // 5. Для решения 4 задания:
    // В предыдущей записи (о функциональных интерфейсах и лямбда-выражениях) предлагалось реализовать
    // "пересборку" списка голов после регенерации (с использованием какой-либо удобной структуры данных).
    // Реализуйте эту "пересборку" средствами потоков данных (превратите список голов в поток данных,
    // примените к каждой голове процедуру регенерации, а после вновь соберите в список).

    public void removedHead2(int heads) {

        if (this.heads > heads) {
            this.heads -= heads;
            this.addRandomHeads(5);
        }



    }

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

    }

    protected int heads;

    public double getPowerPerHead() {
        return powerPerHead;
    }

    public void setPowerPerHead(double pph) {
        this.powerPerHead = powerPerHead;
    }

    public int getHeads() {
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

    // действие дракона, которое могло бы быть описано посредством метода функционального интерфейса BinaryOperator.
    private BinaryOperator<Integer> addHeads = (Integer prevHeads, Integer newHeads) -> prevHeads + newHeads;

    private void addRandomHeads(int maxHeads) {
        Random rnd = new Random();
        this.addHeads.apply(this.heads, rnd.nextInt(maxHeads));
        this.heads += rnd.nextInt(maxHeads);
    }

    public void removedHead(int heads) {
        if (this.heads > heads) {
            this.heads -= heads;
            this.addRandomHeads(3);
        }


    }

}

