import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Calculate {
	public static void main(String[] arg) throws Exception{
		// ������� ������� Calculating...
		System.out.println("Calculating...");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		/* ������������ */
		// ������ ������ ������ �������� � ��������������� ����������
		System.out.println("Enter first int:");			
		final int first = Integer.parseInt(reader.readLine());
		
		// ������ ������ ������ �������� � ��������������� ����������
		System.out.println("Enter second int:");
		final int second = Integer.parseInt(reader.readLine());
		// ���������
		final int sum = first + second;
		
		/* ���������� � ������� */
		// ������ ������ ������ �������� � ��������������� ����������
		System.out.println("Enter first double:");			
		final double dfirst = Double.parseDouble(reader.readLine());
		
		// ������ ������ ������ �������� � ��������������� ����������
		System.out.println("Enter seconf double:");			
		final double dsecond = Double.parseDouble(reader.readLine());
		// �������� � �������
		final double pow = Math.pow(dfirst, dsecond);
		
		// ������ ��������� � �������
		System.out.println("Sum: " + sum);
		System.out.println("Pow: " + pow);
	}
}