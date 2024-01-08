package poly.car0;

public class Driver {
    private K3Car k3;
    private Model3Car model3;

    public void setK3(K3Car k3) {
        this.k3 = k3;
    }
    public void setModel3(Model3Car model3) {
        this.model3 = model3;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다.");
        if(k3 != null) {
            k3.startEngine();
            k3.pressAcclerator();
            k3.offEngine();
        }else if(model3 != null) {
            model3.startEngine();
            model3.pressAccelerator();
            model3.offEngine();

        }
    }
}
