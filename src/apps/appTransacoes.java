/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apps;

import classes.Movimento;
import classes.Pessoa;
import classes.Transacao;
import contas.Conta;
import contas.ContaComum;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author shynobi
 */
public class appTransacoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Transacao transacoes = new Transacao();
        Pessoa pessoa = new Pessoa("fulano","fulano@gmail.com");
        Conta contacomum = new ContaComum(102030,pessoa,450.00f);
        
        
        float saldoanterior = contacomum.getSaldo();
        
        
        transacoes.realizarTransacao(new Date(), contacomum, 100.00f, "deposito em dinheiro", Conta.DEPOSITAR);
        transacoes.realizarTransacao(new Date(), contacomum, 50.00f, "pagamento de conta", Conta.SACAR);
        transacoes.realizarTransacao(new Date(), contacomum, 120.00f, "pagamento", Conta.SACAR);
        transacoes.realizarTransacao(new Date(), contacomum, 850.00f, "transferencia", Conta.DEPOSITAR);
        
        System.out.println("Emitindo extrato da conta comum Numero: "+contacomum.getNumero());
        System.out.println("Correntista: "+contacomum.getCorrentista().getNome());
        System.out.println("Saldo anterior: "+saldoanterior);
        System.out.println("--------------------------------");
        
        for(Movimento movimento: transacoes.getMovimento()){ // for it
            System.out.println("Data: "+ new SimpleDateFormat("dd/MM/yyyy").format(movimento.getData()));// formatação de data
            System.out.println("Historico: "+ movimento.getHistorico());
            System.out.println("Valor: "+ movimento.getValor());
            System.out.println("Operação: "+(movimento.getOperacao() == Conta.DEPOSITAR ? "Deposito" : "Saque"));// comparação ternaria
            System.out.println("-----------------");
            
        }
        System.out.println("Saldo atual: "+contacomum.getSaldo());
        
    }
    
}
