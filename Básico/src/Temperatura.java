import java.util.Scanner;
public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		double grausF, grausC;
		
		System.out.println("Escreva a temperatura em F° (Fahrenheit): ");
		grausF = ler.nextDouble();
		grausC = (grausF - 32)*(5.0/9);
		System.out.println("A temperatura em C° (Celsius) é igual a: " + grausC);
		
		

	}

}
