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
	public boolean saca(double valor){
		if(saldo >= valor){
			saldo -= valor;
			return true;
		}else{
			System.out.println("Não há saldo suficiente. Saque negado!");
			return false;
		}
	}
}
