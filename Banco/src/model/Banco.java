package model;
import java.util.ArrayList;

/**
 *
 * @author Arley Bebe
 */
public class Banco implements Imprimivel{
    
    private ArrayList<ContaBancaria> contas=new ArrayList<>();
    
    public void inserir(ContaBancaria conta){
        this.contas.add(conta);
    }
    
    public void remover(ContaBancaria conta){
        this.contas.remove(conta);
    }
    
    public ContaBancaria procurarConta(int numeroDaConta){
        
        for(ContaBancaria cb:contas){
            if(cb.numeroDaConta==numeroDaConta){
                return cb;
            }
        }
        return null;
    }

    @Override
    public String mostrarDados(){
        
        String m="";
        
        for(ContaBancaria cb:contas){
            Imprimivel i=(Imprimivel)cb;
            m=i.mostrarDados()+"\n";
            System.out.println(i.mostrarDados());
        }
        
        return m;
    }
}
