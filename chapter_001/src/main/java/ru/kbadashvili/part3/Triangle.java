package ru.kbadashvili.part3;

 /**
 * Создаем треугольник.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */

public class Triangle {
    /**
    */
    private Point a;

    /**
    */
    private Point b;

    /**
    */
    private Point c;

    /**
    */
    private double sideA;

    /**
    */
    private double sideB;

    /**
    */
    private double sideC;

    /**
    * @param a - первая точка.
    * @param b - вторая точка.
    * @param c - третья точка.
    */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
    * @return result - возвращает площадь треугольника.
    */
    public double area() {
//calculate the triangle area
    	double result = 0.0;
    	this.sideA = (this.a.distanceTo(this.b));
    	this.sideB = (this.b.distanceTo(this.c));
    	this.sideC = (this.c.distanceTo(this.a));
    	if (this.sideA + this.sideB > this.sideC || this.sideB + this.sideC > this.sideA || this.sideA + this.sideC > this.sideB) {
    		double p = (this.sideA + this.sideB + this.sideC) / 2;
    		result = Math.sqrt(p * ((p - this.sideA) * (p - this.sideB) * (p - this.sideC)));
    	}

        return result;
    }
}