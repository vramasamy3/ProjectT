public class JavaClassExample {

    public static void main(String[] args) {
        
        // Create 2 product object
        Product product1 = new Product();
        Product product2 = new Product();
        
        // Invoke method on each objects
        product1.changeCatrgory("Computer");
        product1.changeName("Keyboard");
        product1.changePrice(85000);
        product1.changeQuantity(100);
        product1.printChanges();
        
        product2.changeCatrgory("Computer");
        product2.changeName("Mouse");
        product2.changePrice(55000);
        product2.changeQuantity(120);
        product2.printChanges();
    }
    
}