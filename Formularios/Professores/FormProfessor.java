package usarformprofessor;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class FormProfessor extends Frame implements ActionListener
{
    protected Dimension dQuadro, dRotulo, dCaixaTexto, dBotao;
    protected Button bValidar, bSair;
    protected TextField tfNome, tfIdade;
    protected Label lNome, lIdade;
    
    Professor professorUm = new Professor ("", 0);
    
    public FormProfessor()
    {
        Dimension dQuadro = new Dimension (300, 230);
        Dimension dRotulo = new Dimension (45, 25);
        Dimension dCaixaTexto = new Dimension (180, 25);
        Dimension dBotao = new Dimension (130, 25);
        
        setTitle("Formulário Professor");
        setResizable(false);
        setSize(dQuadro);
        setLocation(250, 280);
        setLayout(null);
        
        lNome = new Label("Nome");
        lNome.setSize(dRotulo);
        lNome.setLocation(25, 50);
        
        tfNome = new TextField();
        tfNome.setSize (dCaixaTexto);
        tfNome.setLocation (80, 50);
        
        lIdade = new Label ("Idade");
        lIdade.setSize(dRotulo);
        lIdade.setLocation(25, 90);
        
        tfIdade = new TextField();
        tfIdade.setSize(dCaixaTexto);
        tfIdade.setLocation(80, 90);
        
        bValidar = new Button ("Cadastrar Professor");
        bValidar.setSize(dBotao);
        bValidar.setLocation (25, 150);
        bValidar.addActionListener(this);
        
        bSair = new Button("Sair");
        bSair.setSize(dBotao);
        bSair.setLocation(160, 150);
        bSair.addActionListener(this);
        
        add (lNome);
        add (lIdade);
        add (tfNome);
        add (tfIdade);
        add (bValidar);
        add (bSair);
    }
    
    public void actionPerformed (ActionEvent evento)
    {
        if (evento.getSource() == bValidar)
        {
            professorUm.setNome(tfNome.getText());
            professorUm.setIdade(Integer.parseInt(tfIdade.getText()));
            
            JOptionPane.showMessageDialog(null, professorUm.exibirProfessor(), "Dados Professor", JOptionPane.INFORMATION_MESSAGE);
        }
        if (evento.getSource() == bSair)
        {
            System.out.println("Fim do aplicativo. Obrigado!");
            System.exit(0);
        }
    }
}
