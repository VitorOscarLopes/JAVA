package testEscopo;

public class EscopoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testando Escopo de váriaveis!");
		int idade = 20;
		int quantPessoa = 1;
		
		boolean acompanhado;
		
		if (quantPessoa >= 2) {
			
			acompanhado = true;}
		else {
			
			acompanhado = false;}
		System.out.println("Valor de acompanhado é "+acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Você pode comprar uma bebida.");
		} else {
			System.out.println("Você não pode comprar bebidas.");
		}
	}
}
