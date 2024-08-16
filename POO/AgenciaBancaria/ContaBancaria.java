package programaagencia;
public class ContaBancaria 
{
    public String titular;
    public double saldo;
    
    public void saque (double valor)
    {
        if (saldo >= valor)
        {
            System.out.println("Retirada: " + valor);
            saldo = saldo - valor;
        }
        else
        {
            System.out.println("Saldo insuficiente para a retirada de: " + valor);
        }
    }
    
    public String extratoSimples()
    {
        return "Correntista: " + titular + " Valor atual da conta: " + saldo;
    }      
}
