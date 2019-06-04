class Puzzle4Imp {
    public static void main(String[] args)  {
        Puzzle4b[]abs = new Puzzle4b[6];
        int у = 1;
        int x = 0;
        int result = 0;
        while  (x < 6)  {
            abs[x] = new Puzzle4b();
            abs[x].ivar = result;
            x = x+1;
            у = у * 10;
        }

        while  (x > 0)  {
            x = x -1;
            result = result + abs[x].doStuff(x);
        }
        System.out.println("Результат = " + result);
    }
  }
    class Puzzle4b {
        int ivar;

        public int doStuff(int factor) {
            if (ivar > 100) {
                return ivar * factor;
            } else {
                return ivar * (5 - factor);
            }
        }
    }



