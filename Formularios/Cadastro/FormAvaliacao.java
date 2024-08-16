package usarformcadastro;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.*;

public class FormAvaliacao extends JFrame 
{
    //Criando variável de campo de texto
    private JTextField textoFixo;
    //Criando variáveis do tipo botão, que terão ícones
    private JButton Bruim, Bneutro, Bsatisfeito; 
    //Criando rótulos
    protected Label lRuim, lBom, lExcelente;
    //Criando variáveis responsáveis pelas dimensões de quadro e rótulo
    protected Dimension dRotulo, dQuadro;

    public FormAvaliacao() 
    {
        setLayout(null);
        
        //Criando as dimensões do quadro e armazenando na variável 'dQuadro'
        Dimension dQuadro = new Dimension(335, 250);
        
        //Configurando elementos do quadro, como a localização na tela e tamanho
        setTitle("Avalie-nos!");
        setResizable(false); //Quadro não será "esticável"
        setSize(dQuadro);
        setLocation(100, 280);
        setLayout(null);
        
        //Criando as dimensões do rótulo e armazenando na variável 'dRotulo'
        Dimension dRotulo = new Dimension(60, 25);

        //Configurando campo de texto que será fixo (não será alterado)
        textoFixo = new JTextField("Como vem sendo a sua experiência?", 10);
        textoFixo.setEditable(false); //desabilita a edição
        textoFixo.setSize(220, 25);
        textoFixo.setLocation(40, 20);
        add(textoFixo);

        /* Adicionando os ícones ao projeto e identificando-os com seus 
        respectivos nomes */
        Icon ruim = new ImageIcon(getClass().getResource("ruim.png"));
        Icon neutro = new ImageIcon(getClass().getResource("neutro.png"));
        Icon satisfeito = new ImageIcon(getClass().getResource("satisfeito.png"));

        //Adicionando o ícone 'ruim.png' na variável Bruim
        Bruim = new JButton(ruim);
        Bruim.setBounds(30, 70, 70, 50); // Definindo posição e tamanho
        add(Bruim); //Adicionando botão ao formulário

        //Adicionando o ícone 'neutro.png' na variável Bneutro
        Bneutro = new JButton(neutro);
        Bneutro.setBounds(120, 70, 70, 50); 
        add(Bneutro);

        //Adicionando o ícone 'satisfeito.png' na variável Bsatisfeito
        Bsatisfeito = new JButton(satisfeito);
        Bsatisfeito.setBounds(210, 70, 70, 50);
        add(Bsatisfeito);

        //Criando manipulação de eventos de botão
        ButtonHandler handler = new ButtonHandler();
        Bruim.addActionListener(handler);
        Bneutro.addActionListener(handler);
        Bsatisfeito.addActionListener(handler);

        //Configurando rótulo que estará associado ao botão 'Bruim'
        lRuim = new Label("Ruim");
        lRuim.setSize(dRotulo);
        lRuim.setLocation(43, 120);
        //Configurando rótulo que estará associado ao botão 'bNeutro'
        lBom = new Label("Boa");
        lBom.setSize(dRotulo);
        lBom.setLocation(140, 120);
        //Configurando rótulo que estará associado ao botão 'bSatisfeito'
        lExcelente = new Label("Excelente");
        lExcelente.setSize(dRotulo);
        lExcelente.setLocation(220, 120);

        //Adicionando os rótulos ao formulário
        add(lRuim);
        add(lBom);
        add(lExcelente);
    }

    //Criando classe interna para manipulação de eventos de botão 
    private class ButtonHandler implements ActionListener 
    {
        public void actionPerformed(ActionEvent event) 
        {
            //Se os botões forem clicados essa mensagem é exibida
            JOptionPane.showMessageDialog(FormAvaliacao.this, String.format("Obrigado, bem-vindo à Funciona Shop!", event.getActionCommand()));
            //Após clicar 'OK' na caixa de diálogo todo o formulário encerra-se
            System.exit(0);
        }
    }
}
