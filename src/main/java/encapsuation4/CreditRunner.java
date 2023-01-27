package encapsuation4;

public class CreditRunner {
    public static void main(String[] args) {

        CreditCard cc1 = new CreditCard();

        System.out.println(cc1.getAge());
        System.out.println(cc1.getCcn());
        System.out.println(cc1.isExpired());

        cc1.setCcn("128934789012");
        System.out.println(cc1.getCcn());
        CreditCard cc2 = new CreditCard();
        System.out.println(cc2.getCcn());



    }

}
