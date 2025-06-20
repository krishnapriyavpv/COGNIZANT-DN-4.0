import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Phone", "Electronics"),
            new Product(4, "Watch", "Accessories"),
            new Product(5, "Book", "Stationery")
        };
        String searchTerm = "Phone";
        Product resultLinear = Search.linearSearch(products, searchTerm);
        System.out.println("Linear Search Result: " + (resultLinear != null ? resultLinear : "Not found"));
        Arrays.sort(products);
        Product resultBinary = Search.binarySearch(products, searchTerm);
        System.out.println("Binary Search Result: " + (resultBinary != null ? resultBinary : "Not found"));
    }
}
