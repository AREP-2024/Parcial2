
package edu.escuelaing.arep.ase.app.mathService;

import java.util.ArrayList;
import java.util.List;

public class MathServicioPrimo {


    public String secuencia(int numero){
        List<Integer> lista = new ArrayList<Integer>();

        for(int j = 2; j < numero; j++){
           if(primo(j)==false){
            lista.add(j);
           }

        }

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

    public boolean primo(int numero){
        boolean bandera = true;
        int contador = 0;
        for(int i=1; i<=numero;i++){
            if (numero%i==0) {
                    contador ++;
            }            
            
        }

        if (contador>2) {
            return bandera;
        }else{
            return bandera=false;
        }

    }
    

    
}