package ru.kbadashvlili.part3;

import org.junit.Test;
//import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

 /**
 * Test.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
public class PointTest {
    /**
    * Test.
    */
    @Test
    public void testDistanceToTwoPoints() {
        final double p1x = 0;
        final double p1y = 0;
        final double p2x = 2;
        final double p2y = 4;
        final double result = 0.01;
        final double except = 4.47;
        Point point1 = new Point(p1x, p1y);
        Point point2 = new Point(p2x, p2y);
        //Triangle triangle = new Triangle();
        assertThat(point1.distanceTo(point2), closeTo(except, result));
        //assertThat(point1.distanceTo(point2), is(result));
    }

}
