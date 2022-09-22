import java.time.LocalDate;

public class Aire extends Congelados {
  private float nitrogeno;
  private float oxigeno;
  private float dioxidoCarbono;
  private float vaporAgua;
  
  public Aire(String descripcion, LocalDate fechaCaducidad, int numLote, LocalDate fechaEnvasado, PaisOrigen paisOrigen,
      float temperatura, float nitrogeno, float oxigeno, float dioxidoCarbono, float vaporAgua) {
    super(descripcion, fechaCaducidad, numLote, fechaEnvasado, paisOrigen, temperatura);
    this.nitrogeno = nitrogeno;
    this.oxigeno = oxigeno;
    this.dioxidoCarbono = dioxidoCarbono;
    this.vaporAgua = vaporAgua;
  }

  public float getNitrogeno() {
    return nitrogeno;
  }

  public void setNitrogeno(float nitrogeno) {
    this.nitrogeno = nitrogeno;
  }

  public float getOxigeno() {
    return oxigeno;
  }

  public void setOxigeno(float oxigeno) {
    this.oxigeno = oxigeno;
  }

  public float getDioxidoCarbono() {
    return dioxidoCarbono;
  }

  public void setDioxidoCarbono(float dioxidoCarbono) {
    this.dioxidoCarbono = dioxidoCarbono;
  }

  public float getVaporAgua() {
    return vaporAgua;
  }

  public void setVaporAgua(float vaporAgua) {
    this.vaporAgua = vaporAgua;
  }

  @Override
  public String toString() {
    return super.toString()+"Aire [dioxidoCarbono=" + dioxidoCarbono + ", nitrogeno=" + nitrogeno + ", oxigeno=" + oxigeno
        + ", vaporAgua=" + vaporAgua + "]";
  }

  
  
}
