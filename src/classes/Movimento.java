/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import contas.Conta;
import java.util.Date;

/**
 *
 * @author shynobi
 */
public class Movimento {
    
    private Date data;
    private Conta conta;
    private String historico;
    private float valor;
    private float saldoanterior;
    private int operacao;
    
    public Movimento(Date data, Conta conta, String historico, float valor, int operacao){
        this.conta=conta;
        this.historico = historico;
        this.valor = valor;
        this.operacao = operacao;
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getSaldoanterior() {
        return saldoanterior;
    }

    public void setSaldoanterior(float saldoanterior) {
        this.saldoanterior = saldoanterior;
    }

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }
    
    
    public boolean movimentar(){
        this.saldoanterior = conta.getSaldo();
        if(operacao == Conta.SACAR){
            return this.conta.movimentar(this.valor, Conta.SACAR);
            
        }else{
            if(operacao == Conta.DEPOSITAR){
            this.conta.movimentar(this.valor, Conta.DEPOSITAR);
            return true;
            }
        }
        return false;
    }
    
    
}
