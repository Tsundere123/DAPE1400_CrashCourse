public class ForLoops_5 {
    public static void main(String[] args) {

        //A for loop is a type of loop that allows you to declare three things when you write one
        //1) Some value
        //2) An if test
        //3) Something that will be done after every "cycle" or "iteration" of the loop
        //Each of these three segments are separated by a semicolon ;

        //for(DECLARATION; IF TEST; ACTION) { }
        //We can use the declaration inside of the SCOPE of this for loop, but not outside
        //SCOPE means the area that something is valid
        //Your student ID might prove to a ticket inspector you are a student, and thus can use student prices
        //Your student ID probably won't be accepted by the post office to collect a consignment that requires Identification from the recipient
        //Your student ID therefore has limited scope as ID
        //The same applies to our variable int i = 0 that we declared inside the for loop
        //You can't use it outside
        i = 0; //Java will complain. Comment out this line to make the program run

        //Scope is set "downwards" (or inwards if you want)
        //That means anything you declare, can be used inside "itself", and anything that is contained, like the for loop below
        int value = 10; //We will use this in the loop

        System.out.println("This is the first for loop on line 25");
        for(int i = 0; i <= value; i++){
            //For loops are broken down into 3 parts
            //(PART1: Variable declaration; PART2: Check/iftest; PART3: Do after every loop instance)
            //For loops will loop until its conditions are complete/met. Be careful to not make infinite loops
            System.out.println(i); //prints out the value of i
            //Should print 11 lines, counting from 0 to and including 10
        }
        System.out.println("The for loop on line 25 has ended");

        //You can think of a for loop as a cleaner way to write a specific type of while loop

        System.out.println("This is the output from the while loop at line 38");
        int j = 0; //Declares a variable j
        while(j <= value){ //While (as long as9 j is smaller than or equal to value (which we've set in line 22 as 10)
            System.out.println(j); //print a new line with the value of J
            j++; //Increment (increase by 1) j
        }
        System.out.println("This is the end of the output from the while loop. The output is the same as the first for loop");

        //What about infinite loops?
        //See the method below
        infiniteForLoop(); //Comment this out unless you actually want to run the infinite loop

        System.out.println("Return statement demonstration. It just stopped at 0");
        returnStatementDemo(); //Demo of the return statement. Output will be 0
    }

    public static void infiniteForLoop(){
        for(int i = 0; i < 1; i--){
            //1) Declare variable i and set it to zero
            //2) If test: Check if 1 is LESS THAN 1
            //3) after every run i will be reduced by 1
            //Because the if test checks if i is lower than 1, and each cycle will make the number even lower than it already is
            //We have an infinite loop

            //It will continue running until your PC spontaneously combusts
            //(Ok, it probably won't make your PC catch fire, but its also an infinite loop thats probably not intended

            //its an infinite loop because we won't reach a condition where the variable i will become greater than 1
            //(Remember: The if test will run the loop if it tests to TRUE. To exit the loop we need the test to become FALSE
            //AKA if the test asks for a number less than 1, we need the number to somehow become greater than 1 to exit the loop
            System.out.println(i);
        }
    }

    public static void returnStatementDemo(){
        //This is just a demo of the return statement being used to stop a loop
        for(int i = 0; i < 1; i--){
            //This is the same loop as above
            System.out.println(i);

            //But we're going to add something to it!
            //We're going to add a return statement here
            return;
            //This just tells the for loop to stop
            //That means the console will just print 0
            //Simple as that
        }
    }
}
