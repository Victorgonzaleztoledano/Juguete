public class Educativo extends Juguete{
    private int edadMaxima;
    private double bonificacionAlPrecio;

    public Educativo(String nombre, int nJugadores, int edadMinima, int precioBase, int edadMaxima, double bonificacionAlPrecio) throws EinvalidPropertyException {
        super(nombre, nJugadores, edadMinima, precioBase);
        if (edadMaxima <= edadMinima) throw new EinvalidPropertyException("La edad máxima tiene que ser mayor a la mínima");
        else this.edadMaxima = edadMaxima;
        if ( bonificacionAlPrecio >= precioBase) throw new EinvalidPropertyException("La bonificación debe de ser menos al precio");
        else this.bonificacionAlPrecio = bonificacionAlPrecio;
    }

    public Educativo(String nombre, int edadMinima, int precioBase, int edadMaxima, double bonificacionAlPrecio) throws EinvalidPropertyException {
        super(nombre, edadMinima, precioBase);
        if (edadMaxima <= edadMinima) throw new EinvalidPropertyException("La edad máxima tiene que ser mayor a la mínima");
        else this.edadMaxima = edadMaxima;
        if ( bonificacionAlPrecio >= precioBase) throw new EinvalidPropertyException("La bonificación debe de ser menos al precio");
        else this.bonificacionAlPrecio = bonificacionAlPrecio;
    }
    public void imprimirEducativo(){
        System.out.println("Nombre: " +  getNombre());
        if ( getnJugadores() > 0 ) System.out.println("Apto para: " +  getnJugadores() + " jugadores");
        System.out.println("Edad mínima: " +  getEdadMinima());
        System.out.println("Edad máxima: " + getEdadMaxima());
        System.out.println("Precio: " +  getPrecioBase());
        System.out.println("Recargo: " +  getBonificacionAlPrecio());
        System.out.println("EL PRECIO CON LA BONIFICACIÓN ES: " + getPrecio());
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public double getBonificacionAlPrecio() {
        return bonificacionAlPrecio;
    }

    public double getPrecio(){
        return getPrecioBase() - bonificacionAlPrecio;
    }
}
