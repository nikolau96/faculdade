function processar(numero1,numero2,numero3,resultado){
    var saida = document.getElementById(resultado.id);
    if(numero1>0){
        saida.innerHTML = numero1*2;
    }
    else{
        saida.innerHTML = numero1*3;
    }
    if(numero2>10 && numero2<100){
        alert("Intervalo permitido");
    }
    else{
        saida.innerHTML = "";
    }
    if(numero3<numero2){
        saida.innerHTML = numero3 - numero2;
    }
    else{
        saida.innerHTML = numero3 + 1;
    }
}