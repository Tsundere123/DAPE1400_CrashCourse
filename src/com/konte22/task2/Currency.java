package com.konte22.task2;

//This class defines what a Currency is
//It tells our code what to expect from a Currency object
//In our case, that being a String name (or as we use it: Currency code)
//and the exchange rate for this currency code

//This class also contains a constructor and getters for the fields
class Currency {
    //Renamed from valuta.
    //This is the name (or code) of the currency
    private String name;

    //Rename from kurs.
    //This is the actual exchange rate
    private double exchangeRate;

    //This is a constructor
    //Its job is to construct
    //Thanks comrade obvious

    //What the constructor does is it initialises the fields of the class when you create the object
    //It sets the parameter (whats in the parentheses) and sets this.incomingName (this meaning the current object we are constructing, .incomingName being the property/field within the object Currency)
    //I've intentionally named the parameters incomingName and incomingExchangeRate
    //I did this to hopefully better explain how a constructor works
    public Currency(String incomingName, double incomingExchangeRate) {
        this.name = incomingName;
        this.exchangeRate = incomingExchangeRate;
    }

    //Normally the constructor would look like this, with confusing same names.
    //    public Currency(String name, double exchangeRate){
//        this.name = name;
//        this.exchangeRate = exchangeRate;
//    }

    //Getter. As the name implies, it gets the name and sends it back via the return statement
    //We need getters to get the value of a private field
    public String getName() {
        return name;
    }
    //Getter. As the name implies, it gets the exchange rate and sends it back to whatever method that awakend it from its meager slumber.
    public double getExchangeRate() {
        return exchangeRate;
    }
}