package contas;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		Conta segundaConta = new Conta();
		segundaConta.saldo = 1000;
		
		System.out.println("Saldo da primeira conta = "+primeiraConta.saldo+";");
		System.out.println("Saldo da segunda conta = "+segundaConta.saldo+";");
	}
}
