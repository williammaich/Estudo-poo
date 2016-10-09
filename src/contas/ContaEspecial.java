/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import classes.Pessoa;
import contas.Conta;

/**
 *
 * @author shynobi
 */
public final class ContaEspecial extends Conta implements Taxas{
    
    private float limite;
    
    
    public ContaEspecial(){
        
    }

    public ContaEspecial(int numero, Pessoa correntista, float valor, float limite) {
        super(numero, correntista, valor);
        this.setLimite(limite);
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    
    @Override
    public boolean sacar(float valor){
        if(this.getSaldo() - valor >= this.getLimite()){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }
    
    @Override
    public float getTaxaManutencao(){
        return 15.00f ;
    }
    
    @Override
    public void descontarTaxaManutencao(){
        this.setSaldo(this.getSaldo() - this.getTaxaManutencao());
    }
}
