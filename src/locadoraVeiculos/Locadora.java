package locadoraVeiculos;
import java.util.Scanner;


public class Locadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Carro.carros[0] = new Carro(1, "Ford KA", false);
		Carro.carros[1] = new Carro(2, "Fiat Uno", false);
		Carro.carros[2] = new Carro(3, "Civic sedan", false);
		Carro.carros[3] = new Carro(4, "Hilux CD", false);
		Carro.carros[4] = new Carro(5, "Onix", false);
		
		int opcao = 0;
		
		while(opcao != 3) {
			for (Carro carro : Carro.carros) {
				System.out.println("código: " + carro.getCodigo() + " | Modelo: "+ carro.getModelo());
			}
			System.out.println("\nMenu: ");
			System.out.println("1 - Locar ");
			System.out.println("2 - Devolver ");
			System.out.println("3 - Sair ");
			System.out.println("Escolha uma opção: ");
			opcao = scan.nextInt();
			
			switch (opcao) {
			case 1: {
				System.out.println("Digite o codigo do carro que deseja locar: ");
				int codigoLocar = scan.nextInt();
				Carro.carros[0].Locar(codigoLocar);
				System.out.println("\nNúmero de carros locados: " + Carro.numLocados);
				System.out.println();
				break;
			}
			case 2:{
				System.out.println("Digite o código do carro que deseja devolver: ");
				int codigoDevolver = scan.nextInt();
				Carro.carros[0].Devolver(codigoDevolver);
				System.out.println("\nNúmero de carros locados: "+ Carro.numLocados);
				System.out.println();
				break;
			}
			case 3:{
				System.out.println("Saindo...");
				break;
			}
			default:
				System.out.println("Digite uma opção válida");
				break;
			}
			
		}
		scan.close();
	}
}