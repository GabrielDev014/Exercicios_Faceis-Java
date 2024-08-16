package iniciarformulario;

import java.awt.*;

public class FormularioLivro extends Frame
{
    protected Dimension dQuadro, dRotulo, dCaixaTexto, dBotao;
    protected Button bCadastrar, bSair;
    protected TextField tfTitulo, tfAutor;
    protected Label lTitulo, lAutor;
    
    public FormularioLivro()
    {
        Dimension dQuadro = new Dimension (290, 200);
        Dimension dRotulo = new Dimension (45, 25);
        Dimension dCaixaTexto = new Dimension (180, 25);
        Dimension dBotao = new Dimension (100, 25);
        
        setTitle("Cadastrar Livro");
        setResizable(false);
        setSize(dQuadro);
        setLocation(400, 200);
        setLayout(null);
        
        lTitulo = new Label ("Título");
        lTitulo.setSize(dRotulo);
        lTitulo.setLocation(25, 50);
        
        lAutor = new Label ("Autor");
        lAutor.setSize(dRotulo);
        lAutor.setLocation(25, 100);
        
        tfTitulo = new TextField();
        tfTitulo.setSize(dCaixaTexto);
        tfTitulo.setLocation(80, 50);
        
        tfAutor = new TextField();
        tfAutor.setSize(dCaixaTexto);
        tfAutor.setLocation(80, 100);
        
        bCadastrar = new Button ("Cadastrar");
        bCadastrar.setSize(dBotao);
        bCadastrar.setLocation(40, 150);
        
        bSair = new Button ("Sair");
        bSair.setSize(dBotao);
        bSair.setLocation(150, 150);
        
        add(lTitulo);
        add(lAutor);
        add(tfTitulo);
        add(tfAutor);
        add(bCadastrar);
        add(bSair);
    }
}
