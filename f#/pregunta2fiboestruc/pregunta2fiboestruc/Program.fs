// Más información acerca de F# en http://fsharp.net
// Vea el proyecto "Tutorial de F#" para obtener más ayuda.
open System

let temp = fun (a: int) (b: int) (c: int) -> a + b + c

let fiboestr (n:int) = 
    let mutable a=(-1)
    let mutable b=1
    let mutable c=0
    let mutable d=0
    for i in 1..(n-1) do
        a<-b
        b<-c
        c<-d
        d<-temp a b c
    d

let fibonacci_estr(n) =
    for i in 1.. n do
     printfn "%A" (fiboestr i)


[<EntryPoint>]
let main argv = 
    Console.WriteLine("ingrese el numero de fibonaccis a imprimir : ");
    let numero=int(Console.ReadLine());
    Console.WriteLine("los numeros fibonacci son ");
    fibonacci_estr (numero)

    let tecla = Console.ReadKey()
    0 // devolver un código de salida entero