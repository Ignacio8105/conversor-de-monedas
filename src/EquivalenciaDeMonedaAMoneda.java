import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class EquivalenciaDeMonedaAMoneda {

    public Moneda ConversionMonedas(String monedaBase, String monedaDestino){
        String direccion = ("https://v6.exchangerate-api.com/v6/229e251a5d77c4225425c55e/pair/" + monedaBase + "/" + monedaDestino);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            return new Gson().fromJson(json, Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo hacer la conversion");
        }
    }
}
