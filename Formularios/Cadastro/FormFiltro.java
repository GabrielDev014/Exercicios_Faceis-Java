package usarformcadastro;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

//Implementando a função de 'monitorar' os botões clicáveis 
public class FormFiltro extends JFrame implements ActionListener 
{
    //Criando variáveis de botões do tipo CheckBox
    private JCheckBox nikeCB;
    private JCheckBox adidasCB;
    private JCheckBox pumaCB;
    private JCheckBox vansCB;
    //Criando botão comum
    private Button bProsseguir, bSair;
    //Criando variável responsável pela dimensão do meu quadro
    protected Dimension dQuadro;

    public FormFiltro() 
    {
        setLayout(null);
        
        //Criando as dimensões do quadro e armazenando na variável 'dQuadro'
        Dimension dQuadro = new Dimension(400, 300);
        
        //Configurando elementos do quadro, como a localização na tela e tamanho
        setTitle("O que você procura?");
        setResizable(false); //Quadro não será "esticável"
        setSize(dQuadro);
        setLocation(400, 280);
        setLayout(null);

        //Nomeando cada CheckBox (estes nomes serão exibidos ao usuário)
        nikeCB = new JCheckBox("Produtos Nike");
        adidasCB = new JCheckBox("Produtos Adidas");
        pumaCB = new JCheckBox("Produtos Puma");
        vansCB = new JCheckBox("Produtos Vans");

        //Definindo a posição e tamanho dos botões de CheckBox
        nikeCB.setBounds(50, 50, 150, 25);
        adidasCB.setBounds(200, 50, 200, 25);
        pumaCB.setBounds(50, 150, 150, 25);
        vansCB.setBounds(200, 150, 200, 25);

        //Configurando o botão de 'prosseguir'
        bProsseguir = new Button("Prosseguir");
        bProsseguir.setSize(130, 25);
        bProsseguir.setLocation(50, 200);
        bProsseguir.addActionListener(this);
        //Configurando o botão de sair
        bSair = new Button("Sair");
        bSair.setSize(130, 25);
        bSair.setLocation(200, 200);
        bSair.addActionListener(this);

        //Adicionando os elementos já configurados ao formulário
        add(nikeCB);
        add(adidasCB);
        add(pumaCB);
        add(vansCB);
        add(bProsseguir);
        add(bSair);
    }

    public void actionPerformed(ActionEvent evento) 
    {
        //Se o botão 'prosseguir' for clicado este bloco é executado
        if (evento.getSource() == bProsseguir) 
        {
            //Criando outro formulário
            FormAvaliacao formAvaliacao = new FormAvaliacao();
            /* Tornando esse novo formulário visível ao usuário após a seleção
            dos botões de CheckBox e o botão 'prosseguir' ser clicado */
            formAvaliacao.setVisible(true);
        }
        /* Se o botão 'sair' for clicado, este bloco é executado, e o formulário
        é encerrado */
        if (evento.getSource() == bSair) 
        {
            System.out.println("Fim do aplicativo. Obrigado!");
            System.exit(0);
        }
    }
}
