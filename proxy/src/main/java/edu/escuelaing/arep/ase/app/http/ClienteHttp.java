package edu.escuelaing.arep.ase.app.http;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.HttpUrl;
import java.io.IOException;

public class ClienteHttp {

    private OkHttpClient cliente;

    public ClienteHttp() {
        cliente = new OkHttpClient();
    }

    public String hacerLlamado(String url){
        HttpUrl  urlAux = HttpUrl.parse(url)
                            .newBuilder()
                            .build();
        Request request = new Request.Builder()
                                .url(urlAux)
                                .get()
                                .build();
        String dataInfo = "";
        try (Response response = cliente.newCall(request).execute()) {
            dataInfo = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataInfo;
        
    }

    public String invocar(String host, Integer puerto, String ruta){
        return hacerLlamado(host+":"+puerto+ruta);
    }

    
}
