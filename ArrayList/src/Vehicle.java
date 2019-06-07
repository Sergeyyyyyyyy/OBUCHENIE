public class Vehicle {
    public static void main(String[] args) {
        Vehicle[] v = new Car[5];
        Vehicle test = new Vehicle();
     //   test.setVehicles ( v );
        test.setVehicles2 (v );
        test.setVehicles3 ( (Car[])v );
    }
    public void setVehicles(Vehicle c[]) {
        c[0] = new Vehicle();
    }
    public void setVehicles2(Vehicle c[]) {
        if (c[0] instanceof Vehicle) {
            c[0] = new Vehicle();
        }
    }
    public void setVehicles3(Car c[]) {
        if (c[0] instanceof Car) {
            c[0] = new Car();
        }
    }
}
class Car extends Vehicle{}


























