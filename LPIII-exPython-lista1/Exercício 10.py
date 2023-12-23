# -*- coding: utf-8 -*-
"""
Created on Sat Dec 23 09:03:44 2023

@author: Nickolas
"""

matutino = 'M'
vespertino = 'V'
noturno = 'N'
usuario = input('Digite o seu turno: ')

if(usuario==matutino):
    print('Bom dia')
elif(usuario==vespertino):
    print('Boa tarde')
elif(usuario==noturno):
    print('Boa noite')
else:
    print('Turno inválido')