function processar(numeros, resultado){
    var saida = document.getElementById(resultado.id);
    var numeros = [-1,0,2,8];
    for(numeros=0;numeros<4;numeros++){
        if(numeros>0){
            alert("O número é positivo");
        }
        else{
            if(numeros<0){
                alert("O número é negativo");
            }
            else{
                alert("O número é igual a zero");
            }
        }
        if(numeros%4){
            alert("O número é divísivel por 4");
        }
    }
}