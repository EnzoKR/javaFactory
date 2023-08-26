// Considere um sistema bancário que precisa enviar mensagens aos seus clientes. Por exemplo, após a realização de uma 
// compra com cartão de crédito, uma mensagem contendo informações sobre a compra pode ser enviada ao cliente.
// Se esse cliente for uma pessoa física, poderá optar pelo recebimento da mensagem através de email ou SMS. Por outro lado, 
// se for uma pessoa jurídica, poderá também receber a mensagem através de PUSH.

public class Main
{
    public static void main(String[] args) {
        
        Emissor emissor = new EmissorCreator().create(EmissorCreator.EMAIL);
        emissor.envia("nova compra de 800,00");
    }
}