public class DoubleIFAnd{
    public static void main(String[] args) {
        
        String s1 = "AM";
        String s2 = "12";

        if(s1.equals("AM") && s2.equals("12"))
        {
            // if(s2.equals("12")) ///Valid
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

        if(s1.equals("AM"))
        {
            if(s2.equals("12"))
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        ///Another Process[Valid]

        if(s1 == "AM" && s2 == "12")
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }    

}