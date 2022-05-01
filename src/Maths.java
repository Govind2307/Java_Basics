public class Maths {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 500;
        int d = 5050;

        //Min and Max
        System.out.println(Math.min(a,b));
        System.out.println(Math.max(c,d));

        // Random  (Prints Random value) less than 1
        System.out.println(Math.random()); // Long data type
        System.out.println((int)Math.random()); // always 0
        System.out.println((int)(Math.random()*100));

    }
}
