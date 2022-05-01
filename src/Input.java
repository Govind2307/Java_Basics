import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        // The Scanner takes the user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your name:");
        //String name = scan.next();
        String name1 = scan.nextLine();
       // System.out.println(name); // it takes only one word input
        System.out.println(name1); // it takes full sentence
    }
}
