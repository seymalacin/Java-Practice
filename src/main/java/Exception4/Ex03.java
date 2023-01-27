package Exception4;

public class Ex03 {
    public static void main(String[] args) {

        String s = "merhaba";

        int x = 20;
        int y = 0;

        try {
            System.out.println(x/y);
            System.out.println(s.charAt(9));
        }catch (ArithmeticException e){
            System.out.println("siz bie sayi 0'a boemessiniz");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("girilen index string da yok" +e.getMessage());
        }finally {
            System.out.println("butun exceptionar hatasi he e");
        }
    }
}
