package model;

/**
 *
 * @author Arley Bebe
 */
public class ContaCorrente extends ContaBancaria implements Imprimivel{

    private double taxaOperacao=0.03;

    public ContaCorrente(int numeroDaConta,double saldo,String titular) {
        super(numeroDaConta, saldo, titular);
    }

    @Override
    public boolean sacar(double valor) {
        
        double valorFinal=valor+(valor*this.taxaOperacao);
        if(valorFinal<=this.saldo){
            System.out.println("Valor final:"+valorFinal);
            this.saldo-=valorFinal;
            System.out.println("Saque efectuado.. Saldo actual:"+this.saldo);
            return true;
        }else{
            System.out.println("Saldo indisponivel para esse saque..");
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
        dados+="Conta Corrente;";
        dados+=this.numeroDaConta+";";
        dados+=this.titular+";";
        dados+=this.saldo;
        return dados;
    
    }

}
