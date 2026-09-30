package revisao;
import java.util.Scanner;
public class pintada_na_parede {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		double largura, altura, parede, paredePintuda;
		
		System.out.println("Insira a largura da parede: ");
		largura = ler.nextDouble();
		System.out.println("Insira a altura da parede: ");
		altura = ler.nextDouble();
		parede = largura * altura;
		paredePintuda = parede/3.8;
		System.out.println("Você precisará de " + paredePintuda + " baldes de tinta para pintar a parede.");
	}

}
