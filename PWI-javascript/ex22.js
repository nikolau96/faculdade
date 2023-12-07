function leitura(numero1,numero2,numero3,resultado){
    var saida = document.getElementById(resultado.id);
    if(numero1<numero2){
        saida.innerHTML = "O número (" + numero1 + ") é menor";
    }
    else{
        saida.innerHTML = "O número (" + numero2 + ") é menor";
    }
    
    if(numero1<numero3){
        saida.innerHTML = "O número (" + numero1 + ") é menor";
    }
    else{
        saida.innerHTML = "O número (" + numero3 + ") é menor";
    }

    if(numero2<numero3){
        saida.innerHTML = "O número (" + numero2 + ") é menor";
    }
    else{
        saida.innerHTML = "O número (" + numero3 + ") é menor";
    }
}