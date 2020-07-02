package Controle;

import Utilidades.Data;

public abstract class Conta {
    int nroConta;
    double saldo;
    private Data dataAbertura;
    private Cliente[] clientes;
    
    public Conta(int nroConta, Data dataAbertura, Cliente[] clientes, double valorInicial){
        this.nroConta = nroConta;
        this.dataAbertura = dataAbertura;
        this.clientes = clientes;
        this.saldo = valorInicial;
    }
    
    public String toString(){
        String resposta =  "Número da conta: "+nroConta + " - Saldo: "+ saldo + " - Data de Abertura: " + dataAbertura.toString();
        for(int i=0; i<clientes.length; i++){
            resposta = resposta + " " + clientes[i];
        }
        return resposta;
    }
    
    public boolean fazerDeposito(double valor){
        if(valor >=0){
            this.saldo+=valor;
            return true;
        }
        else
            return false;
    }
    public boolean fazerSaque(double valor){
        if(saldo > valor){
            saldo-=valor;
            return true;
        }
        else
            return false;
    }
    public boolean fazerTransferencia(Conta destino, double valor){
        if(this.fazerSaque(valor)){
            destino.fazerDeposito(valor);
            return true;
        }
        else{
            return false;
        }
    }
}
