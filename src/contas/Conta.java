/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import classes.Pessoa;

/**
 *
 * @author william
 */
public abstract class Conta {
    
    protected int numero;
    protected Pessoa correntista;
    protected float saldo;
    private static int numero_contas;
    
    public Conta(){
        IncrementaContas();
    }
    
    public Conta(int numero, Pessoa correntista, float valor){
        this();
        this.setNumero(numero);
        this.setCorrentista(correntista);
        this.setSaldo(valor);
    }

    public final int getNumero() {
        return numero;
    }

    public final void setNumero(int numero) {
        this.numero = numero;
    }

    public final Pessoa getCorrentista() {
        return correntista;
    }

    public final void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }

    public final float getSaldo() {
        return saldo;
    }

    public final void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public final void depositar(float valor){
        this.setSaldo(this.getSaldo() + valor);
    }
   
    public abstract boolean sacar(float valor);
       
    
    private static void IncrementaContas(){
        ++numero_contas;
    }
    
}
