package gerarseres;

public class GerarSeres 
{
    public static void main(String[] args) 
    {
        Pessoa pessoaUm = new Pessoa ("Gabriel",0,2004);
        pessoaUm.calcularIdade(2023);
        System.out.println(pessoaUm);
        System.out.println("Idade do individuo: " + pessoaUm.getIdade() + " anos");
        
        System.out.println("");
        
        Arvore arvoreUm = new Arvore ("Carvalho", 0, 1910, 0);
        arvoreUm.calcularIdade(2023);
        System.out.println(arvoreUm);
        System.out.println("Idade da árvore: " + arvoreUm.getIdade() + " anos");
        
    }
}

package gerarseres;

public class Seres_Vivos 
{
    private String nome;
    private int idade;
    
    public Seres_Vivos (String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome()
    {
        return nome;
    }
    public int getIdade()
    {
        return idade;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    @Override
    public String toString()
    {
        return "Nome: " + this.nome + "\nIdade: " + this.idade + " anos ";
    }
}

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
