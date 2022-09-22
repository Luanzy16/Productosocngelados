import java.time.LocalDate;

public class Refigerados extends Producto {
  private int codigoSupervision;
  private float temperatura;
 
  public Refigerados(String descripcion, LocalDate fechaCaducidad, int numLote, LocalDate fechaEnvasado,
      PaisOrigen paisOrigen, int codigoSupervision, float temperatura) {
    super(descripcion, fechaCaducidad, numLote, fechaEnvasado, paisOrigen);
    this.codigoSupervision = codigoSupervision;
    this.temperatura = temperatura;
  }

  public int getCodigoSupervision() {
    return codigoSupervision;
  }

  public void setCodigoSupervision(int codigoSupervision) {
    this.codigoSupervision = codigoSupervision;
  }

  public float getTemperatura() {
    return temperatura;
  }

  public void setTemperatura(float temperatura) {
    this.temperatura = temperatura;
  }

  @Override
  public String toString() {
    return super.toString()+"Refigerados [codigoSupervision=" + codigoSupervision + ", temperatura=" + temperatura + "]";
  }

  

  
}
