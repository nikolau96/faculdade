algoritmo "ultimo"
//usar alguma estrutura de repeti��o
//calculadora
var
 op: Literal
 mult,numero: Real
inicio
 mult <- 8
 repita
  escreva("Informe um n�mero para c�lculo: ")
  leia(numero)
  mult <- numero*mult
  escreval("Resultado: ",mult)
  escreva("Deseja continuar? ")
  leia(op)
 ate(op="N")
fimalgoritmo
