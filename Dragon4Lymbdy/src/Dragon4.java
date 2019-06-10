import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;



public class Dragon4   {
        private static int count;

        private int heads;
        private String name;
        private double powerPerHead;

        public Dragon4(int heads, String name, double pph) {
            this.heads = heads;
            this.name = name;
            powerPerHead = pph;
            count++;
        }

        public Dragon4() {
            heads = 3;
            name = "Goryynych";
            powerPerHead = 100;
            count++;
        }


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

        public static int getCount(){
            return count;
        }

}

