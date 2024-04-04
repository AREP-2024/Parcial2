package edu.escuelaing.arep.ase.app.http;

public class BalanceadorHttp {
    private String instancia1 ;
    private String instancia2 ;
    private Integer puerto1;
    private Integer puerto2;

    private ClienteHttp clienteHttp;

    public BalanceadorHttp(){
        this.instancia1 = System.getenv("MATH_HOST_1");
        this.instancia2 = System.getenv("MATH_HOST_2");
        this.puerto1 = Integer.parseInt(System.getenv("MATH_PORT_1"));
        this.puerto2 = Integer.parseInt(System.getenv("MATH_PORT_2"));
        this.clienteHttp = new ClienteHttp();
    }

    public String invocar(String ruta){
        double random = Math.random();
        try{
            return random > 0.5? clienteHttp.invocar(instancia1,puerto1, ruta) : clienteHttp.invocar(instancia2,puerto2, ruta);

        }catch(Exception e){
            e.printStackTrace();
            return "Error de conexión";
        }
        



    }





    
}
