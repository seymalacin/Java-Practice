package poymorphism4;

public class Corolla extends Araba {
    @Override
    public   void motor() {
        System.out.println("Corolla araclar cevreci motor kullanir");
    }

    @Override
    public void yakitTuketimi() {
        System.out.println("Corolla 5.6 lt yakit tuketir");
    }

    @Override
    public int multiply(int a, int b, int c) {
        return a*b*c+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b;
    }

    @Override
    public Corolla Speed() {
        return new Corolla();
    }
}
