/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apps;

import classes.Pessoa;
import contas.Conta;
import contas.ContaComum;
import java.util.Scanner;

/**
 *
 * @author shynobi
 */
public class appTesteconta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // criando uma interação com o usuario
        Scanner teclado = new Scanner(System.in);
        
        
        int numero;
        String nome;     
        String email;
        float saldo, valordodeposito;
        
        System.out.println("Número da conta: ");
        numero=teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Nome do correntista: ");
        nome=teclado.nextLine();       
        
        System.out.println("Email: ");
        email=teclado.nextLine();
        
        System.out.println("Saldo inicial: ");
        saldo=teclado.nextFloat();
        
        Conta contacomum = new ContaComum(numero, new Pessoa(nome, email), saldo);
        
        System.out.println("valor do deposito: ");
        valordodeposito = teclado.nextFloat();
        
        contacomum.depositar(valordodeposito);
        
        System.out.println("Saldo atual: "+contacomum.getSaldo());     
        
        
        
    }
    
}
