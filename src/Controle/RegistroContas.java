
package Controle;

import Utilidades.Data;


public class RegistroContas {
    public static void main(String[] args){
        Data d = new Data(07,02,1990);
        Correntista c1 = new Correntista("Rafael Fernandes", "000.000.000-11");
        Correntista c2 = new Correntista("Francisco Fernandes", "999.000.000-11");
        Correntista[] correntistas = new Correntista[2];
        correntistas[0] = c1;
        correntistas[1] = c2;
        System.out.println(c1.toString());
        Conta conta1 = new Conta(1, d, correntistas, 200);
        System.out.println(conta1);
        conta1.fazerDeposito(300);
        System.out.println(conta1);
        conta1.fazerSaque(10);
        System.out.println(conta1);
                
    }
}
