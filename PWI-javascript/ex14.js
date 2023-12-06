function processar(numero,resultado){
    if(numero>0){
        document.getElementById(resultado.id).innerHTML = "O número (" + numero + ") é positivo";
    }
    else{
        document.getElementById(resultado.id).innerHTML = "O número (" + numero + ") é negativo";
    }
}