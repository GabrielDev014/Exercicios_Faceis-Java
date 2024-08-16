package textfieldtest;

import javax.swing.JFrame;

public class TextFieldTest 
{
    public static void main(String[] args) 
    {
        TextFieldFrame textFieldFrame = new TextFieldFrame();
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldFrame.setSize(350,100); //configurar tamanho
        textFieldFrame.setVisible(true); // exibir frame 
        textFieldFrame.setLocation(200,300); //localização frame 
    } 
}
