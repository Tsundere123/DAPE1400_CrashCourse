public class IfTests_2 {
    public static void main(String[] args) {
        //There are 2 ways to pass variables into a method
        //You can pass it directly (hard coded)
        System.out.println(checkIfNumberIsPositive(10));
        //You can pass it as a variable
        int variable = 15;
        System.out.println(checkIfNumberIsPositive(variable));

        //Do note that you cannot pass an invalid variable into a method
        double invalidVariable = 12.2;
        //Java will undergo a significant emotional event seeing a double be passed into a method that demands an int
//        checkIfNumberIsPositive(invalidVariable);
        //To actually compile and run this, you will have to comment out the above line by typing // before it
    }

    //What is an if test?
    //Think English
    //If you ask yourself something (like I am now)
    //You've set yourself up for a question, like a yes/no question
    //If tests work like that too
    //If (whatever is in the parantheses is TRUE) {do whatever you tell it to}

    //lets write some methods to try this out!
    //We will write a method that checks if a number is positive
    //I'm sure you've guessed what it will do just by the name, right?
    //If so, I've chosen a good name for it
    //If not, then I might not have chosen a good name for it
    public static boolean checkIfNumberIsPositive(int value){
        //Lets break this method down
        //public static just means its accessible to everyone, and doesn't need to be instantiated as an object to be used
        //boolean is a type of variable. It is either TRUE or FALSE (1, or 0) (Yes, or no)

        //If: whatever is in parentheses is TRUE,
        if(value > 0){ //if value is greated than 0
            //Do whatever is in this codeblock
            return true; //Returns (exits, stops, goes back to caller) with the value of "true". If a  "return" statement is executed, nothing below will be. The program just ignores the rest of the method
        }
        //If NOT ABOVE (as in value is NOT greater than zero)
        else if(value < 0){ //Else, is value LESS than zero?
            //Do whatever is here
            return false; //Returns (exits, stops, goes back to caller) with the value of "false".
        }
        //If NEITHER of the above (as in value is NOT greater than zero, but also NOT less than zero)
        //We know at this point that the number must actually be equal to zero then
        else if(value == 0) {
            System.out.println("The number is actually 0"); //A console printline saying the number actually is zero.
            //Do remember that boolean means its yes OR no, theres no third option
            return false; //Do we count a zero as positive or negative? We've chosen to say that its not positive (but its not negative either, we just have to return *something*
        }
        //If: Whatever in above if tests is NOT true
        //As in: "If none of the above"
        //Oneliner
        else return false;

        //This block of code isn't really that clean and easy to read, lets be honest here.
        //Its also quite long.
    }

    //Can we shorten that down, without making it *hard* to read?
    public static boolean checkIfNUmberIsPositiveTwo(int value){
        if(value <= 0) return false;
        return true;

        //This design principle is take advantage of the way if tests work
        //By their nature they're boolean
        //As in, by nature they are yes/no questions
        //Once we know someone has answered no to the question, we can simply forget about all of those possibilities

        //Here I've removed the check for "Equals to zero"
        //Its super straight forward
        //Is the number less than or equal to zero? If yes, then return false
        //Which means that whats left, must be positive!
        //Then we can just return true
        //We don't even need to have an else statement!
        //If this is confusing don't worry, you'll get the hang of it
        //Don't try to shorten things too much though, or else you could start sacrificing readability!
    }
}
