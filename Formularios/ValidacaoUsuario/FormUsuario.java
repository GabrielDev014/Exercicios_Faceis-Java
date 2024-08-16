package usarformusuario;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class FormUsuario extends Frame implements ActionListener
{
    protected Dimension dQuadro, dRotulo, dCaixaTexto, dBotao;
    protected Button bValidar, bSair;
    protected TextField tfUsuario;
    protected Label lUsuario;
    
    Usuario usuarioUm = new Usuario("Gabriel");
    
    public FormUsuario()
    {
        Dimension dQuadro = new Dimension (300, 230);
        Dimension dRotulo = new Dimension (45, 25);
        Dimension dCaixaTexto = new Dimension (180, 25);
        Dimension dBotao = new Dimension (130, 25);
        
        setTitle("Validar Usuário");
        setResizable(false);
        setSize(dQuadro);
        setLocation(250, 280);
        setLayout(null);
        
        lUsuario = new Label ("Usuário");
        lUsuario.setSize(dRotulo);
        lUsuario.setLocation(25, 50);
        
        tfUsuario = new TextField();
        tfUsuario.setSize(dCaixaTexto);
        tfUsuario.setLocation(80, 50);
        
        bValidar = new Button("Validar Usuário");
        bValidar.setSize(dBotao);
        bValidar.setLocation(25, 150);
        bValidar.addActionListener(this);
        
        bSair = new Button("Sair");
        bSair.setSize(dBotao);
        bSair.setLocation(160,150);
        bSair.addActionListener(this);
        
        add(lUsuario);
        add(tfUsuario);
        add(bValidar);
        add(bSair);
    }
    public void actionPerformed(ActionEvent evento)
    {
        if(evento.getSource() == bValidar)
        {
            usuarioUm.validarUsuario(tfUsuario.getText());
        }
        if (evento.getSource() == bSair)
        {
            System.out.println("Fim do aplicativo. Obrigado!");
            System.exit(0);
        }
    }
}
