public class TryCatch_3 {
    public static void main(String[] args) {
        //This is a demo for try/catch
        //You can think of them as a funny if test
        //If the program *TRIES* to do whats in the TRY block
        //and FAILs
        //it will do the CATCH segment

        //In essence its a "if(goingToCrash){ don't }"

        //So lets crash some Java programs!
        //sauce: https://www.w3schools.com/java/java_try_catch.asp

        int[] myNumbers = {1, 2, 3};
        System.out.println("Java: I guess I crash now :(");
//        System.out.println(myNumbers[10]); //Comment me out to stop the crashing

        //We see this above line of code will give a
        //Index out of bounds error
        //It means we're trying to access a value that is outside of the bounds of the array
        //As in it doesn't exist!

        //We could use a try/catch to catch the error (like with a net)
        //And tell the program to just...not crash!

        try {
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Mommy told me not to crash :)");
        }

        //If its still crashing, comment out line 16
        //This time we see that the program didn't give us an ugly red significant emotional event
        //It did tell us that something went wrong though
        //Lets write a try/catch that we know won't cause a crash

        try {
            System.out.println(myNumbers[1]); //Prints 2, because arrays start at index 0
            System.out.println("We didn't crash!");
        } catch (Exception e) {
            System.out.println("Mommy told me not to crash :)");
        }

        //We can add a "finally" statement here
        //This will be run REGARDLESS if the program crashes or not

        finally {
            System.out.println("We've finished this demo!");
        }
}
}
