# -*- coding: utf-8 -*-
"""
Created on Wed Dec 20 22:21:01 2023

@author: Nickolas
"""

preco1 = int(input('Digite o preço do primeiro produto: '))
preco2 = int(input('Digite o preço do segundo produto: '))
preco3 = int(input('Digite o preço do terceiro produto: '))    
if(preco1<preco2):
    print('Compre o primeiro produto')
elif(preco1>preco2):
    print('Compre o segundo produto')
elif(preco1<preco3):
    print('Compre o primeiro produto')
elif(preco1>preco3):
    print('Compre o terceiro produto')
elif(preco2<preco3):
    print('Compre o segundo produto')
else:
    print('Compre o terceiro produto')