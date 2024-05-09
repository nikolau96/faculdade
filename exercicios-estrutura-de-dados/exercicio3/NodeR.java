public class NodeR
{
    private int x;
    private NodeR prox;

    public NodeR(int valor)
    {
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

    public int somaPar(){
        if(prox!=null){   //verifica se o próximo é nulo
            if(x % 2 ==0){  //verifica se o próximo é par
                return prox.somaPar() + x; //retorna a soma
            }
            else{ 
                return x; //caso o if seja falso, retorna o próprio número
            }
        }
        if(x%2==0){   //verifica se o último elemento do nó é par
            return x; // True = vai retornar a soma dos números
        }
        return 0; //False = não vai retornar nada
    }

}
