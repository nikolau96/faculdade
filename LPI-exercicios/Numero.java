public class Numero {
    int numero1;
    int numero2;
    int numero3;

    public int maiorNumero(){
        if(numero1>numero2){
            return numero1;
        }
        else if(numero2>numero1){
            return numero2;
        }
        else if(numero1>numero3){
            return numero1;
        }
        else if (numero3>numero1) {
            return numero3;
        }
        else if(numero2>numero3){
            return numero2;
        }
        else{
            return numero3;
        }
    }
}
