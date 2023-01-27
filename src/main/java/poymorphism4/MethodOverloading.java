package poymorphism4;

public class MethodOverloading {

    public int sum(int x) {
        return x;
    }
    public int sum(int x, int y) {
        return (x + y);
    }

    // Overloaded sum(). This sum takes three int parameters
    public int sum(int x, int y, int z) {
        return (x + y + z);
    }


    public double multiply(double a, double b) {
        return   a * b;

    }
    //Method 2
    public double multiply(double a, double b, double c) {
        return a * b * c;

    }

    private     void StudentId(String name, int roll_no){
        System.out.println("Name :" + name + " " + "Roll-No :" + roll_no);
    }

    // Method 2
    private   void StudentId(int roll_no, String name){
        // Again printing name and id of person  public static void main(String args[])
        System.out.println("Roll-No :" + roll_no + " " + "Name :" + name);
    }


    public static void main(String[] args) {

        MethodOverloading Obj=new MethodOverloading();
        System.out.println(Obj.sum(3,6));
        System.out.println(Obj.sum(12));
        System.out.println(Obj.sum(12,13,14));//39
        System.out.println("Double :"+Obj.multiply(4,4));

        Obj.StudentId(1,"Esra");
        Obj.StudentId("Elif",2);

    }


}
