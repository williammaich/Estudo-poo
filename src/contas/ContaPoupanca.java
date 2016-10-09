/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import classes.Pessoa;

/**
 *
 * @author shynobi
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
    }

    public ContaPoupanca(int numero, Pessoa correntista, float valor) {
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
    
    
}
