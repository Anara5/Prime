package PrimeNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Prime {

    /**
     * prime numbers are added to the ArrayList
     */
    private static SortedIntCollection primes = new SortedIntCollection();

    /**
     * check if a number is prime
     * @param number to test
     * @return true is the number is prime, false if it's not
     */
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number ; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Enter\na) to see all prime numbers starting with the highest\nb) check the next prime number after your highest number you've put in\nq) to quit");

        while (true) {
            System.out.println("Enter a prime number");
            String input = readLine(); // user input

            assert input != null;
            //if (input.isEmpty()) return; // this is an example of an extra button action. If we press Enter without input then program also stops

            Integer number = parseInt(input); // user input
            if (number != null) {
                if (isPrime(number)) {
                    primes.addSorted(number);
                    System.out.println("It's prime");
                } else
                    System.out.println("Nope");
            } else if (input.equals("a")) {
                printAllPrimes();
            } else if (input.equals("b")) {
                int highestKnownPrime = primes.getHighestNumber();
                int nextPrime = findNextPrime(highestKnownPrime);
                primes.addSorted(nextPrime);
                System.out.println("your highest number is: " + highestKnownPrime + "\nthe next one after is: " + nextPrime); // the program sorts and shows the next prime number after our added highest number
            } else if (input.equals("q")) {
                printAllPrimes(); //by pressing q we stop the program and it prints out all our prime numbers we have in the data
                return;
            }
        }
    }

    /**
     * prints all primes
     */
    private static void printAllPrimes() {
        for (Integer integer : primes.getTheList()) {
            System.out.println(integer);
        }
    }

    /**
     * Find the next larger prime bigger than <tt>lowerLimit</tt>
     * @param lowerLimit a number that the result must be bigger than
     * @return the smallest prime larger than <tt>lowerLimit</tt>
     */
    public static int findNextPrime(int lowerLimit) {
        for (int i=lowerLimit+1;; i++){
            if(isPrime(i))
                return i;
        }
    }

    /**
     * take the String as an input
     * @param input is a string with integer is in decimal form
     * @return is returns the number while it is parsed, otherwise no.
     */
    public static Integer parseInt(String input) {
        Integer number;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException exception) {
    // exceptions for user input to catch invalid input and continue running
            number = null;
        }
        return number;
    }

    /**
     * reading the whole line of the standard input
     * @return adding lines while running the kod
     */
    public static String readLine() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return bufferedReader.readLine();
        } catch (IOException exception) {
            return null;
        }
    }
}