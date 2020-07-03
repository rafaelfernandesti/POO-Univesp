package Controle;

import Utilidades.Data;


public class RegistroContas {
    public static void main(String[] args){
        Data d1 = new Data(07,02,1990);
        Data d2 = new Data(17,02,1992);
        Cliente c11 = new Cliente("Rafael Fernandes", "000.000.000-11");
        Cliente c12 = new Cliente("Francisco Fernandes", "999.000.000-11");
        Cliente c2 = new Cliente("Fernando Rafael", "999.999.999-99");
        Cliente[] listaClientes1 = new Cliente[2];
        listaClientes1[0] = c11;
        listaClientes1[1] = c12;
        Cliente[] listaClientes2 = new Cliente[1];
        listaClientes2[0] = c2;
        
        Conta conta1 = new ContaCorrente(12345, d1, listaClientes1, 200,10);
        Conta conta2 = new ContaPoupanca(54321, d2, listaClientes2, 300);
        
        conta1.fazerDeposito(800);
        System.out.println(conta1);
        if(conta1.fazerSaque(900) == true){
            System.out.println("Saque realizado");
        }else{
            System.out.println("Saque não realizado, saldo insuficiente");
        }
        System.out.println(conta1);
        
        conta2.fazerDeposito(700);
        System.out.println(conta2);
        
                
    }
}
