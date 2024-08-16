package gerarseres;

public class Pessoa extends Seres_Vivos
{
   private int anoNasc;
   
   public Pessoa (String nome, int idade, int anoNasc)
   {
       super (nome, idade);
       this.setAnoNasc(anoNasc);
   }
   
   public void calcularIdade(int anoAtual)
   {
       this.setIdade(anoAtual - this.anoNasc);
   }
   
   public int getAnoNasc()
   {
       return anoNasc;
   }
   
   public void setAnoNasc(int anoNasc)
   {
       this.anoNasc = anoNasc;
   }
   
   @Override
    public String toString()
    {
        return super.toString() + "\nNascido em: " + this.anoNasc;
    }
}
