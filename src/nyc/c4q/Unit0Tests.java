package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unit0Tests {

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main (String args[]) {
      // Use main to test your methods
      printHelloWorld();
    }

    public static void printHelloWorld() {
      System.out.println("Hello world");
    }

    public static boolean returnPrimitiveBooleanTrue() {
        int x = 1;
        int y = 1;
        if (x == y) {
            return true;
        }
        return false;
    }

    public static int returnPrimitiveInt1729() {
      return 1729;
    }

    public static double returnPrimitiveDoubleThreePointOneFour() {

        return 3.14;
    }

    public static char returnPrimitiveCharZ(char x) {
        x = 'Z';
        return x;

        }

    public static void printSumOf1Upto10UsingForLoop() {
        int i;
        int sum=0;
        for (i=0; i<=10; i++){
            System.out.println(sum+i);
        }
    }

    public static void printSumOf1Upto10000UsingForLoop() {
        int i;
        int sum =0;
        for (i=0; i<=10000; i++){
            System.out.println(sum+i);
        }
    }

    public static boolean isOdd(int n) {
        n=3;
        if (n % 2 == 0){]
            return true;
        }
        return false;
    }

    public static boolean isMultipleOfThree(int n) {
        n = 5;
        if (n % 3 == 0){
            return true;
        }
        return false;
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
        n = 11;
        if (n %2 == 0 && n % 3 == 0){
            return true;
        }
      return false;
    }

    public static String repeatStringXTimes(String input, int times) {
        input = "patato";
        times = 5;

        for (int i = 0; i<times; i++){
           // System.out.println(input+=i);
            return (input+=i);
        }
        if (times<0){
            return " ";
        }
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".
        return "";
    }

    public static String returnStringUntilQ(String input) {
        input = "applepieq";

        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".
        return "";
    }

    public static Person declareAndReturnPersonNamedAda() {
      return null;
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {
      return null;
    }

    public static boolean isFromLondon(Person person) {
      return false;
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {
        return null;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {
      // The HashMap should have key-value pairs of:
      // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
      // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`
      return null;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {
    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers() {

    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {

    }
}
