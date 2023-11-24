package com.konte22.task2;

public class Main {
    //Now I've gone back and done this one properly
    //This program will function

    //During the lecture, I misunderstood what the assignment was, and thus what I was trying to do wasn't right for the task

    //Here, the task is set up as its own package com.konte22.task2
    //Everything needed to complete the task is in this package

    //I have chosen to rename some things in the task, hopefully this makes it easier to understand the task requirements by having slighly less confusing (albeit longer) names
    //The purpose of the task is for the main program to take the name of currencies (in our case: three letter codes) and return the exchange rate for that currency
    //This is of course assuming you will be checking against a fixed currency (lets say NOK as we're in Norway)
    public static void main(String[] args) {
        //Instantiates a new instance of the exchangeRatesChecker
        exchangeRates exchangeRatesChecker = new exchangeRates();

        //Calls the exchangeRatesChecker to findExchangeRate
        exchangeRatesChecker.findExchangeRate("USD");
        exchangeRatesChecker.findExchangeRate("SEK");
        exchangeRatesChecker.findExchangeRate("DKK"); //This one doesn't exist
        exchangeRatesChecker.findExchangeRate("JPY");

        System.out.println();
        System.out.println("Below is if you wanted to do something useful with the output");
        System.out.println("This is outside the scope of the assignment");
        //If you wanted to actually do something useful with the return value you could so, f.ex
        //Calculate how many NOK you could buy with 100 USD
        double exchangeRate = exchangeRatesChecker.findExchangeRate("USD");
        double amountToConvert = 100; //This is where you'd use something like a scanner or JOptionPane to take an input

        double finalAmount = exchangeRate * amountToConvert;
        System.out.println(finalAmount);

        System.out.println();
        System.out.println("Below is a oneliner to do the same thing");
        //Oneliner
        System.out.println(exchangeRatesChecker.findExchangeRate("USD")*100);


        System.out.println();
        System.out.println("This is with error handling");
        //Lets try to do some error handling for a bad input (like a currency that doesn't exist or is misspelled)
        //Input name of currency
        String currencyName = "USD"; //Doesn't exist. Edit this to something that exists like USD and see what happens with the program
        //Makes a new variable exchangeRate2
        //Sets the value of exchangeRate2 to the return value of
        //exchangeRateChecker.findExchangeRate
        //With the parameter currencyName
        //Which above we set to "YES" which doesn't exist in the table
        double exchangeRate2 = exchangeRatesChecker.findExchangeRate(currencyName);
        //If test as error handling
        if(exchangeRate2 == 0){//We know that if a value of 0 is returned, it didn't find anything with the name of "YES"
            System.out.println("Sorry we didn't find your currency. Please double check your spelling"); //We will have duplicate error messages because of what we wrote in the exchangeRates class
        }
        else{
            double amountToConvert2 = 100; //This is where you'd use something like a scanner or JOptionPane to take an input
            double finalAmount2 = exchangeRate2 * amountToConvert2;
            System.out.println(finalAmount2);
        }

        System.out.println();
        System.out.println("Super confusing oneliner!");
        System.out.println(exchangeRate2 == 0 ? "Sorry, didn't find your currency" : (amountToConvert * exchangeRate2)); //Yep, thats it! :)
        //This works due to something called a Ternary operator
        //Don't worry too much about this one
        //Honestly you shouldn't use this too much unless you absolutely positively must sacrifice readability for code length
        //Basically a ternary operator is basically a super short way to write an if else statement

        //System.out.println(
        //checks the if test condition (exchangeRate2 == 0)
        //This is equivalent to if(exchangeRate2 == 0){ }

        //the key"word" ?
        //This ? is what to do if the statement is evaluated as true. As in the if test is true (in our case if the exchangeRate2 comes back as 0)
        //It will then execute the code block System.out.println("Sorry, didn't find your currency")
        //We don't have to wrinte System.out.println because the actual ternary operator itself is inside the parameters of the first one
        //Its inside the ( ) of the System.out.println itself!

        //The colon : is what to do if the if test evaluates to false
        //In our case it will calculate (amountToConvert * exchangeRate2) and place that inside of the System.out.println instead

        //Ternary operators are consise and short
        //But they can genuinely be confusing to read
    }
}
