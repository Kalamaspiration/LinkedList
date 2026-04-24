import java.util.Scanner;

// Main Class - Must match file name
public class products {
    
    // The main method must be inside the public class
    public static void main(String[] args) {
        cartmanager c = new cartmanager();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        do {
            System.out.println("\n1. ADD PRODUCT \n2. VIEW CART \n3. EXIT");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Clear buffer
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    c.add(id, name, price);
                }
                case 2 -> c.displaycart();
                case 3 -> {
                    running = false;
                    System.out.println("EXITING...");
                }
                default -> System.out.println("INVALID CHOICE");
            }
        } while (running);
        sc.close();
    }
}

// Node class for the linked list
class ProductNode {
    int productid;
    String Productname;
    double price;
    ProductNode next;

    ProductNode(int productid, String productname, double price) {
        this.productid = productid;
        this.Productname = productname;
        this.price = price;
        this.next = null;
    }
}

// Logic class to handle operations
class cartmanager {
    ProductNode head = null;

    void add(int id, String name, double price) {
        ProductNode newNode = new ProductNode(id, name, price);
        if (head == null) {
            head = newNode;
        } else {
            ProductNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Product Added Successfully!");
    }

    void displaycart() {
        if (head == null) {
            System.out.println("Your Cart is Empty.");
            return; 
        }
        ProductNode temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.productid + " | Name: " + temp.Productname + " | Price: " + temp.price);
            temp = temp.next; // CRITICAL: Moves to the next node
        }
    }
}
