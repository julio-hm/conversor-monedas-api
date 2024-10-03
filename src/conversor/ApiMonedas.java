package conversor;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiMonedas {
    private static final String API_KEY = "a32122ecc1d21ebaee1b70cc";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/USD";

    // Método para obtener la tasa de cambio
    public static double obtenerTasaCambio(String monedaDestino) {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Analizar la respuesta JSON
                JsonObject jsonResponse = JsonParser.parseString(response.toString()).getAsJsonObject();
                JsonObject conversionRates = jsonResponse.getAsJsonObject("conversion_rates");
                return conversionRates.get(monedaDestino).getAsDouble();
            } else {
                System.out.println("Error en la conexión: " + responseCode + " - " + connection.getResponseMessage());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0.0;
    }
}
