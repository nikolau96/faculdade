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

    public int verificaNumero(){
        if(prox!=null){  
            return prox.verificaNumero();
        }
        return x;
    }

}
