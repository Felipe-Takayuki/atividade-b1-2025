package atividade;

public class NotificaoSMS extends Notificacao {
  public NotificacaoSMS(String mensagem) {
    super(mensagem); //super é usada para classes filhas
  }

  @Override
  public void enviar() {
    System.out.println("Enviando SMS: " + this.getMensagem());

  }
}
