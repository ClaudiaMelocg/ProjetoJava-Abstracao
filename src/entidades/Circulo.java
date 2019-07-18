package entidades;

import entidades.enums.Cor;

public class Circulo extends Forma {
	private Double raios;
	
	public Circulo() {
		
	}
	
	
	public Circulo(Cor cor, Double raios) {
		super(cor);
		this.raios = raios;
	}






	public Double getRaios() {
		return raios;
	}



	public void setRaios(Double raios) {
		this.raios = raios;
	}



	@Override
	public double area() {
		
		return Math.PI * raios * raios;
	}

}
