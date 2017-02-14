package ru.kbadashvlili.part5;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

 /**
 * Удалить дубликаты.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
 public class DuplicateRemoverTest {
 	  /**
    * Test.
    */
    @Test
    public void testRemoveDublicates() {
        String[] arrayWithDublicates = new String[] {"Привет", "Привет", "Мир", "Мир"};
        String[] arrayWithoutDublicates = new String[] {"Привет", "Мир"};
        DuplicateRemover dublicate = new DuplicateRemover();
        assertThat(dublicate.remove(arrayWithDublicates), is(arrayWithoutDublicates));
    }
 }