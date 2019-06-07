public class FlyingDragon4Plus extends FlyingDragon4 implements FlyablePlus {

    FDwing left = new FDwing(Sides.LEFT, 1);
    FDwing right = new FDwing(Sides.RIGHT,1);

    @Override
    public void setLeftWing(int razmah) {
          left.razmah = razmah;
    }

    @Override
    public void setRightWing(int razmah) {
           right.razmah = razmah;
    }


    @Override
    public void setWings() {

    }

    public static class  FDwing {
        Sides storona;
        int razmah;

        public FDwing(Sides storona, int razmah) {
            this.storona = storona;
            this.razmah = razmah;
        }
    }
}
