package usarformpedido;

//Importando bibliotecas 
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

//Implementando a função de "monitorar" os botões clicáveis
public class FormPedido extends Frame implements ActionListener
{
    /*Criando as variáveis responsáveis pelas dimensões dos elementos visíveis 
    do formulário*/
    protected Dimension dQuadro, dRotulo, dCaixaTexto, dBotao;
    //Criando variáveis para os botões clicáveis
    protected Button bAdicionar, bSair;
    //Criando variáveis para os campos de texto
    protected TextField tfCodigo, tfQuantidade;
    //Criando variáveis para os rótulos do formulário
    protected Label lCodigo, lQuantidade;
    
    /*Criando objeto (pedidoUm) da classe 'Pedido'. Ele conterá os atributos e 
    métodos da classe 'Pedido', como: quantidade, nome, categoria, código e valor,
    tudo nessa ordem*/
    Pedido pedidoUm = new Pedido (0, "Malbec", "Perfumaria", "", 189.90);
    
    public FormPedido()
    {
        //Definindo as dimensões do quadro, rótulo, caixa de texto e botão
        Dimension dQuadro = new Dimension (360, 210);
        Dimension dRotulo = new Dimension (120, 25);
        Dimension dCaixaTexto = new Dimension (171, 25);
        Dimension dBotao = new Dimension (130, 25);
        
        //Configurando elementos do quadro, como a localização na tela e tamanho
        setTitle("Realize seu Pedido");
        setResizable(false); //Quadro não será "esticável"
        setSize(dQuadro);
        setLocation(250, 280);
        setLayout(null);
        
        //Configurando o primeiro rótulo
        lCodigo = new Label("Código do produto");
        lCodigo.setSize(dRotulo);
        lCodigo.setLocation(25, 50);
        //Configurando a caixa de texto, que está atrelada ao rótulo 'lCodigo'
        tfCodigo = new TextField();
        tfCodigo.setSize (dCaixaTexto);
        tfCodigo.setLocation (150, 50);
        
        //Configurando o segundo rótulo
        lQuantidade = new Label ("Quantidade");
        lQuantidade.setSize(dRotulo);
        lQuantidade.setLocation(25, 90);
        //Configurando a caixa de texto, que está atrelada ao rótulo 'lQuantidade'
        tfQuantidade = new TextField();
        tfQuantidade.setSize(dCaixaTexto);
        tfQuantidade.setLocation(150, 90);
        
        //Configurando o botão de adicionar
        bAdicionar = new Button ("Adicione ao Pedido");
        bAdicionar.setSize(dBotao);
        bAdicionar.setLocation (50, 150);
        bAdicionar.addActionListener(this); //Monitorando ações no botão
        //Configurando o botão de sair
        bSair = new Button("Sair");
        bSair.setSize(dBotao);
        bSair.setLocation(190, 150);
        bSair.addActionListener(this);
        
        //Adicionando os elementos já configurados ao formulário
        add (lCodigo);
        add (lQuantidade);
        add (tfCodigo);
        add (tfQuantidade);
        add (bAdicionar);
        add (bSair);
    }
    
    public void actionPerformed (ActionEvent evento)
    {
        //Se o botão 'adicione ao pedido' for clicado, este bloco será executado
        if (evento.getSource() == bAdicionar)
        {
            //O objeto pedidoUm grava as informações inseridas no campo de Código
            pedidoUm.setCodigoProduto(tfCodigo.getText());
            //O objeto pedidoUm grava as informações do campo Quantidade
            pedidoUm.setQuantidade(Integer.parseInt(tfQuantidade.getText()));
            //Caixa de diálogo é exibida após inserção dos dados
            JOptionPane.showMessageDialog(null, pedidoUm.realizarPedido(), "Dados do Pedido", JOptionPane.INFORMATION_MESSAGE);
        }
        /*Se o botão sair for clicado, este bloco é executado, e o formulário
        é encerrado*/
        if (evento.getSource() == bSair)
        {
            System.out.println("Fim do aplicativo. Obrigado!");
            System.exit(0);
        }
    }
}
