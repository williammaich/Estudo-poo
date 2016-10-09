/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import classes.Taxas;
import classes.Pessoa;

/**
 *
 * @author shynobi
 */
public final class ContaComum extends Conta implements Taxas{
    
    

    public ContaComum() {
    }

    public ContaComum(int numero, Pessoa correntista, float valor) {
        super(numero, correntista, valor);
    }
    
    @Override
    public boolean sacar(float valor){
        if(this.getSaldo() >= valor){
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
