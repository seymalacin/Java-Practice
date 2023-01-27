package Inheritance4;

public class Child extends Parent{

    Child(){
        super();
        System.out.println("Child parametersiz cons .calsiti");
    }


    Child(int say1){
        super(14);
        System.out.println("Child  1 parameterli cons .calsiti");
    }

    Child(int say2,int sayi3) {
        super(14, 15);
        System.out.println("Child  2 parameterli cons .calsiti");

    }
    public static void main(String[] args) {


        Child child = new Child();
        Child cahild1=new Child(12);
        Child cahild3=new Child(12,15);

    }
}
