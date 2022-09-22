import java.time.LocalDate;

public class Agua extends Congelados {
  private double salinidad;

  public Agua(String descripcion, LocalDate fechaCaducidad, int numLote, LocalDate fechaEnvasado, PaisOrigen paisOrigen,
      float temperatura, double salinidad) {
    super(descripcion, fechaCaducidad, numLote, fechaEnvasado, paisOrigen, temperatura);
    this.salinidad = salinidad;
  }

  public double getSalinidad() {
    return salinidad;
  }

  public void setSalinidad(double salinidad) {
    this.salinidad = salinidad;
  }

  @Override
  public String toString() {
    return super.toString()+"Agua [salinidad=" + salinidad + "]";
  }

  
  
}
