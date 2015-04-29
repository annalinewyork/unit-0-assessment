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
    public static void main(String args[]) {
        // Use main to test your methods
        printHelloWorld();
        System.out.println(returnPrimitiveBooleanTrue());
        System.out.println(returnPrimitiveInt1729());
        System.out.println(returnPrimitiveDoubleThreePointOneFour());
        System.out.println(returnPrimitiveCharZ());
        isOdd(6);
        isMultipleOfThree(9);
        isOddAndIsMultipleOfThree(12);
        returnStringUntilQ("ubiquitous");
    }

    public static void printHelloWorld() {

        System.out.println("Hello World");
    }

    public static boolean returnPrimitiveBooleanTrue() {
        boolean answer = 7 > 3;
        return answer;
    }

    public static int returnPrimitiveInt1729() {
        return 1729;
    }

    public static double returnPrimitiveDoubleThreePointOneFour() {
        return 3.14;
    }

    public static char returnPrimitiveCharZ() {
        return 'Z';

    }

    public static void printSumOf1Upto10UsingForLoop() {
        int i;
        int sum = 0;
        for (i = 1; i < 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void printSumOf1Upto10000UsingForLoop() {
        int i;
        int sum = 0;
        for (i = 1; i < 10000; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static boolean isOdd(int n) {
        if (n % 2 == 0) {
            return false;
        } else
            return true;
    }

    public static boolean isMultipleOfThree(int n) {
        if (n % 3 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {

        if (n % 2 != 0 && n % 3 == 0) {
            return true;
        } else

            return false;
    }

    public static String repeatStringXTimes(String input, int times) {

        String result = "";
        for (int i = 0; i < times; i++) {
            if (times >= 1) {
                result = result + input;
                System.out.print(result);
            } else if (times <= 0) {
                System.out.println(" ");
            }
        }
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".
        return result;
    }

    public static String returnStringUntilQ(String input) {

        char target = 'q';
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char findChar = input.charAt(i);
            if (findChar == target) {
                return input.substring(0, i);
            }
        }

        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".
        return result;
    }

    public static Person declareAndReturnPersonNamedAda() {
        Person a = new Person("Ada");
        a.setCity("NewYork");
        return a;
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {
        Person b = new Person();
        b.setName("Alan Turing");
        b.setCity("London");
        return b;
    }

    public static boolean isFromLondon(Person person) {
        return (person.getCity().equals("London"));

    }


    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {
        Place p1 = new Place();
        Place p2 = new Place();
        Place p3 = new Place();

        p1.setName("NewYork");
        p2.setName("Qingdao");
        p3.setName("Beijing");

        ArrayList <Place> places = new ArrayList<Place>();
        places.add(p1);
        places.add(p2);
        places.add(p3);

        return places;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {

        HashMap<String, Person> people = new HashMap<String, Person>();
        Person alan = new Person("Alan Turing");
        alan.setCity("London");
        Person hopper = new Person("Grace Hopper");
        hopper.setCity("Arlington");

        people.put("Alan Turing", alan);
        people.put("Grace Hopper",hopper);

        return people;

        // The HashMap should have key-value pairs of:
        // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
        // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {

       people.get("Alan Turing").setCity("Princeton");
    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers() {

    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {

    }
}
