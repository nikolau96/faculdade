# -*- coding: utf-8 -*-
"""
Created on Wed Dec 20 22:09:40 2023

@author: Nickolas
"""

letraMulher = 'F'
letraHomem = 'M'
letraDigitada = input('Digite uma letra: ')

if(letraDigitada==letraMulher):
    print('Sexo Feminino')
elif(letraDigitada==letraHomem):
    print('Sexo Masculino')
else:
    print('Sexo Inválido')