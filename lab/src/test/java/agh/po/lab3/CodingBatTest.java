package agh.po.lab3;




public class CodingBatTest {

    @org.junit.Test
    public void sleepIn() {
        CodingBat cb = new CodingBat();
        org.junit.Assert.assertTrue(cb.sleepIn(false, false));
        org.junit.Assert.assertFalse(cb.sleepIn(true, false));
        org.junit.Assert.assertTrue(cb.sleepIn(false, true));
    }

    @org.junit.Test
    public void diff21() {
        CodingBat cb = new CodingBat();
        org.junit.Assert.assertEquals(2, cb.diff21(19));
        org.junit.Assert.assertEquals(11, cb.diff21(10));
        org.junit.Assert.assertEquals(0, cb.diff21(21));
    }

    @org.junit.Test
    public void countEvens() {
        CodingBat cb = new CodingBat();
        org.junit.Assert.assertEquals(3, cb.countEvens(new int[]{2, 1, 2, 3, 4}));
        org.junit.Assert.assertEquals(3, cb.countEvens(new int[]{2, 2, 0}));
        org.junit.Assert.assertEquals(0, cb.countEvens(new int[]{1, 3, 5}));
    }

    @org.junit.Test
    public void helloName() {
        CodingBat cb = new CodingBat();
        org.junit.Assert.assertEquals("Hello Bob!", cb.helloName("Bob"));
        org.junit.Assert.assertEquals("Hello Alice!", cb.helloName("Alice"));
        org.junit.Assert.assertEquals("Hello X!", cb.helloName("X"));
    }
}