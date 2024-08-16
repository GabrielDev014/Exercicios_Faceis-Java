package especificaprofessor;

public class EspecificaProfessor 
{

    public static void main(String[] args) 
    {
        Professor professorUm = new Professor("Rosangela",37);
        
        System.out.println ("professor um: " + professorUm.getNomeProfessor());
        System.out.println ("idade: " + professorUm.getIdadeProfessor());
        
        Professor professorDois = new Professor ("Pedro Antonio", 34);
        
        System.out.println ("professor dois: " + professorDois.getNomeProfessor());
        System.out.println ("idade: " + professorDois.getIdadeProfessor());
        professorDois.setIdadeProfessor(36);
        System.out.println ("idade alterada para o prof dois: " + professorDois.getIdadeProfessor());
    }
    
}
