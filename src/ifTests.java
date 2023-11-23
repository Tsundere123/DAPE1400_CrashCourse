public class ifTests {
    public static boolean checkIfNumberIsPositive(int value){
        //If: whatever is in parantheses is TRUE,
        if(value > 0){
            //Do whatever is in this codeblcok
            return true;
        }
        //If NOT ABOVE,
        else if(value < 0){
            //Do whatever is here
            return false;
        }
        else if(value == 0) {
            System.out.println("The number is actually 0");
            return false;
        }
        //If: Whatever in above if tests is NOT true
        //Oneliner
        else return false;
    }
    public static boolean checkIfNUmberIsPositiveTwo(int value){
        if(value < 0) return false;
        else if(value == 0) return false;
        else return true;
    }

    public static boolean crashnt(int value1,int value2){
        try{
            int output = value1 + value2;
        }
        catch(Exception e){
            System.out.println("oops, I can't type or crash");
        }

        return true;
    }
}
