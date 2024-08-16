package textfieldtest;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame
{
    private JTextField textField1; //caixa de texto
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField; //caixa de texto de senha
    
    public TextFieldFrame()
    {
        super("Testando JTextField e o JPasswordField");
        setLayout(new FlowLayout()); //configurar o frame layout
        
        // caixa de texto com 15 colunas
        textField1 = new JTextField(15);
        add(textField1);
        
        // caixa de texto com texto padrão
        textField2 = new JTextField("Digite aqui");
        add(textField2);
        
        // caixa de texto com texto padrão e 10 colunas 
        textField3 = new JTextField("texto fixo", 10);
        textField3.setEditable(false); //desabilita a edição
        add(textField3);
        
        // construtor caixa de texto senha com texto padrão
        passwordField = new JPasswordField("texto senha oculto");
        add(passwordField);
        
        // registrar eventos
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }
    // classe interna privada com tratador de eventos
    private class TextFieldHandler implements ActionListener
    {
        // processa os eventos
        public void actionPerformed(ActionEvent event)
        {
            String conteudoTexto = ""; //declara String para o display
            
            // usuário pressionou a tecla enter no JTextField textField1
            if(event.getSource() == textField1)
                conteudoTexto = String.format("caixa de texto 1: %s", event.getActionCommand());
            
            else if (event.getSource() == textField2)
                conteudoTexto = String.format("caixa de texto 2: %s", event.getActionCommand());
            
            else if (event.getSource() == textField3)
                conteudoTexto = String.format("caixa de texto 3: %s", event.getActionCommand());
            
            else if (event.getSource() == passwordField)
                conteudoTexto = String.format("caixa de senha: %s", event.getActionCommand());
            
            // exibe conteúdo do JTextField
            JOptionPane.showMessageDialog(null, conteudoTexto);
        }
    } // fim da classe interna
}
