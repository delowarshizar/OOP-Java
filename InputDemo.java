import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args)
    {
        Scanner Name = new Scanner(System.in);
        String omi;
        System.out.print("Enter Your Name: ");
        omi = Name.nextLine();

        System.out.println("Name: "+omi);

    }
}
