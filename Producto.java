import java.time.LocalDate;

public abstract class Producto {
  protected String descripcion;
  protected LocalDate fechaCaducidad;
  protected int numLote;
  protected LocalDate fechaEnvasado;
  protected PaisOrigen paisOrigen;
  
  public Producto(String descripcion, LocalDate fechaCaducidad, int numLote, LocalDate fechaEnvasado,
      PaisOrigen paisOrigen) {
    this.descripcion = descripcion;
    this.fechaCaducidad = fechaCaducidad;
    this.numLote = numLote;
    this.fechaEnvasado = fechaEnvasado;
    this.paisOrigen = paisOrigen;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public LocalDate getFechaCaducidad() {
    return fechaCaducidad;
  }

  public void setFechaCaducidad(LocalDate fechaCaducidad) {
    this.fechaCaducidad = fechaCaducidad;
  }

  public int getNumLote() {
    return numLote;
  }

  public void setNumLote(int numLote) {
    this.numLote = numLote;
  }

  public LocalDate getFechaEnvasado() {
    return fechaEnvasado;
  }

  public void setFechaEnvasado(LocalDate fechaEnvasado) {
    this.fechaEnvasado = fechaEnvasado;
  }

  public PaisOrigen getPaisOrigen() {
    return paisOrigen;
  }

  public void setPaisOrigen(PaisOrigen paisOrigen) {
    this.paisOrigen = paisOrigen;
  }

  @Override
  public String toString() {
    return "Producto [descripcion=" + descripcion + ", fechaCaducidad=" + fechaCaducidad + ", fechaEnvasado="
        + fechaEnvasado + ", numLote=" + numLote + ", paisOrigen=" + paisOrigen + "]";
  }

  

  

  
}
