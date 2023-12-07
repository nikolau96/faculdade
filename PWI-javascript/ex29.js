function processar(inicio, fim, resultado) {
    var saida = document.getElementById(resultado.id);
    todos = "";
    pares = "";
    impares = "";
    for (i = inicio; i <= fim; i++){
        if (i % 2 == 0) {
            pares += i;
        }
        else{
            impares += i;
        }
        todos += i;
    }
    saida.innerHTML = todos + pares + impares;
}