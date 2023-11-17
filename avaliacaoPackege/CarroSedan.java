

public class CarroSedan extends Veiculo{

	public CarroSedan(String marca, String modelo, int ano, double diaria) {
		super(marca, modelo, ano, diaria);
	}
	
	@Override
	public void setDiaria(double valor) {
		double taxa = valor * 1.1;
		super.setDiaria(taxa);
	}
	
}
