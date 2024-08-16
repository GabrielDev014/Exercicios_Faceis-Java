package gerarseres;

public class Arvore extends Seres_Vivos
{
    private int anoPlantio;
    private int numeroAneis;
    
    public Arvore (String nome, int idade, int anoPlantio, int numeroAneis)
    {
        super(nome, idade);
        this.anoPlantio = anoPlantio;
        this.numeroAneis = numeroAneis;
    }
    
    public void calcularIdade (int anoAtual)
    {
        this.numeroAneis = (anoAtual - this.anoPlantio);
        this.setIdade(this.numeroAneis);
    }
    
    public int getAnoPlantio()
    {
        return anoPlantio;
    }
    
    public int getNumeroAneis()
    {
        return numeroAneis;
    }
    
    public void setAnoPlantio(int anoPlantio)
    {
        this.anoPlantio = anoPlantio;
    }
    
    public void setNumeroAneis (int numeroAneis)
    {
        this.numeroAneis = numeroAneis;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\nAno do plantio: " + this.anoPlantio + "\nNúmero de anéis: " + this.numeroAneis;
    }
}
