package usarformusuario;

import javax.swing.JOptionPane;

public class Usuario 
{
    private String nomeUsuario;
    
    public Usuario(String nomeUsuario)
    {
        this.nomeUsuario = nomeUsuario;
    }
    public String getNome()
    {
        return nomeUsuario;
    }
    public void setNome(String nomeUsuario)
    {
        this.nomeUsuario = nomeUsuario;
    }
    
    public void validarUsuario(String id)
    {
        if (this.nomeUsuario.equals(id))
        {
            JOptionPane.showMessageDialog(null, " Usuário " + this.nomeUsuario + " autorizado! ");
        }
        else
        {
            JOptionPane.showMessageDialog(null, " Usuário " + id + " desconhecido! " );
        }
    }
}
