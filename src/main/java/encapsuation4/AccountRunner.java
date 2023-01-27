package encapsuation4;

public class AccountRunner {
    public static void main(String[] args) {

        Account acc = new Account();

        acc.setAcc_no(1234567890L);
        acc.setName("mohammad frotan");
        acc.setEmail("froten1954@gmail.com");
        acc.setAmount(1200);

        System.out.println(acc.getAcc_no()+ " " +acc.getEmail() +" " +acc);
    }

}
