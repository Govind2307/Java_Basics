public class Main {  //class
    public static void main(String[] args)
    //function (1st call when function is called)
    {
        //First programmed
        System.out.println("Hello world!"); // in the new line
        System.out.println("Java Basics"); //no new line

        // Methods are the function which is written under the classes (print)

        //varable types
        /*
         * byte - 1 [-128 to 127]
         * short - 2
         * int - 4
         * long - 8
         * float - 4
         * double - 8
         * char - 2
         * boolean - 1 true/false
         */

        //Variable
        String Name = "Govind";
        byte age = 30;
        long phn = 7610658089L;
        float pi = 3.14F;
        char letter = 'G';
        boolean isAdult = true;



        //Operations on Strings
        //Strings are immutable means we cannot change it
        // concatenate

        String name1 = "Ayush";
        String name2 = "Sharvil";
        String name3 = name1 + " " + name2;
        System.out.println(name3);

        //Length
        String name = "Govi";
        System.out.println(name);
        System.out.println(name.length());

        // charAt
        //Java is a 0 index based language
        String name4 = "Ayush";
        System.out.println(name4.charAt(0));

        //Replace
        String name5 = name2.replace('a','b');
        System.out.println(name5);

        //substring
        String a = "Ayush and naman";
        System.out.println(a.substring(0,5)); //0 is included but 5 is not


    }
}
