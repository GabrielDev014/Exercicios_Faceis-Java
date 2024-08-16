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
