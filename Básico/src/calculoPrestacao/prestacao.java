package calculoPrestacao;
import java.util.Scanner;
public class prestacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		double prestacao, preco, taxa, tempo;
		
		System.out.println("Insira o preço do produto: ");
		preco = ler.nextDouble();
		System.out.println("Insira a taxa da prestação: ");
		taxa = ler.nextDouble();
		System.out.println("Insira os dias de atraso: ");
		tempo = ler.nextDouble();
		prestacao = preco + (preco*(taxa/100)*tempo);
		System.out.println("o novo valor da prestação foi de: " + prestacao);
		
		
	}

}
