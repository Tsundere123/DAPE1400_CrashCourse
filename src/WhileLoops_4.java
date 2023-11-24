public class WhileLoops_4 {
    public static void main(String[] args) {
        //A while loop is pretty straight forward
        //While (as long as) a condition is true, do something

        //lets write a useful while loop
        int counter = 0;
        while (counter < 10){
            System.out.println(counter);
            counter++;
        }
        //Broken down:
        //While (as long as) the variable counter is less than ten,
        //do whats between the { }
        //Which in our case is to print the value of counter
        //And then (importantly, to avoid infinite loops) increments the counter by 1
        //Once the counter hits 10, the condition in the loop will no longer test to true (10 is not less than 10)
        //The loop will exit

        //You can quite clearly see this behaviour in DEBUG MODE
        //You can access debug mode first by setting a BREAKPOINT in your code
        //In IntelliJ you do this by clicking to the left of the code, where you see the line numbers
        //Click just to the right of the line number
        //You should see a red circle appear
        //You can now run the program in debug mode
        //Useful links:
        // https://www.jetbrains.com/help/idea/debugging-your-first-java-application.html
        // https://www.youtube.com/watch?v=lAWnIP1S6UA


        while(true) System.out.println("True"); //Comment me out to stop the infinite loop
        //Broken down it just means
        //While {Read: As long as} the conditions in the paranthese is true
        //do whatever is in the code block
        //in our case, because we simply set the test to true
        //it will continue into infinity and beyond
        //comment out the line to stop that. I don't want your PCs bursting into flames. That would be bad
    }

}
