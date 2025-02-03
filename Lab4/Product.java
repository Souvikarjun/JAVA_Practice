public class Product {
    String productName;
    String productID;
    float Price;
    int quantityInStock;
    float updatedPrice;

    float Update(Product product, float discount){
        return (product.Price - (product.Price*(discount/100)));
    }
    
    public static void main(String[] args) {
        Product Apple = new Product();
        Product Orange = new Product();
        Product Banana = new Product();

        Apple.Price = 450;
        Orange.Price = 3350;
        Banana.Price = 999;

        Apple.updatedPrice = Apple.Update(Apple, 15);
        Orange.updatedPrice = Orange.Update(Orange, 15);
        Banana.updatedPrice = Banana.Update(Banana, 15);

        System.out.println(Apple.updatedPrice);
        System.out.println(Orange.updatedPrice);
        System.out.println(Banana.updatedPrice);

    }
}
