function processar(numero,resultado){
    if(numero<0){
        document.getElementById(resultado.id).innerHTML = "O número indicado (" + numero + ") é negativo";
    }
    else{
        document.getElementById(resultado.id).innerHTML = "";
    }
}