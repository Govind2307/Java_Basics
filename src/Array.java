import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        //Arrays

        // int[] it denotes the array
        // new is used in non primitive data type

        int[] array = new int[2];
        array[0] = 50;
        array[1] = 20;
        System.out.println(array[0] + " " + array[1]);

        // Function on arrays
        // Length
        System.out.println(array.length);

        // Sort
        System.out.println(array[0]);
        Arrays.sort(array);
        System.out.println(array[0]);

        //1 D arrays
        int[] marks = {95,85,90};
        // 2 D array
        int[][] Finalmarks = {{95,98,80},{80,50,90}};
        System.out.println(Finalmarks[0][0]);
        System.out.println(Finalmarks[1][2]);
    }
}
