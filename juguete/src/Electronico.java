public class Electronico extends Juguete{
    private double recargoEnElPrecio;

    public Electronico(String nombre, int nJugadores, int edadMinima, int precioBase, double recargoEnElPrecio) throws EinvalidPropertyException {
        super(nombre, nJugadores, edadMinima, precioBase);
        this.recargoEnElPrecio = recargoEnElPrecio;
    }

    public Electronico(String nombre, int edadMinima, int precioBase, double recargoEnElPrecio) throws EinvalidPropertyException {
        super(nombre, edadMinima, precioBase);
        this.recargoEnElPrecio = recargoEnElPrecio;
    }
    public void imprimirElectronico(){
        System.out.println("Nombre: " +  getNombre());
        if ( getnJugadores() > 0 ) System.out.println("Apto para: " +  getnJugadores() + " jugadores");
        System.out.println("Edad mínima: " +  getEdadMinima());
        System.out.println("Precio: " +  getPrecioBase());
        System.out.println("Recargo: " +  getRecargoEnElPrecio());
        System.out.println("EL PRECIO CON EL RECARGO ES: " + getPrecio());
    }
    public double getPrecio(){
        return getPrecioBase() + getRecargoEnElPrecio();
    }
    public double getRecargoEnElPrecio() {
        return recargoEnElPrecio;
    }
}
