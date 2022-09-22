import java.time.LocalDate;

public class Frescos extends Producto{

  public Frescos(String descripcion, LocalDate fechaCaducidad, int numLote, LocalDate fechaEnvasado,
      PaisOrigen paisOrigen) {
    super(descripcion, fechaCaducidad, numLote, fechaEnvasado, paisOrigen);
  }

  @Override
  public String toString() {
    return super.toString();
  }
  
  
}
