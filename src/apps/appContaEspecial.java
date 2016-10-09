/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apps;

import classes.Pessoa;
import contas.ContaEspecial;

/**
 *
 * @author shynobi
 */
public class appContaEspecial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Ciclano", "Ciclano@gmail.com");
        
        ContaEspecial e1 = new ContaEspecial(123456, p1, 0.00f, -1000.00f);
        
        System.out.println("Saldo inicial da sua conta: " + e1.getSaldo());
        System.out.println("o limite da sua conta é: " + e1.getLimite());
        
        if(e1.sacar(1000.00f)){
            System.out.println("Operação realizada com sucesso");
            System.out.println("saldo atual da conta: "+e1.getSaldo());
            e1.descontarTaxaManutencao();
            System.out.println("saldo apos deconto: "+e1.getSaldo());
        }else{
            System.out.println("Saldo insuficiente");
        }
        
       
        
        
        
    }
    
}
