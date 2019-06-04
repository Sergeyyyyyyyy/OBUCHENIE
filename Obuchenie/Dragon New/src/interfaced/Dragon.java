package interfaced;

public class Dragon {


    protected int heads;
    protected String name;
    protected double powerPerHead;

    protected int id;
    protected static int numberOfDragons = 0;

    public Dragon() {
        this.heads = 1;
        name = "Obychnyi";
        powerPerHead = 10.0;
        id = ++numberOfDragons;
    }

    public Dragon(String name, int heads, double pph) {
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
}
