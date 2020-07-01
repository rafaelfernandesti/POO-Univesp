package Controle;

import Utilidades.Data;

/**
 *
 * @author Rafael Fernandes
 */
public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(int nroConta, Data dataAbertura, Cliente[] clientes, double valorInicial) {
        super(nroConta, dataAbertura, clientes, valorInicial);
    }
    
}
