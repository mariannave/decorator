package concreteComponent;

import component.Numero;

public class NumeroUm implements Numero{
	private String numero;
	
	public NumeroUm(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return  numero;
	}

	@Override
	public void imprimir() {
		System.out.print(numero);
		
	}

	
	
}
