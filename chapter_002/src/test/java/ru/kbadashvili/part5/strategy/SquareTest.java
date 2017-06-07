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
public class SquareTest {
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
        Shape square = new Square();
        Paint paint = new Paint(square);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append("* * * * * *");
            sb.append(System.lineSeparator());
        }
        sb.append(System.lineSeparator()); //тмитация переноса строки в println метода draw()  классе Paint

        paint.draw(square);
        assertEquals(sb.toString(), outContent.toString());
    }
}