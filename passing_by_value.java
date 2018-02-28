import java.util.*;
public class Call_by_val {
    
        int data=50;
        void change(Call_by_val x){
            x.data+=10;
        }
    
    public static void main (String args[]){
        Call_by_val wow = new Call_by_val();
        System.out.println("b ch :"+wow.data);
        wow.change(wow);                         // passing object // cal by val
        System.out.println("aft ch :"+wow.data);
    }
    
}
