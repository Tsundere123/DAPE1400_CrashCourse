public class arrays {


    public static void printArray(){
        int[] arrayDemo = new int[5];
        arrayDemo[0] = 29;
        arrayDemo[1] = 33;
        arrayDemo[2] = 45;
        arrayDemo[3] = 51;
        arrayDemo[4] = 2;
        for(int i = 0; i < arrayDemo.length; i++){
            System.out.println(arrayDemo[i]);
        }

        int value1 = 29;
        int value2 = 33;
        //etc
    }
    public static void matrix(){
        int[][] tabell = new int[4][4];
        tabell[0][0] = 23;
        tabell[1][0] = 24;
        tabell[2][3] = 45;
        tabell[3][0] = -12;
        for (int i = 0; i<tabell.length;i++){

            for(int j = 0; j<tabell[i].length;j++){
                System.out.print(tabell[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
        for (int[] liste : tabell){
            for (int tall : liste){
                System.out.print(tall+" ");
            }
        }

        //For each position in the array "tabell", make a new variable of "int[] list"
        //This means that we now create a new array of type int, which we have named liste

        //Next for loop:
        //For each position in the new array "liste", take each individual "tall" (number) from the array liste which
        //generated in the first for loop
        //Do something with that number: In our case: Print the "tall" (number) of the array "list",
        //which is derived from the matrix "tabell"

        //Verbose example:
        //For each number between [0, and 10]
        //List the number

    }

}
