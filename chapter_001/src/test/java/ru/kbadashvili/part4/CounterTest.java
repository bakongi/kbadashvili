package ru.kbadashvlili.part4;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

 /**
 * Test.
 * Подсчет суммы в диапозоне.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
 public class CounterTest {
 	/**
 	* Test.
 	*/
 	@Test
 	public void testAmountsInTheRangeCount() {
 		final int start = 2;
 		final int finish = 8;
 		final int result = 20;
 		Counter counter = new Counter();
 		assertThat(counter.add(start, finish), is(result));
 	}
 }