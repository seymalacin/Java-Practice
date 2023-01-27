package statickeyword4;

public class Static02 {

    //output u ne dir?
    static int x=1;
    int y=1;
    Static02(){
        x=+9;
        y++;
    }

    public static void main(String[] args) {
        Static02 sm1=new Static02();
        Static02 sm2=new Static02();

        System.out.println("-X"+ sm1.x+ "-Y"+sm2.x);//-X9-Y2

    }
}
