public class SmartTv {

  String marca = "LG";
  boolean ligada = false;
  int canal = 1;
  int volume = 25;
  String programacao = "Xuxa";

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

  public void aumentarVolume() {
    volume++;
    System.out.println("Aumentando volume: " + volume);
  }

  public void diminuirVolume() {
    volume--;
    System.out.println("Diminuindo volume: " + volume);
  }

  public void aumentarCanal() {
    canal++;
  }

  public void diminuirCanal() {
    canal--;
  }

  public void mudarCanal(int novoCanal) {
    canal = novoCanal;
    System.out.println("Canal atual: " + canal);
  }
}
