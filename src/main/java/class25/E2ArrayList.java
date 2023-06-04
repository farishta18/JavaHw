package class25;

import java.util.ArrayList;
import java.util.List;

public class E2ArrayList {
    public static void main(String[] args) {

        Headset headsets1 = new Headset("Razer Nari Ultimate", 79.99, 4620);
        Headset headsets2 = new Headset("New SteelSeries Arctis", 52.64, 4868);
        Headset headsets3 = new Headset("Hyperx Cloud IT", 0, 32116);
        List<Headset> headsets = new ArrayList<>();

        headsets.add(headsets1);
        headsets.add(headsets2);
        headsets.add(headsets3);

    }
    public static void printList(List<Headset> headsets) {
        for (Headset h : headsets) {
            h.printInfo();
        }

    }
}

class  Headset{
   private String title;
   private double price;
   private int noOfReviews;

    public Headset(String title, double price, int noOfReviews) {
        this.title = title;
        this.price = price;
        this.noOfReviews = noOfReviews;
    }
  public void printInfo(){

    }
    @Override
    public String toString(){
        return title+" "+price+" "+noOfReviews;

    }
}

