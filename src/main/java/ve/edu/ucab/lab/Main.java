package ve.edu.ucab.lab;

public class Main {
  protected Main() {
  }

  /**
   * Método principal de la aplicación que se ejecuta al iniciar el programa.
   * Es el punto de entrada de cualquier aplicación Java.
   *
   * @param args Argumentos de la línea de comandos pasados al programa.
   *             En este caso, no se utilizan.
   */
  public static void main(final String[] args) {
   Paquete paquete=new Paquete(5, "Danny", "Joselito", 100.0,9.0);
   Paquete paquete2=new Paquete(8, "Luis", "Valbuena", 7.5,9.8);
   PaqueteUrgente paqueteUrgente = new PaqueteUrgente(2,"Cristian","Valbuena",6.3, 9.6);
   Paquete paquete3 = new Paquete(20);
   paquete.imprimirInfoPaq();
   paquete2.imprimirInfoPaq();
   paqueteUrgente.imprimirInfoPaq();
   paquete3.imprimirInfoPaq();

  }
}
