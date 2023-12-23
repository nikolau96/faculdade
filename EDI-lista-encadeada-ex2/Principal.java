public class Principal{
    public static void main(String args[]){
        Node p = new Node(10);
        
        System.out.println(p);
        
        //System.out.println(p.getX());
        //System.out.println(p.getProx());
        
        Node p1 = new Node(20);
        
        p.setProx(p1);
        
        //System.out.println(p.getX());
        //System.out.println(p.getProx());
        //System.out.println(p.getProx().getX());
        //System.out.println(p.getProx().getProx());
        
        p.getProx().setProx(new Node(30));
        
        //System.out.println(p.getProx().getProx().getX());
        //System.out.println(p.getProx().getProx().getProx());
        
        p.getProx().getProx().setProx(new Node(40));
        
        //System.out.println(p.getProx().getProx().getProx().getX());
        //System.out.println(p.getProx().getProx().getProx().getProx());
        
        
        Node f = p.getProx().getProx().getProx();
        
        for(int i=50; i<100; i=i+10){
            f.setProx(new Node(i));
            f = f.getProx();
        }
        
        p1 = p;
        
        while(p1 != null){
            System.out.println(p1.getX());
            p1 = p1.getProx();
        }
    }
    public void insertFirst(int valor){
            if (valor==0) {
                this.insertFirst(valor);
            }
        }
}
