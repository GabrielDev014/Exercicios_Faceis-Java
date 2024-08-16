package programaagencia;

import java.util.Scanner;

public class ProgramaAgencia 
{
    public static void main(String[] args) 
    {
        Scanner entradaDados = new Scanner ( System.in );
        ContaBancaria contaUm = new ContaBancaria();
        
        contaUm.saldo = 100;
        
        System.out.print( "Digite o nome do titular: ");
        contaUm.titular = entradaDados.nextLine();
        
        System.out.print( "Digite o valor a ser retirado: ");
        contaUm.saque(entradaDados.nextDouble());
        
        System.out.println(contaUm.extratoSimples());
    }
}
