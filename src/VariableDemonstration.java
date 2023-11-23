public class VariableDemonstration {
    public static void ThisWillNotDoAnything(){
        //Below is not allowed
//        var ThisIsAVariable = 0;
        String ThisIsAString = "This is a string";
        String ThisIsActuallyANumber = "1";

        //Below is commented out: It is illegal in Java
//        ThisIsActuallyANumber = 0;

        int tall1;
        tall1 = 10;

        int tall2 = 20;
        int resultat = tall1 + tall2;
        //Prints 30
        System.out.println(resultat);


        String ikkeTall1 = "10";
        String ikkeTall2 = "20";
        //Prints "10mellomrom20"
        System.out.println(ikkeTall1 + "mellomrom" + ikkeTall2);
    }
}
