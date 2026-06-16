import java.util.*;
abstract class Compartment{
    public abstract String notice();
}
// FirstClass, Ladies, General, Luggage
class FirstClass extends Compartment{
    public String notice(){
        return "Notice : This is FirstClass compartment";
    }
}
class Ladies extends Compartment{
    public String notice(){
        return "Notice : This is Ladies compartment";
    }
}
class General extends Compartment{
    public String notice(){
        return "Notice : This is General compartment";
    }
}
class Luggage extends Compartment{
    public String notice(){
        return "Notice : This is Luggage compartment";
    }
}
public class TestCompartment {
   public static void main(String[] args){
      
    Compartment[] c = new Compartment[10];
    for(int i = 0; i < 10 ; i++){
         int n = (int)(Math.random() * 4) + 1;
         switch(n){
            case 1 : c[i] = new FirstClass();
            break;
            case 2 : c[i] = new Ladies();
            break;
            case 3 : c[i] = new General();
            break;
            case 4 : c[i] = new Luggage();
            break;
            default : System.out.println("Invalid");
         }
    }
     for(int i = 0 ; i < 10 ; i++){
        System.out.println(c[i].notice());
     }
   }
}  

