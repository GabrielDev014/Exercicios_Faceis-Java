package usarformulario;

import java.awt.*;

public class FormularioAluno extends Frame
{
    protected Dimension dQuadro, dRotulo, dCaixaTexto, dBotao;
    protected Button bValidar, bSair;
    protected TextField tfAluno;
    protected Label lAluno;
    
    public FormularioAluno()
    {
        Dimension dQuadro = new Dimension (290, 200);
        Dimension dRotulo = new Dimension (45, 25);
        Dimension dCaixaTexto = new Dimension (180, 25);
        Dimension dBotao = new Dimension (100, 25);
        
        setTitle("Validar Aluno");
        setResizable (false);
        setSize (dQuadro);
        setLocation (400, 200);
        setLayout (null);
        
        lAluno = new Label("Aluno");
        lAluno.setSize(dRotulo);
        lAluno.setLocation (25, 50);
        
        tfAluno = new TextField();
        tfAluno.setSize(dCaixaTexto);
        tfAluno.setLocation(80, 50);
        
        bValidar = new Button("Validar Aluno");
        bValidar.setSize(dBotao);
        bValidar.setLocation(25, 150);
        
        bSair = new Button("Sair");
        bSair.setSize(dBotao);
        bSair.setLocation(130, 150);
        
        add(lAluno);
        add(tfAluno);
        add(bValidar);
        add(bSair);
    }
}
