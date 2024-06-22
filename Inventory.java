import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Inventory {

    public static void addToList() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(now);
        String fileName = "inventory_" + formattedDate + ".txt";

        try (FileWriter fr = new FileWriter(fileName, true)) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter customer name: ");
            String name = scanner.nextLine();
            System.out.print("Enter service availed: ");
            String service = scanner.nextLine();
            System.out.print("Enter product price (PHP): ");
            String price = scanner.nextLine();
            System.out.println("\nRecorded successfully: " + name + " " + service + " " + price + "\n");
            fr.write("Customer Name: " + name + "\n");
            fr.write("Service Availed: " + service + "\n");
            fr.write("Product Price: " + price + " PHP\n");
            fr.write("------------------------------\n");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("");
            System.out.println("Choose your desired number:");
            System.out.println("1. Add To List");
            System.out.println("2. Exit");
            System.out.println("");
            System.out.print("Enter your Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addToList();
                    break;
                case 2:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}