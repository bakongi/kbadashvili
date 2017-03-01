package ru.kbadashvili.part2;
 /**
 * 2. Тип данных.
 * 2.3. Создать программу калькулятор.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Calculator {

	/**
	* Результат.
	*/
	private double result;

	/**
	* Сложение.
	* @param first - первое значение
	* @param second - второе значение
	*/
	public void add(double first, double second) {
		this.result = first + second;
	}

	/**
	* Вычитание.
	* @param first - первое значение
	* @param second - второе значение
	*/
	public void subtract(double first, double second) {
		this.result = first - second;
	}

	/**
	* Деление.
	* @param first - первое значение
	* @param second - второе значение
	*/
	public void div(double first, double second) {
		this.result = first / second;
	}

	/**
	* Умножение.
	* @param first - первое значение
	* @param second - второе значение
	*/
	public void multiple(double first, double second) {
		this.result = first * second;
	}

	/**
	* Getter.
	* @return result
	*/
	public double getResult() {
		return this.result;
	}
}