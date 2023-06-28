public class Main {
    public static void main(String[] args) {
        try {
            Electronico juguete1 = new Electronico("Operación",6, 4, 20, 5);
            juguete1.imprimirElectronico();
            System.out.println("--------");
            Educativo juguete2 = new Educativo("Brain training", 6, 40, 12, 20);
            juguete2.imprimirEducativo();
        }
        catch (EinvalidPropertyException e){
            System.out.println(e.getMessage());
        }
    }
}