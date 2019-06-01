public class FlyingDragon extends Dragon {
    private int speed;

    public FlyingDragon(int heads, String name, double pph, int speed) {
        super(heads, name, pph);
        this.speed = speed;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed: " + speed;
    }
}
