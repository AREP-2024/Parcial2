package edu.escuelaing.arep.ase.app;
import static spark.Spark.*;

import edu.escuelaing.arep.ase.app.roudrobin.RoundRobinFactorial;
import edu.escuelaing.arep.ase.app.roudrobin.RoundRobinPrimos;

public class App 
{
    public static void main( String[] args )
    {
        

        RoundRobinFactorial roundRobinF = new RoundRobinFactorial();
        RoundRobinPrimos roundRobinP = new RoundRobinPrimos();

        port(8080);
        staticFileLocation("/public");
        get("/factors",(req,res)->{
            String value = req.queryParams("value");
            return roundRobinF.invocar(value);
        });

        get("/primes",(req,res)->{
            String value = req.queryParams("value");
            return roundRobinP.invocar(value);
        });
    }
}
