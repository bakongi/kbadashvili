package ru.kbadashvlili.part4;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.math.BigInteger;

 /**
 * Test.
 * Проверяем факториал.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
 public class FactorialTest {
 	/**
 	* Test.
 	*/
 	@Test
 	public void testFactorial() {
 		final int num = 4;
 		final BigInteger result = BigInteger.valueOf(24L);
 		Factorial factorial = new Factorial();
 		assertThat(factorial.find(num), is(result));
 	}
 }