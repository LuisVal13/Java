package ve.edu.ucab.lab;

public class PaqueteUrgente extends Paquete {
  private double tarifaExtra;

  public PaqueteUrgente(int id, String remitente, String destinatario, double peso, double costo) {
    super(id, remitente, destinatario, peso, costo);
    this.tarifaExtra = tarifaExtra;
  }

  @Override
  public double calcularCostoDeEnvio() {
    return super.calcularCostoDeEnvio() + tarifaExtra;

  }

  @Override
  public void imprimirInfoPaq() {
    System.out.println("Paquete urgente");
    System.out.println("Tarifa extra:" + tarifaExtra);
    super.imprimirInfoPaq();
  }
}

