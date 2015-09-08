package edu.up.cs371.primetester;
import android.util.*;
/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    public static boolean isPrime(long n) {

        if(n == 1 || n == 0)
        {
            return false;
        }
        for(int i = 2; i<n; i++)
        {
            Log.i("isPrime", ""+n);
            if(n%i == 0)
            {
                return false;
            }

        }
        return true;
        // return Math.random() > 0.5;
    }
}
