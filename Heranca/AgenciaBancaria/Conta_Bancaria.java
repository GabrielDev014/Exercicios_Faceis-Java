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
