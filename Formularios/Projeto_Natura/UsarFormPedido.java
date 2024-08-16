//Classe principal que inicia o programa
package usarformpedido;

public class UsarFormPedido 
{
    public static void main(String[] args) 
    {
        //Criando um objeto (formUm) que seguirá os padrões da classe FormPedido
        FormPedido formUm = new FormPedido();
        //Tornando o formulário visível ao usuário
        formUm.setVisible(true);
    }
}
