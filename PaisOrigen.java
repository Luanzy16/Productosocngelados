
public class PaisOrigen {
  private String nombrePais;
  private int codigo;
  
  public PaisOrigen(String nombrePais, int codigo) {
    this.nombrePais = nombrePais;
    this.codigo = codigo;
  }

  public String getNombrePais() {
    return nombrePais;
  }

  public void setNombrePais(String nombrePais) {
    this.nombrePais = nombrePais;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  @Override
  public String toString() {
    return "PaisOrigen [codigo=" + codigo + ", nombrePais=" + nombrePais + "]";
  }

  
  
  
  
}
