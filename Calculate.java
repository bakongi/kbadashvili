package kbadashvili; //Добавил пакет

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Calculate {
	public static void main(String[] args) throws Exception{
		// Âûâîäèì íàäïèñü Calculating...
		System.out.println("Calculating...");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		/* Ñóììèðîâàíèå */
		// Ïðîñèì ââåñòè ïåðâûé ïàðàìåòð ñ ñîîòâåòñòâóþùèì ñîîáùåíèåì
		System.out.println("Enter first int:");			
		final int first = Integer.parseInt(reader.readLine());
		
		// Ïðîñèì ââåñòè âòîðîé ïàðàìåòð ñ ñîîòâåòñòâóþùèì ñîîáùåíèåì
		System.out.println("Enter second int:");
		final int second = Integer.parseInt(reader.readLine());
		// Ñóììèðóåì
		final int sum = first + second;
		
		/* Âîçâåäåíèå â ñòåïåíü */
		// Ïðîñèì ââåñòè ïåðâûé ïàðàìåòð ñ ñîîòâåòñòâóþùèì ñîîáùåíèåì
		System.out.println("Enter first double:");			
		final double dfirst = Double.parseDouble(reader.readLine());
		
		// Ïðîñèì ââåñòè âòîðîé ïàðàìåòð ñ ñîîòâåòñòâóþùèì ñîîáùåíèåì
		System.out.println("Enter seconf double:");			
		final double dsecond = Double.parseDouble(reader.readLine());
		// Âîçâîäèì â ñòåïåíü
		final double pow = Math.pow(dfirst, dsecond);
		
		// Âûâîäè ðåçóëüòàò â êîíñîëü
		System.out.println("Sum: " + sum);
		System.out.println("Pow: " + pow);
	}
}