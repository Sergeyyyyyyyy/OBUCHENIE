package interfaced;

public interface FireBreathing {
    double getPowerPerHead();
    double getFullPower();
    void setHead(int index, double fp, int rt);
    void printActiveHeads();
}
