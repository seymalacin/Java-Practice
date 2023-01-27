package statickeyword4;

public class Runner {


    public static void main(String[] args) {

        Static01 s2=new Static01();
        s2.nonStaticMethod();
        System.out.println(s2.okulIsmi);


        Static01.staticMethod();
        System.out.println( Static01.okulTelefonu);
    }
}
