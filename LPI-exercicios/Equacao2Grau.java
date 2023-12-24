public class Equacao2Grau{
    private int a;
    private int b;
    private int c;

    public float calculaDelta(){
        float delta = (b^2) - (4*a*c);
        return delta;        
    }
    
    public String raizes(){
        if(calculaDelta()>0){
            return "A equação possui duas raízes";
        }
        else if(calculaDelta()==0){
            return "A equação possui uma raiz";
        }
        else{
            return "A equação não possui raiz";
        }
    }
}