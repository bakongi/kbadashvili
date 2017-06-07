package ru.kbadashvili.part5.strategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

/**
 * Created by KBadashvili on 005 05.06.17.
 */
public class TriangleTest {

    /**
     *
     */
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    /**
     *
     */
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    /**
     *
     */
    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    /**
     *
     */
    @Test
    public void pic() {
        Shape triangle = new Triangle();
        Paint paint = new Paint(triangle);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append("    *********".substring(i, 5 + 2 * i)).append(System.lineSeparator());
        }
        sb.append(System.lineSeparator()); //тмитация переноса строки в println метода draw()  классе Paint

        paint.draw(triangle);
        assertEquals(sb.toString(), outContent.toString());
    }
}