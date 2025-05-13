import com.google.gson.Gson;
import com.sun.source.tree.TryTree;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConvertirMoneda {

    public double Conversion(double valor ,int cantidad){
        return valor * cantidad;
    }
}
