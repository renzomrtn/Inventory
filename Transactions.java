import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class Transactions {

    public static void create() {
        Scanner sc = new Scanner (System.in);
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(now);
        String fileName = "Transaction_" + formattedDate + ".txt";

        try (FileWriter fw = new FileWriter(fileName, true)) {
            System.out.print("Customer name: ");
            String name = sc.nextLine();
            System.out.print("Availed service: ");
            String service = sc.nextLine();
            System.out.print("Price paid: ");
            String price = sc.nextLine();
            System.out.print("Status (to receive, received): ");
            String status = sc.nextLine();

            System.out.println();
            System.out.println("Recorded Successfully");
            System.out.println("Customer: " + name);
            System.out.println("Service:  " + service);
            System.out.println("Paid: " + price);
            System.out.println("Status: " + status);

            fw.write("Customer Name: " + name + "\n");
            fw.write("Service Availed: " + service + "\n");
            fw.write("Product Price: " + price + " PHP\n");
            fw.write("Service Status: " + status + "\n");
            fw.write("------------------------------\n");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
        sc.close();
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("1 = Create a list");
        System.out.println("2 = Exit");
        System.out.println();

        System.out.print("CHOOSE YOUR OPTION: ");
        int option = sc.nextInt();

        switch (option) {
            case 1: create();
                break;
            case 2:
                System.out.println("Exiting program...");
                sc.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        sc.close();
    }

}