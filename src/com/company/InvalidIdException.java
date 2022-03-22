package com.company;

public class InvalidIdException extends RuntimeException{

    public InvalidIdException(){
        }

    public InvalidIdException(String e){
        }

    public static void message(String message){
            System.out.println(message);
        }
}
