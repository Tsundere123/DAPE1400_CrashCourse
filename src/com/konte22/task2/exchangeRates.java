package com.konte22.task2;

import java.util.ArrayList;

//This is where we program the actual exchangeRates class that allows us to get the name and exchange rate of a given currency
class exchangeRates {

    //Defines a private (only available in this class) ArrayList<of type Currency, the class that was given to us in the task>
    //We've chosen to rename this to exchangeRates
    //= new ArrayList<>(); just tells Java to make us a new ArrayList of the type <Currency>
    private ArrayList<Currency> exchangeRates = new ArrayList<>();

    //This is where we actually set (using the constructor from the Currency class) the objects for our ArrayList
    public exchangeRates(){
        //The first 2 ways are the longform
        Currency SEK = new Currency("SEK",2);
        //Above we make a new Currency called SEK (the name of the variable. This can really be called whatever we want
        Currency whateverwewant = new Currency("USD",10);
        //Inside the parameters of the new Currency(we have to tell it what values we give. If we look at the signature of the Currency constructor
        // public Currency(String incomingName, double incomingExchangeRate)
        //We see that it first neeeds a String incomingName, and then a double incomingExchangeRate
        //Therefore we must pass these in the correct order
        //Hence new Currency("USD",10);


        //Here we add SEk and whateverwewant (yeah I named it as such just to make a point about variable names)
        //They're added (exchangeRates.add) to the exchangeRates ArrayList<Currency> (ArrayList of Currencies) we made earlier
        exchangeRates.add(SEK);
        exchangeRates.add(whateverwewant);

        //This is a shorter/cleaner oneliner to do exactly the same thing as above
        exchangeRates.add(new Currency("JPY",0.01));
    }

    //This method takes the input from the Main class where we called it
    //It takes the parameter String currencyName
    //This is what we pass to the method from the Main class
    // exchangeRatesChecker.findExchangeRate("USD");
    //In the example: "USD"
    double findExchangeRate(String currencyName) {
        //For loop to iterate/search the exchangeRates ArrayList. This foreach loop will go through each Currency in the exchangeRates ArrayList
        //And every iteration will create a new Currency that we access, called exchangeRate (singular)
        for(Currency exchangeRate : exchangeRates){
            //The if test takes the exchangeRate's getName function (which gets the name for us, its the getter in the Currency class)
            //    public String getName() {
            //        return name;
            //    }

            //The if test takes this name that was returned to us and checks if its the same as the currencyName parameter that was passed to us from the Main method
            //This is our search function
            if (exchangeRate.getName() == currencyName ){
                //If it finds a currency in the list that matches the name, it will print out
                //what it found.
                System.out.println("The exchange rate for " + exchangeRate.getName() + " is: " + exchangeRate.getExchangeRate());
                //The printline is more for the demo (and for you to debug/make sure your code is actually working in a fast and efficient mannter
                //What actually matters (if we wanted to use the exchange rate to actually calculate, say, how much NOK you could buy with 10 USD is the return value
                //This is why we return the exchangeRate (the current Currency object in the ArrayList, see line 43's ForEach loop)
                //This is returned to the caller
                //In the USD example, 10 is returned
                return exchangeRate.getExchangeRate();
            }
        }

        //As this is OUTSIDE of the foreach loop on line 43 (And thus also outside of the if test on line 51)
        //It means the search didn't find the given currency
        //I have chosen here to printline an error message
        System.out.println("Could not find the currency " + currencyName);

        //And return the value of 0
        //Yould return -1 or some other nonsensical value
        //What matters is that you return a value that cannot possibly be a genuine exchange rate
        //This is for error handling if you were to actually use the return value to calculate something like how many NOK you could buy for X currency
        //But if you return 0, you could handle the error by saying that a currency wasn't found
        //In our case if we wanted to calculate how many NOK you would need to buy x USD, we would be using a 0 to calculate something
        //And multiply anything by 0 and you get 0
        //If you divide by 0 your calculator will undergo a significant emotional event

        //If you want to watch a mechanical calculator try
        // Divide by Zero on the Friden STW10 Mechanical Calculator
        // https://www.youtube.com/watch?v=7Kd3R_RlXgc
        return 0;
    }
}
