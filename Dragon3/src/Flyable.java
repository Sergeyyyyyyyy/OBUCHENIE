
    public interface Flyable {
        default int getWings() {
            return 2;
        }

        default void setWings() {

        }

        static boolean isWingsOdd(int wings) {
            return wings % 2 == 0;

        }

    }



