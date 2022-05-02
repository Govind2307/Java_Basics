import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // Conditional Statement (Switch)
        Scanner scan = new Scanner(System.in);
       /* System.out.println("Enter btw 1-6:");
        int day = scan.nextInt();

        switch (day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
                break;
        }*/


        int i = 5;
        double price;
        double quantity;
        double Total = 0.0;


        while (i != 0) {
            System.out.println("Select an option:");
            System.out.println("1:Apple");
            System.out.println("2:Orange");
            System.out.println("3:Banana");
            System.out.println("4:Mango");
            System.out.println("5:Kiwi");
            System.out.println("6:Grapes");
            System.out.println("0:Exit");
            i = scan.nextInt();

            switch (i) {
                case (1):
                    price = 200.0;
                    System.out.println("Enter Quantity:");
                    quantity = scan.nextDouble();
                    Total += price * quantity;
                    break;
                case (2):
                    price = 50.0;
                    System.out.println("Enter Quantity:");
                    quantity = scan.nextDouble();
                    Total += price * quantity;
                    break;
                case (3):
                    price = 20.0;
                    System.out.println("Enter Quantity:");
                    quantity = scan.nextDouble();
                    Total += price * quantity;
                    break;
                case (4):
                    price = 80.0;
                    System.out.println("Enter Quantity:");
                    quantity = scan.nextDouble();
                    Total += price * quantity;
                    break;
                case (5):
                    price = 100.0;
                    System.out.println("Enter Quantity:");
                    quantity = scan.nextDouble();
                    Total += price * quantity;
                    break;
                case (6):
                    price = 120.0;
                    System.out.println("Enter Quantity:");
                    quantity = scan.nextDouble();
                    Total += price * quantity;
                    break;
                case (0):
                    System.out.println("Your total bill is:" + Total);
                    System.out.println("Thank you for shopping with us.");
                    break;
                default:
                    System.out.println("Enter a valid option");
                    i = 2;

            }

        }
    }
}
