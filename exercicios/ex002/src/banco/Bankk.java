package banco;

public class Bankk {
    public static void main(String[] args) {
        Conta contaV = new Conta();
        contaV.name = "Vitor Oscar Lopes da Fonseca";
        contaV.credit = 0;
        contaV.age = 19;
        Conta contaG = new Conta();
        contaG.name = "Giovanna Magalhães Oliveira";
        contaV.credit = 0;
        contaV.age = 18;

        contaV.deposit(1000);
        contaV.trans(300, contaG);

        contaG.saca(100);
    }
}
