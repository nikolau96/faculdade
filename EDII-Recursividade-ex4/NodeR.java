
public class NodeR {
    private int x;
    private NodeR prox;

    public NodeR(int valor) {
        x = valor;
        prox = null;
    }

    public void add(int valor) {
        if (prox != null) {
            prox.add(valor);
        } else {
            prox = new NodeR(valor);
        }
    }

    public int maior() {
        if (prox != null) {
            int m = prox.maior();
            if (x > m) {
                return x;
            } else {
                return m;
            }
        }
        return x;
    }

    public int menorMaior(int y) {
        int n = maior();
        if (prox != null) {
            if (x > y && x < n) {
                return x;
            } else {
                return prox.menorMaior(y);
            }
        }
        return 0;
    }
}
