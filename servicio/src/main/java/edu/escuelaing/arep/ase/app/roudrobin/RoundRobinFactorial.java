package edu.escuelaing.arep.ase.app.roudrobin;

import java.util.ArrayList;
import java.util.List;

import edu.escuelaing.arep.ase.app.mathService.MathServicioFactorial;

public class RoundRobinFactorial {
    private List<MathServicioFactorial> mathServicioFactorial;
    private int index;

    public RoundRobinFactorial(int cantidadServicios, int puerto){
        index = 0;
        mathServicioFactorial = new ArrayList<>();

        for(int i = 0; i < cantidadServicios; i++){
            mathServicioFactorial.add(new MathServicioFactorial(i));

        }
    }

    public RoundRobinFactorial(){
        this(2,8080);
    }

    public String invocar(String numero){
        String secuencia = mathServicioFactorial.get(index).formatoRespuesta(numero);
        this.index = (this.index + 1) % mathServicioFactorial.size();
        return secuencia;

    }
    
}
