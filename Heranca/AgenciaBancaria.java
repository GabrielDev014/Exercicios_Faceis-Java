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

package agencia_bancaria;

public class Conta_Bancaria 
{
    private String titular;
    private double saldo;
    
    public Conta_Bancaria (String titular, double saldo)
    {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public String getTitular()
    {
        return titular;
    }
    
    public void setTitular(String titular)
    {
        this.titular = titular;
    }
    
    public double getSaldo()
    {
        return saldo;
    }
    
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    //Verificando se o saldo pode ser efetuado
    public void saque(double debito)
    {
        if (saldo >= debito)
        {
            System.out.println("Retirada: " + debito);
            saldo = saldo - debito;
        }
        else
        {
            System.out.println("Saldo insuficiente para a retirada de: " + debito);
        }
    }
    
    public void deposito(double credito)
    {
        System.out.println("Creditado: " + credito);
        saldo = saldo + credito;
    }
    
    @Override
    public String toString()
    {
        return "Contas{" + "titular = " + titular + ", saldo atual: " + saldo + '}';
    }
}

package agencia_bancaria;

public class Conta_Especial extends Conta_Bancaria
{
    private double limite;
    
    public Conta_Especial (double limite, String titular, double saldo)
    {
        super (titular, saldo);
        this.limite = limite;
    }
    
    public void limiteCredito (double credito)
    {
        limite = limite + credito;
    }
    
    public double getLimite()
    {
        return limite;
    }
    
    public void setLimite (double limite)
    {
        this.limite = limite;
        setSaldo(limite + getSaldo());
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\nLimite: " + limite;
    }
}
