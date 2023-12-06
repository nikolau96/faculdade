function processar(numero1,numero2,resultado){
    var saida = document.getElementById(resultado.id);
    if(numero1==numero2){
        alert("Erro: os números são iguais!")
    }
    else{
        saida.innerHTML = "É o maior!";
    }
}