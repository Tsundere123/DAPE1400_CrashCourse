public class Konte22Task1 {
//    a) Skriv kode for å summere hvert 10. tall fra 0 til 1000, dvs. 10,20,30 .... 990, 1000 ved hjelp av en for-løkke.
//                Skriv ut resultatet på System.out.
//                b) Gjør det samme som i oppgave a) men med en while-løkke.
//                c) Skriv på System.out alle tallene fra 10 til -10 i rekkefølge med en for-løkke med komma i mellom (10, 9, 8, ....
//        -9,-10). Merk : ikke komma etter siste tallet -10.
    public static void main(String[] args) {
        System.out.println("Task A");
        for(int i = 0; i <= 1000; i+=10){
            //For loop as per task requirements
            //The loop declares the variable i
            //The loop checks if i is LESS THAN OR EQUAL to 1000
            //Each cycle of the loop increases i by 10
            System.out.println(i); //Prints i
        }

        System.out.println();
        System.out.println("Task B");
        int i = 0;
        //While loop as required. A while loop here is just an uglier version of a for loop. It does the same thing
        while(i <= 1000){
            System.out.println(i);
            i += 10;
        }

        System.out.println();
        System.out.println("Part C");
        for(int j = 10; j >= -10; j--){
            //For loop as required by task

            //This checks if j is equal to minus 10
            if(j != -10){
                //If j is NOT EQUAL TO (thats the ! in !=)
                //Then we print the value of j, and ", " (comma space)
                System.out.print(j + ", ");
            }else{//If J IS equal to minus 10
                System.out.print(j);//Print just j, which we know must be -10
            }
        }
    }
}
