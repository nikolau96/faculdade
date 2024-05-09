public class ListaR{
    private NodeR inicio;
    
    public ListaR(){
       inicio = null; 
    }
    
    public void add(int valor){
        if(inicio!=null){
            inicio.add(valor);
        }
        else{
            inicio = new NodeR(valor);
        }
        
    }

    public int somaPar(){
        if(inicio!=null){  //verifica se o início é nulo
            return inicio.somaPar(); //True = inicia o nó
        }
        else{
            return 0; //False = não retorna nada
        }
    }
}
