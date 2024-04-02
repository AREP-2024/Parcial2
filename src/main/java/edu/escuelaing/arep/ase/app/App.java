package edu.escuelaing.arep.ase.app;
import static spark.Spark.*;
import edu.escuelaing.arep.ase.app.mathService.MathServicioFactorial;
import edu.escuelaing.arep.ase.app.mathService.MathServicioPrimo;

public class App 
{
    public static void main( String[] args )
    {
        MathServicioFactorial mathServicioFactorial = new MathServicioFactorial();

        MathServicioPrimo methServicioPrimo = new MathServicioPrimo();

        port(8080);
        staticFileLocation("/public");
        get("/factors",(req,res)->{
            String value = req.queryParams("value");
            return 
        });

        get("/primes",(req,res)->{
            String value = req.queryParams("value");
            return "{" +
            "\"operation\":" + "\"primes\"," +
            "\"input\":" + value + "," +
            "\"primes\":" + methServicioPrimo.secuencia(Integer.parseInt(value))  +
            "}";
        });
    }
}
