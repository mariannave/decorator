import component.Numero;
import concreteComponent.NumeroUm;
import concreteDecorator.NumeroChaves;
import concreteDecorator.NumeroParenteses;

public class Client {
	public static void main(String[] args){
		Numero numero = new NumeroUm("1");
		
		//Numero com chaves
		Numero n1 = new NumeroChaves(numero);
		n1.imprimir();
		System.out.println("\n");
		
		//Numero com parenteses envolvido com chaves
		Numero n2 = new NumeroChaves(n1);
		n2.imprimir();
		System.out.println("\n");
		
		//Numero com parenteses
		Numero n3 = new NumeroParenteses(numero);
		n3.imprimir();
	}
}
