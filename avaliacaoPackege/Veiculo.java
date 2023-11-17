
public class Veiculo {
	private String marca;
	private String modelo;
	private int ano;
	private double diaria;
	
	
	public Veiculo(String marca, String modelo, int ano, double diaria) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.diaria = diaria;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public double getDiaria() {
		return this.diaria;
	}
	
	public void setDiaria(double diaria) {
		this.diaria = diaria;
	}
}
