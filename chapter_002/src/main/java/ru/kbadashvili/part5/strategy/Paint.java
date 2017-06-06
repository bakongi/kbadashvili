package ru.kbadashvili.part5.strategy;

/**
 * Created by KBadashvili on 001 01.06.17.
 */
public class Paint {

    /**
     *
     */
    private Shape shape;

    /**
     *
     * @param shape shape.
     */
    public Paint(Shape shape) {
        this.shape = shape;
    }

    /**
     *
     * @param shape shape.
     */
    public void draw(Shape shape) {
        System.out.println(shape.pic());
    }
}
