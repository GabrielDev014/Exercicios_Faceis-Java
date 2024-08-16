package buttontest2;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
        
public class ButtonFrame2 extends JFrame
{
    private JButton simplesJButton; //botão com texto
    private JButton elaboradoJButton; //botão com ícone
    
    //construtor
    public ButtonFrame2()
    {
        super("Testando botões");
        setLayout(new FlowLayout()); //configurar o frame layout
        
        simplesJButton = new JButton("Botão simples"); //botão com texto
        add(simplesJButton); //adiciona no JFrame
        
        Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));
        Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));
        elaboradoJButton = new JButton ("Botão elaborado", bug1); //configura a imagem
        elaboradoJButton.setRolloverIcon(bug2); //passar o mouse sobre
        add(elaboradoJButton); //adiciona no Frame
        
        //manipulação de eventos de botão
        ButtonHandler handler = new ButtonHandler();
        elaboradoJButton.addActionListener(handler);
        simplesJButton.addActionListener(handler);
        //fim do construtor
    }
    //Classe interna para manipulação de eventos de botão 
    private class ButtonHandler implements ActionListener
    {
        //evento de botão
        public void actionPerformed(ActionEvent event)
        {
            JOptionPane.showMessageDialog(ButtonFrame2.this, String.format("Você pressionou: %s", event.getActionCommand()));
        }
    }
}
