import java.util.Scanner;

class SomandoValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int v1,v2,soma; // Declarando variáveis
		
		System.out.println("Insira o 1° valor:");
		v1 = ler.nextInt();
		System.out.println("Insira o 2° valor:");
		v2 = ler.nextInt();
		soma = v1+v2;
		System.out.println("A soma dos valores é: " + soma);
	}

}
