package contas;

//saldo, agencia, número e titular.
public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		saldo += valor;
	}
}
