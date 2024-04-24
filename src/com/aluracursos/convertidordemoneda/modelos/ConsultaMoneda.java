package com.aluracursos.convertidordemoneda.modelos;

import com.google.gson.Gson;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonObject;
//import com.google.gson.reflect.TypeToken;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
//import java.util.List;

public class ConsultaMoneda {
    public Moneda moneda(String divisaEmisor, String divisaReceptor, double cantidadDinero) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/4f2702eb49c8f068cf04ec9e/pair/" + divisaEmisor + "/" + divisaReceptor + "/" + cantidadDinero);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("Valor no valido");
        }

    }
}

