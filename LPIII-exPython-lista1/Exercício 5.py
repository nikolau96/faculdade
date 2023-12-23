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
    
    