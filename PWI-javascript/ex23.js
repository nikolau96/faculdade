function calculaNumero(numero1,numero2,numero3,resultado,soma,media){
    var saida = document.getElementById(resultado.id);
    var soma = numero1+numero2+numero3;
    var media = (numero1+numero2+numero3)/2;
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
    prompt(soma);
    prompt(media);
}