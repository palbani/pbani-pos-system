package com.pbani.exceptions;

public class UserException extends Throwable {
    //constructor, whenever UserException is created a string must be provided
    public UserException(String message) {
        //super refers to parent class which is Exception or RuntimeException
        //takes the provided message and passes it up the call heirarchy to the standard Java Excepetion System
        //if we don't write super(message java will still automatically call super(), because java constructors always call a constructor from the parent class
        //but we will not be passing in message and therefore the exception class will be initialized with a null message.
        super(message);
    }
}
