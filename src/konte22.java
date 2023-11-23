public class konte22 {
    public static void oppgave1(){
//        a) Skriv kode for å summere hvert 10. tall fra 0 til 1000, dvs. 10,20,30 .... 990, 1000 ved hjelp av en for-løkke.
//                Skriv ut resultatet på System.out.
//                b) Gjør det samme som i oppgave a) men med en while-løkke.
//                c) Skriv på System.out alle tallene fra 10 til -10 i rekkefølge med en for-løkke med komma i mellom (10, 9, 8, ....
//        -9,-10). Merk : ikke komma etter siste tallet -10.
//Del A
//        for(int i = 0; i <= 1000; i+=10){
//            System.out.println(i);
//        }

        //DelB
//        int i = 0;
//        while(i <= 1000){
//            System.out.println(i);
//            i += 10;
//        }

        //DelC
        for(int i = 10; i >= -10; i--){
            if(i != -10){
                System.out.print(i + ", ");
            }else{
                System.out.print(i);
            }
//            System.out.print();
        }
    }

}
