package ru.kbadashvili.part5.strategy;

/**
 * Created by KBadashvili on 001 01.06.17.
 */
public class Demo {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Paint paint = new Paint(triangle);
        paint.draw(triangle);
    }
}
