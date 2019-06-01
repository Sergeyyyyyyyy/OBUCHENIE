public class FlyingDragon extends Dragon3 implements Flyable,FireBreathable{

    private int wings;

    @Override
    public void setHead(int index, double fp, int rt) {

    }

    public FlyingDragon() {
        super ();
        wings = 2;
    }

    public FlyingDragon(String name, int heads, int wings, double pph) {
        super ( name, heads, pph );
        this.wings = wings;
    }

    public FlyingDragon(String name, int wings) {
        this.heads = 1;
        this.powerPerHead = 0;
    }

    public FlyingDragon(int heads, int wings) {
        super (" ", heads, wings );
        this.name = "Dragon " + this.id;
        this.powerPerHead = 12.5;
    }


    public int getWings() {
        return wings;
    }

    public String toString() {
        System.out.println ( String.format ( "Имя: %s\nГоловы: %s\nКрылья: %s\nМощность на голову: %s\nПорядковый номер: %s",
                name, heads, wings, powerPerHead, numberOfDragons ) );

        return super.toString () + " {" + wings + "}";
    }


}
