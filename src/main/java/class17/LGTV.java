package class17;

import class18.Tv;

public class LGTV extends Tv {
    void printMake(){
        System.out.println(make);
    }
}
class LGTVTester {


    public static void main(String[] args) {
        LGTV lgtv=new LGTV();
        lgtv.printMake();
    }
}