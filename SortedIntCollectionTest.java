package PrimeNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortedIntCollectionTest {
    @Test
    public void getHighestNumber_returnsHighestNumber(){
        SortedIntCollection collection = new SortedIntCollection();
        collection.addSorted(7);
        collection.addSorted(13);
        collection.addSorted(19);

        assertEquals(19, collection.getHighestNumber());
    }
}
