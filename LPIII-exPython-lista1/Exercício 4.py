# -*- coding: utf-8 -*-
"""
Created on Wed Dec 20 21:50:52 2023

@author: Nickolas
"""

nota1 = int(input('Digite a primeira nota: '))
nota2 = int(input('Digite a segunda nota: '))
media = (nota1+nota2)/2

if(media>=7):
    print('Aprovado')
elif(media==10):
    print('Aprovado com distinção')
else:
    print('Reprovado')
    