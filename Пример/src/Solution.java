import java.util.ArrayList;
public class Solution {
    public static void main(String[] args) {
        ArrayList<Boolean> list =  new ArrayList<Boolean>();
        list.add(true);
        list.add(false);
        for (Boolean a : list) {
            for (Boolean b : list) {
                for (Boolean c : list) {
                    for (Boolean d : list) {
                        if(booleanExpression(a,b,c,d)) {
                            System.out.println("a = [" + a.booleanValue() + "],b = [" + b.booleanValue() + "],c = [" + c.booleanValue() + "],d = [" + d.booleanValue() + "]");
                        }
                    }
                }
            }
        }
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return a & b & c & d;
    }
}
