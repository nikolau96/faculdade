# -*- coding: utf-8 -*-
"""
Created on Sat Dec 23 14:06:56 2023

@author: Nickolas
"""

salarioAntigo = int(print('Informe o seu salario: '))
percentual1 = 0.2
percentual2 = 0.15
percentual3 = 0.1
percentual4 = 0.05

print('Salário antes do reajuste: ', salarioAntigo)

if(salarioAntigo<=280):
    print('Percentual de reajuste: ', percentual1)
elif(salarioAntigo>=281 and salarioAntigo<=700):
    print('Percentual de reajuste: ', percentual2)
elif(salarioAntigo>=701 and salarioAntigo<=1500):
    print('Percentual de reajuste: ', percentual3)
else:
    print('Percentual de reajuste: ', percentual4)

if(salarioAntigo<=280):
    salarioReajustado = salarioAntigo*percentual1
elif(salarioAntigo>=281 and salarioAntigo<=700):
    salarioReajustado = salarioAntigo*percentual2
elif(salarioAntigo>=701 and salarioAntigo<=1500):
    salarioReajustado = salarioAntigo*percentual3
else:
    salarioReajustado = salarioAntigo*percentual4
print('Salário após o reajuste: ', salarioReajustado)


