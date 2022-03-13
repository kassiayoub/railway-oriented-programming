package main;

import railway.Failure;
import railway.Result;
import railway.Success;

public class Main {

    public static void main(String[] args) {
        example1();

    }

    public static void example1(){
        Result<Integer, String> integer42 = new Success<>(42);
        Result<Integer, String> notAnInteger = new Failure<>("not ana integer");

        printResult(integer42);
        printResult(notAnInteger);
    }

    public static void printResult(Result<Integer, String> result){
        result.either(
                success -> {
                    System.out.println("value= " + success);
                    return result;
                },
                failure -> {
                    System.out.println("error= "+ failure);
                    return result;
                });
    }
}
