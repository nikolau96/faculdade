var indicador = [0,1,2,3];
var entrada = prompt("Digite o número da operação: ");
var numero1 = prompt("Digite o primeiro número: ");
var numero2 = prompt("Digite o segundo número: ");

for(indicador=0; indicador<4; indicador++){
    if(entrada==0){
        alert(numero1+numero2);
    }
    else{
        if(entrada==1){
            alert(numero1-numero2);
        }
        else{
            if(entrada==2){
                alert(numero1*numero2);
            }
            else{
                if(entrada==3 && numero2!=0){
                    alert(numero1/numero2);
                }
                else{
                    alert("Não é possível dividir por zero!");
                }
            }
        }
    }
    if(entrada!=indicador){
        alert("Operação Inválida")
    }
}