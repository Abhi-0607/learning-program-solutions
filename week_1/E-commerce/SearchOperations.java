import java.util.Arrays;
import java.util.Comparator;

public class SearchOperations {
     //Linear Search
    public static Product linearSearch(Product[] products, String searchterm) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(searchterm)) {
                return product;
            }
        }
        return null;
    }
    //Binary Search
    public static Product binarySearch(Product[] products, String searchterm) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(searchterm);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }
    //Array of Products
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Watch", "Accessories"),
            new Product(4, "SmartPhone", "Electronics"),
            new Product(5, "Hoodie", "Fashion"),
            new Product(6, "Bracelet", "Accessories"),
            new Product(7, "Shirts", "Fashion")
        };
        
        int randomIndex = (int) (Math.random() * products.length);
        String target = products[randomIndex].productName;
        System.out.println("Searching for product: \"" + target + "\"\n");


        // Measuring Linear Search
        long linearStart = System.nanoTime();
        Product resultLinear = linearSearch(products, target);
        long linearEnd = System.nanoTime();
        long linearTime = linearEnd - linearStart;

        // Measure Binary Search
        long binaryStart = System.nanoTime();
        Product resultBinary = binarySearch(products, target);
        long binaryEnd = System.nanoTime();
        long binaryTime = binaryEnd - binaryStart;

        System.out.println(resultLinear != null
            ? "Linear Search Result: Found " + resultLinear.productName
            : "Linear Search Result: Not Found");

        System.out.println(resultBinary != null
            ? "Binary Search Result: Found " + resultBinary.productName
            : "Binary Search Result: Not Found");

        // Time Comparison
        System.out.println("\nTime Complexity & Performance Report:");
        System.out.println("Linear Search Time (ns): " + linearTime + " | Complexity: O(n)");
        System.out.println("Binary Search Time (ns): " + binaryTime + " | Complexity: O(log n)");

        // Performance Comparison
        if (binaryTime < linearTime) {
            System.out.println("Binary Search performed better in this case.");
        } else if (binaryTime > linearTime) {
            System.out.println("Linear Search performed better in this case.");
        } else {
            System.out.println("Both performed equally in this case.");
        }

        // Show Recommendation
        System.out.println("\nRecommended : Use Binary Search for large, sorted datasets. However, for small or unsorted datasets, Linear Search is more suitable and effective.");
    }
}
