public class Main {
    public static void main(String[] args) {
        System.out.println(Car.counter);
        Car c1 = new Car(2013, "AUDI");
        Car c2 = new Car(2011, "Toyota");
        System.out.println(Car.counter);
        c1.drive();
        Car.addition(8, 9);
    }
}
