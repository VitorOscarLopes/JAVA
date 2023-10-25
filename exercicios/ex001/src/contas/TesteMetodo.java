package contas;

public class TesteMetodo {
	
	public static void main(String[] args) {
		Conta contaDoVitor = new Conta();
		
		contaDoVitor.saldo =100;
		contaDoVitor.deposita(50);
		System.out.println(contaDoVitor.saldo);

		System.out.println(contaDoVitor.saca(154));
		System.out.println(contaDoVitor.saldo);

		Conta contaDaGiovanna = new Conta();
		contaDaGiovanna.deposita(1000);
		contaDaGiovanna.transfere(300, contaDoVitor);

		System.out.println(contaDaGiovanna.saldo);
		System.out.println(contaDoVitor.saldo);
	}
}
