package atividade;

public class Principal {
  public static void main(String[] args) {
    Notificacao not = new Notificacao("Primeiro Exemplo");
    NotificaoSMS sms = new Notificacao("Segundo Exemplo");
    not.enviar();
    sms.enviar();

  }
}
