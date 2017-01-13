package ru.kbadashvlili.part3;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

 /**
 * Triangle Test.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
public class TriangleTest {
    /**
    * Test.
    */
    @Test
    public void testTriangleArea() {
        final double p1x = 0;
        final double p1y = 0;
        final double p2x = 2;
        final double p2y = 4;
        final double p3x = 4;
        final double p3y = 0;
        final double result = 0.65;
        final double except = 8.0;
        Point point1 = new Point(p1x, p1y);
        Point point2 = new Point(p2x, p2y);
        Point point3 = new Point(p3x, p3y);
        Triangle triangle = new Triangle(point1, point2, point3);
        assertThat(triangle.area(), closeTo(except, result));
    }

    /**
    * Test.
    */
    @Test
    public void testTriangleAreaFalse() {
        final double p1x = 0;
        final double p1y = 0;
        final double p2x = 0;
        final double p2y = 0;
        final double p3x = 0;
        final double p3y = 0;
        final double result = 0.0;
        final double except = 0.0;
        Point point1 = new Point(p1x, p1y);
        Point point2 = new Point(p2x, p2y);
        Point point3 = new Point(p3x, p3y);
        Triangle triangle = new Triangle(point1, point2, point3);
        assertThat(triangle.area(), closeTo(except, result));
    }

}