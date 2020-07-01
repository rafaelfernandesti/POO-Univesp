package Controle;

import Utilidades.Data;

public class Conta {
    int nroConta;
    double saldo;
    private Data dataAbertura;
    private Correntista[] correntistas;
    
    public Conta(int nroConta, Data dataAbertura, Correntista[] correntistas, double valorInicial){
        this.nroConta = nroConta;
        this.dataAbertura = dataAbertura;
        this.correntistas = correntistas;
        this.saldo = valorInicial;
    }
    
    public String toString(){
        String resposta =  "Número da conta: "+nroConta + " - Saldo: "+ saldo + " - Data de Abertura: " + dataAbertura.toString();
        for(int i=0; i<correntistas.length; i++){
            resposta = resposta + " " + correntistas[i];
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
