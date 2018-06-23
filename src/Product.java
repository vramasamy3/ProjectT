public class Product {
    
    /** THis is the blueprint of Product Class.
    GitHub is not syncing this java class.
    */
    String name = "LED Monitor";
    double price = 2000000;
    int quantity = 10;
    
    void changeName(String newName) {
        name = newName;
    }
    
    void changePrice(double newPrice) {
        price = newPrice;
    }
    
    void changeQuantity(int newQuantity) {
        quantity = newQuantity;
    }
    

    void printChanges() {
        System.out.println("Product: "+name+", Price: "+price+", Quantity: "+quantity);
    }

}