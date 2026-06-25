public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Headphones", "Electronics")

        };

        System.out.println("Linear Search:");

        Product result1 = SearchAlgorithms.linearSearch(products, 104);

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Product Not Found");



        System.out.println("\nBinary Search:");

        Product result2 = SearchAlgorithms.binarySearch(products, 104);

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Product Not Found");

    }
}