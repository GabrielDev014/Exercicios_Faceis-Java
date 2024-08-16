package buttontest2;

import javax.swing.JFrame;

public class ButtonTest2 
{
    public static void main(String[] args) 
    {
        ButtonFrame2 buttonFrame = new ButtonFrame2(); //criando um button frame
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(320, 120); //Configura o tamanho do frame
        buttonFrame.setVisible(true); //Exibe o frame
    }
}
