
public class Locacao {
	private Veiculo objAluguel;
	private int dias;
	
	public Locacao(Veiculo objAluguel, int dias) {
		this.objAluguel = objAluguel;
		this.dias = dias;
	}
	
	public double valorAlocacao() {
		return objAluguel.getDiaria() * this.dias;
	}
}
