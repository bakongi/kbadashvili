package ru.kbadashvili.part4;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

 /**
 * Тест.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
 public class PaintTest {
 	/**
 	*
 	*/
 	@Test
 	public void pyramidTest() {
 		Paint paint = new Paint();
 		//paint.piramid(5);
 		assertThat(paint.piramid(2), is("  ^ \n ^ ^ \n"));
 	}
 }