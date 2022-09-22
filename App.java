
import java.time.LocalDate;

public class App {
  public static void main(String[] args) {
    //Productos Frescos
    Frescos fresco1 = new Frescos("mantener frio",LocalDate.of(2022,9,10), 5, LocalDate.of(2022,8,1), new PaisOrigen("Colombia", 4563));
    Frescos fresco2 = new Frescos("mantener tibio", LocalDate.of(2023,8,2), 7, LocalDate.of(2022,2,9), new PaisOrigen("Peru", 7896));

    //Productos Refigerados
    Refigerados refigerado1 = new Refigerados("menos de 10", LocalDate.of(2022,9,10), 1, LocalDate.of(22,8,1), new PaisOrigen("Argentina", 1236), 7456, 10);
    Refigerados refigerado2 = new Refigerados("mas de 3", LocalDate.of(2023,8,2), 5, LocalDate.of(2022,2,9), new PaisOrigen("Brasil", 8523), 7456, 2);

    //productos Congelados
    Congelados congelado1 = new Agua("cuidado", LocalDate.of(2022,9,10), 6, LocalDate.of(2023,8,2), new PaisOrigen("Espña", 7412), 123, 47.123);
    Congelados congelado2 = new Aire("mantener frio", LocalDate.of(2021,12,31), 7, LocalDate.of(2022,9,10), new PaisOrigen("Ecuador", 1236), 78, 10, 1, 10, 2);
    Congelados congelado3 = new Nitrogeno("nada", LocalDate.of(2022,9,10), 5, LocalDate.of(2023,8,2), new PaisOrigen("China", 123), 4, "frio directo", 78);

    System.out.println("Mostrando productos frescos");
    System.out.println(fresco1);
    System.out.println(fresco2);
    System.out.println("Mostrando producots refigerados");
    System.out.println(refigerado1);
    System.out.println(refigerado2);
    System.out.println("mostrando Congelados");
    System.out.println(congelado1);
    System.out.println(congelado2);
    System.out.println(congelado3);
  }
}
