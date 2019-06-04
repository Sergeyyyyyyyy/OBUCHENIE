import java.util.Scanner;

public class TwoDirections {

    public static void main(String[] args) {
        ManyProblems mp = new ManyProblems();
        mp.solve();
        mp.print();
    }

}

class ManyProblems {

    ManyProblems() {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        t = in.nextInt();

        p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = in.nextInt();
        }

        in.close();
    }

    int leftToRight() {
        int idx = 0;
        int currentTime = 0;

        while ((idx < n) && (currentTime + p[idx] <= t)) {
            currentTime += p[idx++];
        }

        return idx;
    }

    int rightToLeft() {
        int res = 0;
        int currentTime = 0;

        for (int i = n-1; i >= 0; i--) {
            if (currentTime + p[i] <= t) {
                currentTime += p[i];
                res++;
            }
            else {
                break;
            }
        }

        return res;
    }

    void solve() {
        answer = "Left to Right";
        ans = leftToRight();
        int b = rightToLeft();
        if (b > ans) {
            ans = b;
            answer = "Right to Left";
        }
    }

    void print() {
        System.out.println(answer);
        System.out.println(ans);
    }

    String answer;
    int ans;

    int n;
    int t;
    int[] p;

}

