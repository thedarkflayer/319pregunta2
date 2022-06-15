# -*- coding: utf-8 -*-

def fibonacci_e(n):
    a=-1
    b=1
    c=0
    d=0

    for k in range(n):
            print(d)
            a=b
            b=c
            c=d
            d=temp(a, b, c)

temp = lambda a, b, c : a + b + c

numero = int(input("ingrese el numero de fibonaccis a imprimir : "))
print("los primeros "+str(numero) +" numeros fibonacci estructurado es: ")
fibonacci_e(numero)