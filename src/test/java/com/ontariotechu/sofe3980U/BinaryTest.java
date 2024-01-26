package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest 
{
    /**
     * Test The constructor with a valid binary vallue
     */
    @Test
    public void normalConstructor()
    {
		Binary binary=new Binary("1001001");
        assertTrue( binary.getValue().equals("1001001"));
    }
    /**
     * Test The constructor with an invalid binary value of out-of-range digits
     */
    @Test
    public void constructorWithInvalidDigits()
    {
		Binary binary=new Binary("1001001211");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value of alphabetic characters
     */
    @Test
    public void constructorWithInvalidChars()
    {
		Binary binary=new Binary("1001001A");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value that has a sign
     */
    @Test
    public void constructorWithNegativeSign()
    {
		Binary binary=new Binary("-1001001");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * T	est The constructor with a zero tailing valid binary value
     */
    @Test
    public void constructorWithZeroTailing()
    {
		Binary binary=new Binary("00001001");
        assertTrue( binary.getValue().equals("1001"));
    }
    /**
     * Test The constructor with an empty string
     */
    @Test
    public void constructorEmptyString()
    {
		Binary binary=new Binary("");
        assertTrue( binary.getValue().equals("0"));
    }
	/**
     * Test The add functions with two binary numbers of the same length
     */
    @Test
    public void add()
    {
		Binary binary1=new Binary("1000");
		Binary binary2=new Binary("1111");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("10111"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is less than the second
     */
    @Test
    public void add2()
    {
		Binary binary1=new Binary("1010");
		Binary binary2=new Binary("11");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is greater than the second
     */
    @Test
    public void add3()
    {
		Binary binary1=new Binary("11");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with a binary numbers with zero
     */
    @Test
    public void add4()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1010"));
    }
	/**
     * Test The add functions with two zeros
     */
    @Test
    public void add5()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("0");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("0"));
    }
    /**
     * Test The OR functions with two binary values of the same length
     */
    @Test
    public void or1()
    {
		Binary binary1=new Binary("100111");
		Binary binary2=new Binary("010000");
		Binary binary3=Binary.or(binary1,binary2);
        assertTrue( binary3.getValue().equals("110111"));
    }
    /**
     * Test The OR functions with two binary values of with (num1 length less than num2 length)
     */
    @Test
    public void or2()
    {
		Binary binary1=new Binary("101");
		Binary binary2=new Binary("110011");
		Binary binary3=Binary.or(binary1,binary2);
        assertTrue( binary3.getValue().equals("110111"));
    }
    /**
     * Test The OR functions with two binary values of with (num1 length greater than num2 length)
     */
    @Test
    public void or3()
    {
		Binary binary1=new Binary("101001");
		Binary binary2=new Binary("110");
		Binary binary3=Binary.or(binary1,binary2);
        assertTrue( binary3.getValue().equals("101111"));
    }
    /**
     * Test The AND functions with binary values of the same lenght
     */
    @Test
    public void and1()
    {
		Binary binary1=new Binary("101001");
		Binary binary2=new Binary("110001");
		Binary binary3=Binary.and(binary1,binary2);
        assertTrue( binary3.getValue().equals("100001"));
    }
    /**
     * Test The AND functions with two binary values of with (num1 length less than num2 length)
     */
    @Test
    public void and2()
    {
		Binary binary1=new Binary("001");
		Binary binary2=new Binary("011011");
		Binary binary3=Binary.and(binary1,binary2);
        assertTrue( binary3.getValue().equals("1"));
    }
    /**
     * Test The AND functions with two binary values of with (num1 length greater than num2 length)
     */
    @Test
    public void and3()
    {
		Binary binary1=new Binary("101111");
		Binary binary2=new Binary("101");
		Binary binary3=Binary.and(binary1,binary2);
        assertTrue( binary3.getValue().equals("101"));
    }
    /**
     * Test The mult functions with binary values of the same lenght
     */
    @Test
    public void mult1()
    {
		Binary binary1=new Binary("101010");
		Binary binary2=new Binary("001000");
		Binary binary3=Binary.mult(binary1,binary2);
        assertTrue( binary3.getValue().equals("101010000"));
    }
    /**
     * Test The mult functions with two binary values of with (num1 length less than num2 length)
     */
    @Test
    public void mult2()
    {
		Binary binary1=new Binary("1010");
		Binary binary2=new Binary("011001");
		Binary binary3=Binary.mult(binary1,binary2);
        assertTrue( binary3.getValue().equals("11111010"));
    }
    /**
     * Test The mult functions with two binary values of with (num1 length greater than num2 length)
     */
    @Test
    public void mult3()
    {
		Binary binary1=new Binary("100100");
		Binary binary2=new Binary("001");
		Binary binary3=Binary.mult(binary1,binary2);
        assertTrue( binary3.getValue().equals("100100"));
    }

}
