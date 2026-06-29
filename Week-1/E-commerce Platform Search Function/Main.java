public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Headphones", "Electronics")
        };

        int targetId = 104;

        System.out.println("Linear Search:");

        Product result1 = LinearSearch.search(products, targetId);

        if (result1 != null)
            result1.display();

        System.out.println("\nBinary Search:");

        Product result2 = BinarySearch.search(products, targetId);

        if (result2 != null)
            result2.display();
    }
}