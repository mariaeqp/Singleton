package mariaeqp_singleton;

public class Single {
    
    private static Single instanciaunica;
   
    private Single(){  
    }
    
    public static synchronized Single getInstance(){
        if (instanciaunica == null){
            instanciaunica = new Single();
        }
        return instanciaunica;
    }
}
