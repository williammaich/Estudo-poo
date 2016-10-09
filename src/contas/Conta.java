/*
Classe Conta se tornou uma classe modelo para as outras 
classes como Conta Comum e Conta Especial, assim 
tornando elas como finais.

No casso a classe conta é uma Classe raiz e as outras 
usão a denominação extends que assim ela herda o construtor da
classe conta.

Utilização do protect é para que seja vista em qualquer pacote.

As classes especiais tem o a sua forma de metodos que cabem a ela
ou seja ela fica independente para ter o seu metodo proprio.

poliformico - é para metodos que são modificados em cada
classe.
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
