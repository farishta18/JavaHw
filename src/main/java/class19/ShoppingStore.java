package class19;

public class ShoppingStore {//ShoppingStore
    String item;
    double price;
    int quantity;

    ShoppingStore( String item, double price, int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }
    public void itemTotalPrice(){
       double itemTotalPrice=this.price/this.quantity;;
        System.out.println(item+"  Total Value "+itemTotalPrice);
    }

}

/*
 String model;
    double price;
    int quantity;

    ShoppingStore(String model, double price, int quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;
    }

    public void carStockValue(){
        double stockValue=this.price*this.quantity;
        System.out.println(model +" stock Value "+stockValue);
    }
 */