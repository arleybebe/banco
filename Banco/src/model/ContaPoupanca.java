package model;

/**
 *
 * @author Arley Bebe
 */
public class ContaPoupanca extends ContaBancaria implements Imprimivel{
    
    private double credito=200;

    public ContaPoupanca(int numeroDaConta, double saldo, String titular) {
        super(numeroDaConta,saldo,titular);
    }
    
    @Override
    public boolean sacar(double valor) {
        if(this.saldo<=valor+credito){
            this.saldo-=valor;
            System.out.println("Saque efectuado.. Saldo actual:"+this.saldo);
            return true;
        }else{
            System.out.println("Impossivel sacar esse valor..");
            return false;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo+=valor;
        System.out.println("Valor depositado..Saldo actual:"+this.saldo);
    }

    @Override
    public String mostrarDados() {

        String dados=new String();
        dados+="Conta Poupanca;";
        dados+=this.numeroDaConta+";";
        dados+=this.titular+";";
        dados+=this.saldo;
        return dados;
    
    }
    
}
