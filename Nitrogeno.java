import java.time.LocalDate;

public class Nitrogeno extends Congelados {
  private String metodo;
  private int tiempoSegundos;
  
  public Nitrogeno(String descripcion, LocalDate fechaCaducidad, int numLote, LocalDate fechaEnvasado,
      PaisOrigen paisOrigen, float temperatura, String metodo, int tiempoSegundos) {
    super(descripcion, fechaCaducidad, numLote, fechaEnvasado, paisOrigen, temperatura);
    this.metodo = metodo;
    this.tiempoSegundos = tiempoSegundos;
  }

  public String getMetodo() {
    return metodo;
  }

  public void setMetodo(String metodo) {
    this.metodo = metodo;
  }

  public int getTiempoSegundos() {
    return tiempoSegundos;
  }

  public void setTiempoSegundos(int tiempoSegundos) {
    this.tiempoSegundos = tiempoSegundos;
  }

  @Override
  public String toString() {
    return super.toString()+"Nitrogeno [metodo=" + metodo + ", tiempoSegundos=" + tiempoSegundos + "]";
  }

  
  
}
