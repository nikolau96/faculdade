# -*- coding: utf-8 -*-
"""
Created on Sat Dec 23 08:44:53 2023

@author: Nickolas
"""
numero1 = int(input('Digite o primeiro número: '))
numero2 = int(input('Digite o segundo número: '))
numero3 = int(input('Digite o terceiro número: '))

if(numero1>numero2>numero3):
    print(numero3, numero2, numero1)
elif(numero1>numero3>numero2):
    print(numero2, numero3, numero1)
elif(numero3>numero1>numero2):
    print(numero2, numero1, numero3)
elif(numero3>numero2>numero1):
    print(numero1, numero2, numero3)
elif(numero2>numero3>numero1):
    print(numero1, numero3, numero2)
else:
    print(numero3, numero1, numero2)