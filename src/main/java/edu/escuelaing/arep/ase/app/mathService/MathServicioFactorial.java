package edu.escuelaing.arep.ase.app.mathService;

import java.util.ArrayList;
import java.util.List;

public class MathServicioFactorial {

    public String secuenciaFactorial(int numero){

        List<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        for(int i= 2; i<numero; i++){
            if (numero%i==0) {
                lista.add(i);
            }
        }
        lista.add(numero);

        StringBuilder resultado = new StringBuilder();
        for(int n=0; n<lista.size(); n++){
            if (n!=lista.size()-1) {
                resultado.append(lista.get(n)).append(",");
            }else{
                resultado.append(lista.get(n));
            }
        }

        return resultado.toString();
    }

    public String formatoRespuesta(String numero){
        return"{" +
        "\"operation\":" + "\"factors\"," +
        "\"input\":" + numero + "," +
        "\"factors\":" + secuenciaFactorial(Integer.parseInt(numero)) +
        "}"; 

    }
    
}
