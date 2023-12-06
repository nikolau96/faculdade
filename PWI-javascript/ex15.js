function processar(numero,resultado){
    var saida = document.getElementById(resultado.id);
    if(numero>0){
        saida.innerHTML = "O número (" + numero + ") é positivo";
    }
    else{
        if(numero<0){
            saida.innerHTML = "O número (" + numero + ") é negativo";
        }
        else{
           saida.innerHTML = "O número (" + numero + ") é igual a zero"; 
        }
    }
}