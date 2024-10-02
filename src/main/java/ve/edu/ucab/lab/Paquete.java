package ve.edu.ucab.lab;



public class Paquete {
  public int id;
  public String remitente;
  public String destinatario;
  public double peso;
  public static double COSTO = 10;

  public Paquete(int id, String remitente, String destinatario, double peso, double costo) {
    this.id = id;
    this.remitente = remitente;
    this.destinatario = destinatario;
    this.peso = peso;
    this.COSTO = COSTO;
  }

  public Paquete(int id) {
    this.id = id;
    this.remitente ="Por definir";
    this.destinatario ="Por definir";
    this.peso = 1;

  }

  public double calcularCostoDeEnvio (){

    return COSTO * peso;
  }
  public void imprimirInfoPaq(){
    System.out.println("Id:" +id);
    System.out.println(" El remitente es:" +remitente);
    System.out.println(" Id:" +id);
    System.out.println(" El Peso es:" +peso+"Kg");
    System.out.println(" El Costo es:$" +COSTO);
    System.out.println("El costo de envio es:" +calcularCostoDeEnvio());
    System.out.println(" **************************************************");
  }
}
