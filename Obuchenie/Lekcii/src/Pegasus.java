
class Pegasus extends Horse implements Flying, Mythical {
    void print() {
        System.out.println(
                whoIam());
    }
    public String whoIam() {
        String res = "I am Pegasus";
        res +=" ";
        res+=  Flying.super.whoIam();
        res+= Mythical.super.whoIam();
        return res;
    }

    public static void main(String[] args) {
        Pegasus p = new Pegasus();
        p.print();
    }
}

class Horse {
     public String whoIam() {
        return "I am a horse";
    }
}

interface Flying {
     default String whoIam() {
        return "I am flying";
    }
}

interface Mythical {
    default String whoIam() {
        return " I am a mythical sozdanie";


    }
}
