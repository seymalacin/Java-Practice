package Exception4;

public class Ex01 {
    public static void main(String[] args) {

        int x = 15;
        int y=0;

        if (y<=0){
            System.out.println("siz bir sayi 0' a bolemessiniz");
        }else {
            System.out.println(x/y);
        }

        try {
            System.out.println(x/y);
        }catch (ArithmeticException e){
            System.out.println("siz bir sayi 0' a bolemessiniz" + e.getMessage());
            e.printStackTrace();
        }
    }
}
