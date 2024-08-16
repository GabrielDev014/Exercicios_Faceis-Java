package agencia_bancaria;

public class Agencia_Bancaria 
{
    public static void main(String[] args) 
    {
        Conta_Bancaria contaUm = new Conta_Bancaria ("Gabriel", 300);
        System.out.println("Indivíduo: " + contaUm.getTitular());
        contaUm.saque(30);
        System.out.println("Extrato: " + contaUm.toString());
        contaUm.deposito(200);
        System.out.println("Extrato: " + contaUm.toString());
        
        System.out.println("");
        
        Conta_Especial contaEspecialUm = new Conta_Especial (50, "Marina", 500);
        System.out.println("Indivíduo: " + contaEspecialUm.getTitular());
        contaEspecialUm.saque(100);
        
        System.out.println("Extrato: " + contaEspecialUm.toString());
        contaEspecialUm.saque(20);
        
        System.out.println("Extrato: " + contaEspecialUm.toString());
        contaEspecialUm.deposito(600);
        
        System.out.println("Extrato: " + contaEspecialUm.toString());
    }
}
