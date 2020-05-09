package PrimeNumbers;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberTest {

    @Test
    public void isPrime_input_7_returnsTrue() {
        assertTrue(Prime.isPrime(7));
    }

    @Test
    public void isPrime_input_8_returnsFalse() {
        assertFalse(Prime.isPrime(8));
    }

    @Test
    public void findNextPrime_input43_returns47() {
        assertEquals(47, Prime.findNextPrime(43));
    }
}
