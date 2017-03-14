package decorator;

import component.Numero;

public abstract class NumeroDecorator implements Numero{
	private Numero numero;
	
	public NumeroDecorator(Numero numero){
		this.numero = numero;
	}

	public Numero getNumero() {
		return this.numero;
	}

	public void setNumero(Numero numero) {
		this.numero = numero;
	}
	
}
