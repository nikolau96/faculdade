# -*- coding: utf-8 -*-
"""
Created on Wed Dec 20 21:59:47 2023

@author: Nickolas
"""

numero1 = int(input('Digite o primeiro número: '))
numero2 = int(input('Digite o segundo número: '))
numero3 = int(input('Digite o terceiro número: '))

if(numero1>numero2):
    print(numero1)
elif(numero1<numero2):
    print(numero2)
elif(numero1>numero3):
    print(numero1)
elif(numero1<numero3):
    print(numero3)
elif(numero2>numero3):
    print(numero2)
else:
    print(numero3)

numero4 = int(input('Digite o primeiro número: '))
numero5 = int(input('Digite o segundo número: '))
numero6 = int(input('Digite o terceiro número: '))    
if(numero4<numero5):
    print(numero4)
elif(numero4>numero5):
    print(numero5)
elif(numero4<numero6):
    print(numero4)
elif(numero4>numero6):
    print(numero6)
elif(numero5<numero6):
    print(numero5)
else:
    print(numero6)
        