package usarformcadastro;

//Importando bibliotecas
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;

//Implementando a função de "monitorar" os botões clicáveis
public class FormCadastro extends Frame implements ActionListener
{
    /*Criando as variáveis responsáveis pelas dimensões dos elementos visíveis 
    do formulário*/
    protected Dimension dQuadro, dRotulo, dCaixaTexto, dBotao;
    //Criando variáveis para os botões clicáveis
    protected Button bCadastrar, bSair;
    //Criando variáveis para os campos de texto
    protected TextField tfNome, tfIdade, tfEmail;
    //Criando variáveis para os rótulos do formulário
    protected Label lNome, lIdade, lEmail, lSenha, lSexo;
    //Criando variável com campo de texto do tipo "senha"
    protected JPasswordField campoSenha;
    //Criando variáveis do tipo "Radio Button" 
    protected JRadioButton masculinoRB;
    protected JRadioButton femininoRB;
    //Criando variável para agrupar os Radio Buttons
    protected ButtonGroup radioGroup;
    
    /*Criando objeto (cadastroUm) da classe 'Cadastro'. Ele terá os atributos e
    métodos da classe 'Cadastro', como: nome, idade e e-mail */
    Cadastro cadastroUm = new Cadastro("", 0, "");
    
    public FormCadastro()
    {
        //Definindo as dimensões do quadro, rótulo, caixa de texto e botão
        Dimension dQuadro = new Dimension (360, 320);
        Dimension dRotulo = new Dimension (120, 25);
        Dimension dCaixaTexto = new Dimension (171, 25);
        Dimension dBotao = new Dimension (130, 25);
                
        //Configurando elementos do quadro, como a localização na tela e tamanho
        setTitle("Realize seu Cadastro");
        setResizable(false); //Quadro não será "esticável"
        setSize(dQuadro); //Quadro terá a dimensão da variável 'dQuadro'
        setLocation(250, 280); //Localização do quadro na tela
        setLayout(null);
        
        //Configurando o primeiro rótulo
        lNome = new Label ("Nome");
        lNome.setSize(dRotulo);
        lNome.setLocation(25,50);
        //Configurando a caixa de texto, que está atrelada ao rótulo 'lNome'
        tfNome = new TextField();
        tfNome.setSize(dCaixaTexto);
        tfNome.setLocation(150, 50);
        //Configurando o segundo rótulo
        lIdade = new Label("Idade");
        lIdade.setSize(dRotulo);
        lIdade.setLocation(25, 90);
        //Configurando caixa de texto
        tfIdade = new TextField();
        tfIdade.setSize(dCaixaTexto);
        tfIdade.setLocation(150, 90);
        //Configurando o terceiro rótulo
        lEmail = new Label ("E-mail");
        lEmail.setSize(dRotulo);
        lEmail.setLocation(25, 130);
        //Configurando caixa de texto
        tfEmail = new TextField();
        tfEmail.setSize(dCaixaTexto);
        tfEmail.setLocation(150, 130);
        //Configurando o quarto rótulo 
        lSenha = new Label ("Criar Senha");
        lSenha.setSize(dRotulo);
        lSenha.setLocation(25, 170);
        //Configurando caixa de texto do tipo senha
        campoSenha = new JPasswordField();
        campoSenha.setSize(dCaixaTexto);
        campoSenha.setLocation(150, 170);
        
        //Configurando o botão de Cadastro 
        bCadastrar = new Button("Finalizar Cadastro");
        bCadastrar.setSize(dBotao);
        bCadastrar.setLocation(50, 260);
        bCadastrar.addActionListener(this);
        //Configurando o botão de sair
        bSair = new Button ("Sair");
        bSair.setSize(dBotao);
        bSair.setLocation(190, 260);
        bSair.addActionListener(this);
        
        /* Criando Radio Buttons e nomeando-os, bem como iniciando-os como não
        selecionados */
        masculinoRB = new JRadioButton("Masculino", false);
        femininoRB = new JRadioButton("Feminino", false);
        
        //Adicionando os botões de radio ao grupo de botões
        radioGroup = new ButtonGroup();
        radioGroup.add(masculinoRB);
        radioGroup.add(femininoRB);
        
        // Definindo a posição e tamanho dos botões de rádio
        masculinoRB.setBounds(150, 220, 90, 25);
        femininoRB.setBounds(250, 220, 80, 25);
        
        //Criando rótulo que está atrelado aos Radio Buttons
        lSexo = new Label("Seu sexo:");
        lSexo.setSize(dRotulo);
        lSexo.setLocation(25, 220);
        
        //Adicionando os elementos já configurados ao formulário
        add(lNome);
        add(tfNome);
        add(lIdade);
        add(tfIdade);
        add(lEmail);
        add(tfEmail);
        add(lSenha);
        add(campoSenha);
        add(lSexo);
        add(femininoRB);
        add(masculinoRB);
        add(bCadastrar);
        add(bSair);
    }
    
    public void actionPerformed(ActionEvent evento) 
    {
        //Se o botão 'cadastrar' for clicado, este bloco é executado
        if (evento.getSource() == bCadastrar) 
        {
            /* Objetos gravam as informações inseridas em cada um dos campos de 
            texto (o campo de senha não é gravado, nem de sexo) */
            cadastroUm.setNome(tfNome.getText());
            int idade = Integer.parseInt(tfIdade.getText());
            cadastroUm.setIdade(idade);
            cadastroUm.setEmail(tfEmail.getText());

            // Verificação da idade
            if (idade > 10 && idade < 131) 
            {
                //Caixa de diálogo é exibida após a inserção dos dados 
                JOptionPane.showMessageDialog(null, cadastroUm.realizarCadastro(), "Dados do cadastro", JOptionPane.INFORMATION_MESSAGE);

                //Criando outro formulário.
                FormFiltro formFiltro = new FormFiltro();
                /* Formulário será exibido após a exibição da caixa de diálogo 
                deste bloco */
                formFiltro.setVisible(true);
            } 
            /* Se a idade for inválida este bloco é executado e o programa é 
            encerrado */
            else 
            {
                JOptionPane.showMessageDialog(null, "Idade inválida! Deve estar entre 11 e 130 anos.", "Erro", JOptionPane.ERROR_MESSAGE);
                // Encerra o programa
                System.exit(0);
            }
        }

        //Se o 'botão' sair for clicado o programa encerra-se
        if (evento.getSource() == bSair) 
        {
            System.out.println("Fim do aplicativo. Obrigado!");
            System.exit(0);
        }
    }
}
