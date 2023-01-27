package statickeyword4;

public class Static03 {



    String isim;
    int id;
    static String okulIsimi;
    static int counter = 1000;

    public int setId(){
        counter++;
        return counter;
    }

    public Static03 (String isim){
        isim=isim;
        id=setId();
    }


    public static void setOkulIsimi(String isim){
        okulIsimi=isim;
    }
    public void getOgrencininBilgiliri(){

        System.out.println("Ogrencinin id: "+id);
        System.out.println("Ogrencinin ismi: "+isim);
        System.out.println("Okul ismi : "+okulIsimi);
    }

    public static void main(String[] args) {

        Static03.setOkulIsimi("fatih  okulu");
        Static03 s2=new Static03("Baris Aslan");
        Static03 s3=new Static03("Sumeyra");
        Static03 s4=new Static03("Atilgan");
        Static03 s5=new Static03("Ozlem Haslak");
        Static03 s6=new Static03("Fatih jupeli");

        s2.getOgrencininBilgiliri();
        s3.getOgrencininBilgiliri();
        s4.getOgrencininBilgiliri();
        s5.getOgrencininBilgiliri();
        s6.getOgrencininBilgiliri();

    }
}
