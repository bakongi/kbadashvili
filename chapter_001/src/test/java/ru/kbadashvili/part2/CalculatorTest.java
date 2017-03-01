package ru.kbadashvili.part2;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CalculatorTest {

	// magic numbers - давай, до свидания!
	/**
	*/
	private final double first = 4;
	/**
	*/
    private final double second = 2;

	/**
     * Test.
     */
    @Test
    public void whenAdd() {
    	final double testResullt = 6;
    	Calculator calc = new Calculator();
    	calc.add(first, second);
    	assertThat(calc.getResult(), is(testResullt));
    }


    /**
     * Test.
     */
    @Test
    public void whenSubtract() {
    	final double testResullt = 2;
    	Calculator calc = new Calculator();
    	calc.subtract(first, second);
    	assertThat(calc.getResult(), is(testResullt));
    }

     /**
     * Test.
     */
    @Test
    public void whenDivide() {
    	final double testResullt = 2;
    	Calculator calc = new Calculator();
    	calc.div(first, second);
    	assertThat(calc.getResult(), is(testResullt));
    }

     /**
     * Test.
     */
    @Test
    public void whenMultiple() {
    	final double testResullt = 8;
    	Calculator calc = new Calculator();
    	calc.multiple(first, second);
    	assertThat(calc.getResult(), is(testResullt));
    }



}