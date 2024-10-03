package conversor;

public class ConversorMonedas {

    public static double convertir(String monedaOrigen, String monedaDestino, double cantidad) {
        double tasa = ApiMonedas.obtenerTasaCambio(monedaDestino);
        return cantidad * tasa;
    }

    public static void main(String[] args) {
        MenuConversor menu = new MenuConversor();
        menu.mostrarMenu();
    }
}
