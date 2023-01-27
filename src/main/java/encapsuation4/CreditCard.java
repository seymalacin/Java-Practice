package encapsuation4;

public class CreditCard {



    private String ccn = "1234432123455432";
    private int age = 21;
    private boolean isExpired = false;


    public String getCcn() {
        return ccn;
    }

    public int getAge() {
        return age;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setCcn(String ccn) {
        this.ccn = ccn;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }
}
