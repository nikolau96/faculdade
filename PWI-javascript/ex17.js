function processar(numero,resultado){
    var saida = document.getElementById(resultado.id);
    if(numero>0){
        saida.innerHTML = "O número (" + numero + ") é positivo";
    }
    else{
        saida.innerHTML = "O número (" + numero + ") é negativo";
    }
    if(numero%2){
        saida.innerHTML = "O número (" + numero + ") é par";
    }
    else{
        saida.innerHTML = "O número (" + numero + ") é ímpar";
    }
}