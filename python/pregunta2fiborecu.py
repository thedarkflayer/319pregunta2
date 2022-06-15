# -*- coding: utf-8 -*-
def fibonacci_rec(n):
    for i in range(n):
        print(fib_rec(i))

def fib_rec(n):
    if(n==0):
        return 0
    if(n==1):
        return 1
    if(n==2):
        return 1
    return temp(n)


temp = lambda n : fib_rec(n-1)+fib_rec(n-2)+fib_rec(n-3)

numero = int(input("ingrese el numero de fibonaccis a imprimir : "))
print("los primeros "+str(numero) +" numeros fibonacci recursivo es: ")
fibonacci_rec(numero)