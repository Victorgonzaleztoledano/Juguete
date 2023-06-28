public class Juguete {
    private String nombre;
    private int nJugadores;
    private int edadMinima;
    private int precioBase;

    public Juguete(String nombre, int nJugadores, int edadMinima, int precioBase) throws EinvalidPropertyException {
        if ( nombre.equals(null) || nombre.trim().isEmpty() ) throw new EinvalidPropertyException("Indica un nombre correcto");
        else this.nombre = nombre;
        if ( nJugadores < 0 || nJugadores > 10 ) throw new EinvalidPropertyException("Indica una cantidad de 0 a 10 jugadores");
        else this.nJugadores = nJugadores;
        if ( edadMinima < 0) throw new EinvalidPropertyException("Indica una edad correcta");
        else this.edadMinima = edadMinima;
        if ( precioBase < 0) throw new EinvalidPropertyException("Indica un precio correcto");
        else this.precioBase = precioBase;
    }

    public Juguete(String nombre, int edadMinima, int precioBase) throws EinvalidPropertyException {
        if ( nombre.equals(null) || nombre.trim().isEmpty() ) throw new EinvalidPropertyException("Indica un nombre correcto");
        else this.nombre = nombre;
        if ( edadMinima < 0) throw new EinvalidPropertyException("Indica una edad correcta");
        else this.edadMinima = edadMinima;
        if ( precioBase < 0) throw new EinvalidPropertyException("Indica un precio correcto");
        else this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public int getnJugadores() {
        return nJugadores;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public int getPrecioBase() {
        return precioBase;
    }
}
