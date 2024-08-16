package programa_revistas;

public class Programa_Revistas 
{
    public static void main(String[] args) 
    {
        Revista revistaUm = new Revista("", "", null);
        revistaUm.setNome(" Java Magazine ");
        revistaUm.setIssn(" 223445566-77 ");
        
        Edicao edicao = new Edicao();
        edicao.setNumero(" 01 ");
        edicao.setTiragem(5000);
        
        Artigo artigoUm = new Artigo("", 0);
        artigoUm.setNomeArtigo(" Java para Web ");
        artigoUm.setNumeroPaginas(12);
        
        //vinculando
        revistaUm.setEdicao(edicao);
        edicao.setArtigo(artigoUm);
        System.out.println(revistaUm);
    }
}
