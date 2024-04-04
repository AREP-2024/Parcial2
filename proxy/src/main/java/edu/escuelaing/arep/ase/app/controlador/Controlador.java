package edu.escuelaing.arep.ase.app.controlador;

import static spark.Spark.port;
import static spark.Spark.get;

import edu.escuelaing.arep.ase.app.http.BalanceadorHttp;

public class Controlador {
    private BalanceadorHttp balanceadorHttp;

    public Controlador() {
        balanceadorHttp = new BalanceadorHttp();
    }

    public void init() {
        port(10000);
        get("*", (req,res)->{
            String queryString = req.queryString();
            String parametro = req.pathInfo();
            String fullPath = parametro + (queryString != null ? "?" + queryString : "");
            System.out.println("fullPath "+fullPath);
            return balanceadorHttp.invocar(fullPath);
        });

    }
    
}
