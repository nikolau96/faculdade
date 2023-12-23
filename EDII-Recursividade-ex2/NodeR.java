public class NodeR{
    private int x;
    private NodeR prox;

    public NodeR(int valor){
        x = valor;
        prox = null;
    }
    
   public void add(int valor){
       if(prox!=null){
           prox.add(valor);
       }
       else{
           prox = new NodeR(valor);
       }
   }

    public int inverteOrdem(){
        if(prox!=null){   
            if(x != 0){ 
                return prox.inverteOrdem();
            }
            else{ 
                return x;
            }
        }
        if(x==0){
            return x;
        }
        return 0;
    }

}
