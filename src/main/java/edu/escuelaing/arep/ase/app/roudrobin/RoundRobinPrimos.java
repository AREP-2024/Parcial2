package edu.escuelaing.arep.ase.app.roudrobin;

import java.util.ArrayList;
import java.util.List;


import edu.escuelaing.arep.ase.app.mathService.MathServicioPrimo;

public class RoundRobinPrimos {
        private List<MathServicioPrimo> mathServicioPrimo;
    private int index;

    public RoundRobinPrimos(int cantidadServicios, int puerto){
        index = 0;
        mathServicioPrimo = new ArrayList<>();

        for(int i = 0; i < cantidadServicios; i++){
            mathServicioPrimo.add(new MathServicioPrimo(i));

        }
    }

    public RoundRobinPrimos(){
        this(2,8080);
    }

    public String invocar(String numero){
        String secuencia = mathServicioPrimo.get(index).formatoRespuesta(numero);
        this.index = (this.index + 1) % mathServicioPrimo.size();
        return secuencia;

    }
    
}
