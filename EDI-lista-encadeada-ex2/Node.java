public class Node{
    private int x;
    private Node prox;

    public Node(){
        x = 0;
        prox = null;
    }
    
    public Node(int x){
        this.x = x;
        prox = null;
    }

    public void setX(int x){
        this.x = x;
    }
    
    public void setProx(Node prox){
        this.prox = prox;
    }
    
    public int getX(){
        return x;
    }
    
    public Node getProx(){
        return prox;
    }
}
