package model;

/**
 *
 * @author Arley Bebe
 */
public abstract class ContaBancaria {
    
    protected int numeroDaConta;
    protected double saldo=0;
    protected String[] historico;
    protected String titular;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String[] getHistorico() {
        return historico;
    }

    public void setHistorico(String[] historico) {
        this.historico = historico;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    

    public ContaBancaria(int numeroDaConta,double saldo, String titular) {
        this.numeroDaConta = numeroDaConta;
        this.saldo=saldo;
        this.titular=titular;
    }
    
    public abstract boolean sacar(double valor);
    public abstract void depositar(double valor);
    
    public void transferir(ContaBancaria conta, double valor){
    
        if(this.sacar(valor)){
            conta.depositar(valor);
        }
    
    }
}
