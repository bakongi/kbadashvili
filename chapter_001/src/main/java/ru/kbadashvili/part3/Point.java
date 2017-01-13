package ru.kbadashvlili.part3;

 /**
 * Создать программу вычисления площади треугольника.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
public class Point {
    /**
    */
    private double x;
    /**
    */
    private double y;
    /**
    * @param x - x.
    * @param y - y.
    */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
    * @param point - вторая точка.
    * @return result - возвращает расстояние между точками.
    */
    public double distanceTo(Point point) {
//calculate distance between two points
        final double result;
        result = Math.sqrt((Math.pow((this.x - point.x), 2)) + (Math.pow((this.y - point.y), 2)));
        return result;
    }
}