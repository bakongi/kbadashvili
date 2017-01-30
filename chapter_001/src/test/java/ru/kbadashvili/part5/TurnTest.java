package ru.kbadashvlili.part5;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

 /**
 * Перевернуть массив.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
 public class TurnTest {
 	/**
 	* Test.
 	*/
 	@Test
 	public void testBackMethod() {
 		int num1 = 1;
 		int num2 = 2;
 		int num3 = 0;
 		int[] arr = new int[] {num1, num2, num3};
 		int[] arrresult = new int[] {num3, num2, num1};
 		Turn turn = new Turn();
 		assertThat(turn.back(arr), is(arrresult));
 	}
 }