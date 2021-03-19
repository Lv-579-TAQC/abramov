package com.softserve.pifagor;

import com.softserve.integers.Calculate;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PifagorTest {
    private static Pifagor pifagor;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        pifagor = new Pifagor();
    }

    @Test
    public void testTriplets(){
        List<Triplet> list;
        int n = 10;

        list = pifagor.triplets(n);
        int expected = 2;
        Assert.assertEquals(expected, list.size());
    }

    @Test
    public void testTripletsCheckList(){
        int n = 5;
        List<Triplet> actual = new ArrayList<>();

        for (Triplet t : pifagor.triplets(n)){
            actual.add(t);
        }

        List<Triplet> expected = new ArrayList<>();
        expected.add(new Triplet(3,4,5));
        Assert.assertTrue(actual.equals(expected));
    }

    @Test
    public void testTripletsForNFive(){
        List<Triplet> list;
        int n = 4;

        list = pifagor.triplets(n);
        int expected = 0;
        Assert.assertEquals(expected, list.size());
    }

}
