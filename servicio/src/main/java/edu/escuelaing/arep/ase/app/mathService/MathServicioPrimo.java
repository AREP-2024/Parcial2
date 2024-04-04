
package edu.escuelaing.arep.ase.app.mathService;

import java.util.ArrayList;
import java.util.List;

public class MathServicioPrimo {
    private int index=0;
    public MathServicioPrimo(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }


    public String secuencia(int numero){
        List<Integer> lista = new ArrayList<>();

        for(int j = 2; j <= numero; j++){
           if(primo(j)){
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

        for(int i=2; i<=numero/2;i++){
            if (numero%i==0) {
                return false;
            }             
        }
        return true;

    }

    public String formatoRespuesta(String numero){
        return"{" +
        "\"operation\":" + "\"primes\"," +
        "\"input\":" + numero + "," +
        "\"primes\":" + secuencia(Integer.parseInt(numero))  +
        "}";

    }
    

    
}