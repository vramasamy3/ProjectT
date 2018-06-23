public class Product {
    
    /** THis is the blueprint of Product Class.
    GitHub is not syncing this java class.
    */
    String Category = 'Default';
    String name = "LED Monitor";
    double price = 2000000;
    int quantity = 10;

    void changeCategory(String newCategory) {
        category = newCategory
    }
    
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
        System.out.println("Category: "+category+", Product: "+name+", Price: "+price+", Quantity: "+quantity);
    }

}