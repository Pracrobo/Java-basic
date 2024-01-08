package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3(k3Car);
        driver.drive();

        Model3Car model3Car = new Model3Car();
        driver.setK3(null);
        driver.setModel3(model3Car);
        driver.drive();

    }
}
