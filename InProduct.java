import java.util.Scanner;
public class InProduct {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter Product Title: ");
        String title = input.nextLine();

        System.out.print("Enter Product Description: ");
        String description = input.nextLine();

        System.out.print("Enter Product category: ");
        String category = input.nextLine();


        System.out.print("Enter Product id: ");
        int id = input.nextInt();

        System.out.print("Enter Product Price: ");
        int price = input.nextInt();

        System.out.println("Product ID: "+id);
        System.out.println("Product Title: "+title);
        System.out.printf("Product Price: %d euros\n",price);
        System.out.println("Product Description: "+description);
        System.out.println("Product Category: "+category);

    }
}
