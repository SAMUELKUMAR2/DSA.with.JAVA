package LECTURE7;
import java.util.*;
public class Fahrenheit_to_celcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int minf = sc.nextInt();
		int maxf = sc.nextInt();
		int steps = sc.nextInt();
		for (int i = minf; i<=maxf; i=i+steps) {
			int c = (int)(5.0/9*(i-32)); //type-casting into int from doble(5.0/9=0.5)
			System.out.println(i+"\t"+ c);
		}
		
	}

}
