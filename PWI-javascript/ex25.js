var entrada = prompt("Digite a letra da operação: ");
var numero1 = prompt("Digite o primeiro número: ");
var numero2 = prompt("Digite o segundo número: ");

if(entrada=="a"){
    alert(numero1+numero2);
}
if(entrada=="s"){
    alert(numero1-numero2);
}
if(entrada=="m"){
    alert(numero1*numero2);
}
if(entrada=="d" && numero2!=0){
    alert(numero1/numero2);
}
else{
    alert("Operação inválida");
}
