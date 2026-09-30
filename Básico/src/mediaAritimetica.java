import java.util.Scanner;
public class mediaAritimetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int nota1, nota2, nota3, nota4,soma,media;
		System.out.println("Insira a 1° nota: ");
		nota1 = ler.nextInt();
		System.out.println("Insira a 2° nota: ");
		nota2 = ler.nextInt();
		System.out.println("Insira a 3° nota: ");
		nota3 = ler.nextInt();
		System.out.println("Insira a 4° nota: ");
		nota4 = ler.nextInt();
		soma = nota1 + nota2 + nota3 + nota4;
		media = soma/4;
		System.out.println(" Média final: " + media);
		
	}

}
