algoritmo "ultimo"
//usar alguma estrutura de repetição
//calculadora
var
 op: Literal
 mult,numero: Real
inicio
 mult <- 8
 repita
  escreva("Informe um número para cálculo: ")
  leia(numero)
  mult <- numero*mult
  escreval("Resultado: ",mult)
  escreva("Deseja continuar? ")
  leia(op)
 ate(op="N")
fimalgoritmo
