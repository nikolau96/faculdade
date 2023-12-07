function leitura(numero1,numero2,numero3,resultado){
    var saida = document.getElementById(resultado.id);
    if(numero1>numero2){
        saida.innerHTML = "O número (" + numero1 + ") é maior";
    }
    else{
        saida.innerHTML = "O número (" + numero2 + ") é maior";
    }
    
    if(numero1>numero3){
        saida.innerHTML = "O número (" + numero1 + ") é maior";
    }
    else{
        saida.innerHTML = "O número (" + numero3 + ") é maior";
    }

    if(numero2>numero3){
        saida.innerHTML = "O número (" + numero2 + ") é maior";
    }
    else{
        saida.innerHTML = "O número (" + numero3 + ") é maior";
    }
}