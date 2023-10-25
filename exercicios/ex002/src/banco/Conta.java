package banco;

public class Conta {
    String name;
    int age;
    double credit;
    
    public void saca(double value){
        if(credit >= value){
            credit -= value;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Valor do saque: "+value);
            System.out.println("Saldo atual: "+ credit+";");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }else{
            System.out.println("Não foi possível realiza o saque. Saldo insuficiente!");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
    }

    public void deposit(double value){
        credit += value;
        System.out.println("Valor depositado com sucesso!");
        System.out.println("Saldo atual "+credit);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public void trans(double value, Conta pessoa){
        if(credit >= value){
            credit -= value;
            pessoa.credit += value;
            System.out.println("Transferencia efetuada com sucesso!");
            System.out.println("Traferencia total: "+value);
            System.out.println("Saldo atual de "+name+": "+credit);
            System.out.println("Saldo atual de "+pessoa.name+": "+pessoa.credit);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }else{
            System.out.println("Não foi possível relaizar a transferencia. Saldo insuficiente!");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
    }
}
