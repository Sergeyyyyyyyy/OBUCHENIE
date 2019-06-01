package interfaced;

public interface Flying {
    int getWings();
    double getPowerPerHead();
    double getFullPower();
    void setHead(int index, double fp, int rt);
    void printActiveHeads();
}
