package PrimeNumbers;

import java.util.ArrayList;

public class SortedIntCollection {

    // prime numbers are added to the ArrayList
    private ArrayList<Integer> theList = new ArrayList<>();

    // the new number that is next after the highest number we added
    public void addSorted (int number) {
        theList.add(number);
        theList.sort((integer, t1) -> t1 - integer);
    }

    public ArrayList<Integer> getTheList() {
        return theList;
    }

    public int getHighestNumber() {
        return  theList.get(0);
    }
}
