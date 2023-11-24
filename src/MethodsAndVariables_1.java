public class MethodsAndVariables_1 {
    public static void main(String[] args) {
        //Java methods are a key building component. Think of them like the uniquely shaped blocks in Tetris
        //Try to break down Java methods to be as small (atomic) as possible
        //Think of atoms as the smallest building blocks in the world
        //If its something as simple as "Double (multiply by 2) a given variable" then thats fine!

        //Lets try calling the 2 functions below with some numbers
        int number = 10;
        //Lets break this one down too
        //int (integer, whole number
        //"number" -> The name of the variable we've given it
        // =
        // like in arithmetics or algebra, the left side is the same as the right side
        //In other words, the left side (int number) has become (=) 10
        //the variable number now stores the value 10

        //Lets call the methods below
        System.out.println("Starting to run the methods...");
        doubleTheNumber(number);
        doubleTheNumberOneline(number);
        System.out.println("Finished running the methods");
        System.out.println("But the only thing that happened is it spat out a line about inline comments"); //Which really just proves something IS happening behind the scenes

        //We have now called the above methods
        //If you just run this without anything, you will notice that nothing seems to happen, the only output being the inline comment demo

        //Lets make spit out the outputs to these methods
        System.out.println("Starting the methods again, this time nested inside a System.out.printline");
        System.out.println(doubleTheNumber(number));
        System.out.println(doubleTheNumberOneline(10)); //This is an alternate way to pass a value into a method. This is hardcoding though, you won't be able to dynamically take different values from other variables
        System.out.println("And there we have it, we have 20 in the console!"); //Along the inline comment demo

        //You can nest calls like this inside each other's parameters. Do note: This can get ugly and hard to read reaaaaaal fast
    }

    //Method that takes an integer parameter (input) and doubles it
    public static int doubleTheNumber (int aWholeNumber){
        //Lets break down the above line!

        //The keyword "public" means the method is visible and can be called from other objects of other types

        //The keyword "static" means the method is associated to the given class.
        //There is no specific instance/object of that class.
        //This means you can call a static method without having to create an object of the class

        //int means the return type (AKA what the method will give back to whatever "called" this method)
        //This can be things like double, boolean, arrays (int[], double[], etc)

        //doubleTheNumber is the name of the method. This is up to use to decide what we want to call it
        //Give methods, variables and honestly everything you do a good name
        //If you can't remember exactly what you did an hour ago and why, how is Bob going to figure this out?

        //(int integer) is our parameters. This is whwere we tell the method what we want it to know
        //In our case, its given an int (integer, whole number) that we have called "aWholeNumber"

        //Lets write some code!

        //When writing code, we want to document this code as well as possible
        //We want that code to be well structured, meaningful, and clean
        //We can document some code using comments, like what you're currently reading
        //Anything with a //before it will be commented out, AKA not be done
        System.out.println("You can do inline comments too!"); //Inline comments come after a block of code. Everything after the // won't be executed

        //Ok, lets actually code
        //What do we want to do?
        //Well, we want to take a number
        //Double said number
        //Send it back

        //If you look at the above paragraph
        //You might notice something nice
        //We've basically already laid out what our program needs to do!
        //We're breaking down the task into its atomic components (Its smallest constituent component/task)!
        //We can literally use that to document our code


        //Take a number
        //We already have this from the parameters
        //public static int doubleTheNumber (int aWholeNumber)
        //its called aWholeNumber

        //Double said number
        int doubledNumber = aWholeNumber * 2;
        //You can write this as aWholeNumber = aWholeNumber * 2;
        //Its shorter
        //But in a way, it can also be harder to read, especially as we start stacking up (nesting) calls, functions, varibles, etc...

        //Send it back
        return doubledNumber;
        //the keyword "return" means to go back. You can return all sorts of different things
        //Here we return a previously declared variable "doubledNumber" to whatever called this method
    }

    public static int doubleTheNumberOneline(int variable){
        //Here I'm going to write the above method, in a one-liner
        return variable * 2;
        //Ye, its really just that simple!
        //Lets break it down
        //return: Send back
        //variable * 2
    }
}
