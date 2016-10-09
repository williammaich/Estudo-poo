/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apps;

import classes.Pessoa;
import contas.Conta;
import contas.ContaComum;
import contas.ContaEspecial;

/**
 *
 * @author william
 */
public class appContas {
    /*
    Foi criado um objeto do tipo pessoa p1;
    foi utilizado o contrutor sobrecarregado c1 de conta comum, que recebe
    o numero de conta, pessoa, e o valor na conta.
    
    foi mostrado o numero de contas instanciadas até o momento: utilizando o 
    getNumeroContas.
    
    
    na conta especial tambem foi utilisado o construtor, e recebeu, o numero da conta
    pessoa, limite e valor;
    */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa ("Fulano", "fulano@gmail.com");
        ContaComum c1 = new ContaComum(123456,p1,150.00f );
        
        System.out.println("numero de contas instanciadas ate o momento: "+c1.getNumeroContas());
    
         ContaEspecial e1 = new ContaEspecial(123456,p1,2500.00f,5500.00f);
         
         System.out.println("numero de contas especial: "+e1.getNumeroContas());
 
    if(c1.movimentar(1000.00f, Conta.SACAR)){
        System.out.println("saque realizado");
    }else{
        System.out.println("impossivel");
        System.out.println("nome do correntista: "+c1.getCorrentista());
        
    }
    
    }   
    
}
