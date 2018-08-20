package model;
/**
 *
 * @author Arley Bebe
 */
public class TesteContas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ContaBancaria cc=new ContaCorrente(1234,2500,"Arnaldo");
        ContaBancaria cp=new ContaPoupanca(2468,1250,"Jose");
        
        cc.depositar(1000);
        cp.depositar(1000);
        
        cc.sacar(500);
        cp.sacar(1200);

        Relatorio relatorio=new Relatorio();
        Imprimivel ic=(Imprimivel)cc;
        Imprimivel ip=(Imprimivel)cp;
        
        relatorio.gerarRelatorio(ic);
        relatorio.gerarRelatorio(ip);
        /*
        System.out.println(cc.saldo);
        System.out.println(cp.saldo);
        
        cc.transferir(cp, 210);
        */
    }
    
}
