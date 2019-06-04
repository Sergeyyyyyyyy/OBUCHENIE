import java.util.Scanner;

public class ProblemA {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        char[] string = sc.next().toCharArray();

        int black = 0;
        int green = 0;
        int coffee = 0;

        String number = "";

        for(int i = 0; i < string.length; i++) {
            char p = string[i];
            if(!Character.isLetter(p)) {
                number += p;
            } else {
                if(p == 'B') black += Integer.parseInt(number);
                if(p == 'G') green += Integer.parseInt(number);
                if(p == 'C') coffee += Integer.parseInt(number);
                number = "";
            }
        }

        System.out.println(black);
        System.out.println(green);
        System.out.println(coffee);

    }

}