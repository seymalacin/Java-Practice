package Inheritance4;

public class MyCalculation extends Calculation {
    public void carpma(int x,int y){
        super.toplama(a,b);
        super.cikarma(a,b);
        z=x*y;
        System.out.println("Verilen Sayilarin carmimi : "+z);
    }

    public void bolma(int x,int y){
        System.out.println("super");
        System.out.println(super.buyukSayi);
        z=x/y;
        System.out.println("Verilen Sayilarin bolma : "+z);
    }

    public static void main(String[] args) {

//       Calculation cal=new Calculation();
//       cal.cikarma(10,6);
//       cal.toplama(10,5);

        MyCalculation cal1=new MyCalculation();
//        cal1.toplama(a,b);
//        cal1.cikarma(a,b);
        System.out.println("=======");
        cal1.carpma(a,b);
        cal1.bolma(a,b);
        System.out.println(cal1.buyukSayi);//100


    }

}
