
public class CarroSuv extends Veiculo{
	public CarroSuv(String marca, String modelo, int ano, double diaria) {
		super(marca, modelo, ano, diaria);
	}
	
	@Override
	public void setDiaria(double valor) {
		double taxa = 0.5;
		double novoValor = valor + (valor * taxa);
		super.setDiaria(novoValor);
	}
}
