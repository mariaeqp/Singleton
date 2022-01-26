package mariaeqp_singleton;

public class testinzim_maroto {
    public static void main (String[]args){
        
        Single single = Single.getInstance();
        
        System.out.println(single);
        System.out.println(single.getInstance());
                
    }
}
