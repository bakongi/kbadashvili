package ru.kbadashvili.part5;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

 /**
 * 5.1. Создать программу для сортировки массива методов перестановки.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
 public class SortTest {
        /**
        * Test.
        */
        @Test
        public void testBuubleSort() {
                final int num1 = 1;
                final int num3 = 3;
                final int num7 = 7;
                final int num0 = 0;

                int[] array = new int[]{num7, num3, num0, num1};
                Sort sort = new Sort();
                int[] arrayesult = new int[]{num0, num1, num3, num7};
                assertThat(sort.bubble(array), is(arrayesult));
        }
 }