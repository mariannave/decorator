package concreteDecorator;

import component.Numero;
import decorator.NumeroDecorator;

public class NumeroChaves extends NumeroDecorator{
	
	public NumeroChaves(Numero numero){
		super(numero);
	}

	@Override
	public void imprimir() {
		System.out.print("{");
		this.getNumero().imprimir();
		System.out.print("}");
	}
}
