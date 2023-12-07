public class Principal{
    public static void main(String args[]){
        ListaR l = new ListaR();
        
        l.add(10);  
        l.add(20);
        l.add(30);
        l.add(10);  
        l.add(20);
        l.add(80);
        l.add(10);  
        l.add(20);
        l.add(30);
  
        System.out.println(l.somaPar());
    }
}
