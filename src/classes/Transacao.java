/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import contas.Conta;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author shynobi
 */
public class Transacao {
    
   
    
    private List<Movimento> movimentos;
    
    public Transacao(){
        movimentos = new ArrayList<>();
    }
    
    public boolean realizarTransacao(Date data, Conta conta, float valor, String historico, int operacao){
        Movimento movimento = new Movimento(data,conta,historico,valor,operacao);
        
        if(!movimento.movimentar()){
            return false;
        }else{
            this.movimentos.add(movimento);
            return true;
        }
        
    
    }
        
        public void estornaTransacao(){
            for(Movimento movimento: this.movimentos){
                movimento = null;
            }
        }

        
        
        public List<Movimento> getMovimento(){
            return this.movimentos;
        }
}
