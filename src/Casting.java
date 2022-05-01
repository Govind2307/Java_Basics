public class Casting {
    public static void main(String[] args){
        // casting
        // Changing type
        double price = 100.00;
        double FinalPrice = price + 18.0;

        //Implicit casting
        //When you save small data type in big
        //Java allows Implicit casting

        System.out.println(FinalPrice);

        int p = 100;
        // int fp = p + 18.0;  {It gives error}

        int fp = p + (int)18.0;     // {Explicit Casting}
        System.out.println(fp);


        // Explicit Casting
        // When you save big data type in small type,there is some data loss
        int fp1 = p + (int)18.18;
        System.out.println(fp1);  //Data loss



        //Constants
        //  Float PI = 3.14F; You can Change the value
        // PI = 1.1F;  Value Changed

        final float PI = 3.14F; // Now the value is constant,You cannot change it
        System.out.println(PI);


    }
}
