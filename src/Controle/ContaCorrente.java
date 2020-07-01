package Controle;

import Utilidades.Data;

/**
 *
 * @author Rafael
 */
public class ContaCorrente extends Conta {
    double taxaMovimentacao;
    public ContaCorrente(int nroConta, Data dataAbertura, Cliente[] clientes, double valorInicial, double taxaMovimentacao) {
        super(nroConta, dataAbertura, clientes, valorInicial);
        this.taxaMovimentacao = taxaMovimentacao;
    }
    
    public boolean fazerDeposito(double valor){
            System.out.println("Será cobrada uma taxa de " + taxaMovimentacao);
            return super.fazerDeposito(valor-taxaMovimentacao);
    }
    public boolean fazerSaque(double valor){
        System.out.println("Será cobrada uma taxa de " + taxaMovimentacao);
        return super.fazerSaque(valor+taxaMovimentacao);
    }
}
