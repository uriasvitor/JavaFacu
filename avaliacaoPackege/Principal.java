
import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite qual a marca do Sedan");
		String marcaSedan = scanner.nextLine();
		
		System.out.println("Digite qual o modelo");
		String modeloSedan = scanner.nextLine();
		
		System.out.println("Digite qual o ano do veiculo");
		int anoSedan = scanner.nextInt();
		scanner.nextLine();
		 
		System.out.println("Digite qual o preco da diaria");
		double precoDaDiariaSedan = scanner.nextDouble();
		scanner.nextLine();
		
		Veiculo sedan = new Veiculo(marcaSedan, modeloSedan, anoSedan, precoDaDiariaSedan);

		System.out.println("Digite qual a marca do SUV");
		String marcaSUV = scanner.nextLine();
		
		System.out.println("Digite qual o modelo");
		String modeloSUV = scanner.nextLine();
		
		System.out.println("Digite qual o ano do veiculo");
		int anoSUV = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite qual o preco da diaria");
		double precoDaDiariaSUV = scanner.nextDouble();
		scanner.nextLine();
		
		Veiculo suv = new Veiculo(marcaSUV, modeloSUV, anoSUV, precoDaDiariaSUV);
		
		System.out.print(" Digite a quantidade de dias para a locação:");
        int diasLocacao = scanner.nextInt();

        Locacao locacaoSedan = new Locacao(sedan, diasLocacao);
        Locacao locacaoSUV = new Locacao(suv, diasLocacao);
        
        System.out.println("Valor da locação do "+ sedan.getMarca() + " Carro Sedan: R$ " + locacaoSedan.valorAlocacao());
        System.out.println("Valor da locação do "+ suv.getMarca() + " Carro SUV: R$ " + locacaoSUV.valorAlocacao());

        scanner.close();
	}
}
