import java.time.LocalDate;

public class Congelados extends Producto{
  private float temperatura;

  public Congelados(String descripcion, LocalDate fechaCaducidad, int numLote, LocalDate fechaEnvasado,
      PaisOrigen paisOrigen, float temperatura) {
    super(descripcion, fechaCaducidad, numLote, fechaEnvasado, paisOrigen);
    this.temperatura = temperatura;
  }

  public float getTemperatura() {
    return temperatura;
  }

  public void setTemperatura(float temperatura) {
    this.temperatura = temperatura;
  }

  @Override
  public String toString() {
    return super.toString()+"Congelados [temperatura=" + temperatura + "]";
  }

  
  
}
