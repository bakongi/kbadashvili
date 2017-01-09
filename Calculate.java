import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Calculate {
	public static void main(String[] arg) throws Exception{
		// Выводим надпись Calculating...
		System.out.println("Calculating...");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		/* Суммирование */
		// Просим ввести первый параметр с соответствующим сообщением
		System.out.println("Enter first int:");			
		final int first = Integer.parseInt(reader.readLine());
		
		// Просим ввести второй параметр с соответствующим сообщением
		System.out.println("Enter second int:");
		final int second = Integer.parseInt(reader.readLine());
		// Суммируем
		final int sum = first + second;
		
		/* Возведение в степень */
		// Просим ввести первый параметр с соответствующим сообщением
		System.out.println("Enter first double:");			
		final double dfirst = Double.parseDouble(reader.readLine());
		
		// Просим ввести второй параметр с соответствующим сообщением
		System.out.println("Enter seconf double:");			
		final double dsecond = Double.parseDouble(reader.readLine());
		// Возводим в степень
		final double pow = Math.pow(dfirst, dsecond);
		
		// Выводи результат в консоль
		System.out.println("Sum: " + sum);
		System.out.println("Pow: " + pow);
	}
}