# programacion3
Ejercicio entregable - TP 1

Utilizando su propia implementación de Lista desarrollada en este práctico, resuelva el siguiente problema: Dada una lista de entrada que contiene números de manera desordenada, se desea detectar todas las sub-secuencias (secuencias contiguas de numeros) que cumplan con las siguientes restricciones:

    La suma de los elementos de la sub-secuencia debe ser menor o igual a un valor umbral dado por parámetro. 
    Los elementos de la lista solo pueden aparecer en una única sub-secuencia.
    Las sub-secuencias encontradas deben ser de la mayor longitud posible, pero pueden estar compuestas de un único elemento.

El problema deberá retornar solo una lista con la suma de los elementos de cada una de las sub-secuencias que cumplan con las restricciones, respetando el orden en el cual fueron encontradas.

Por ejemplo:

Lista de entrada = [] Valor umbral: 10

Lista de salida = [] // No devuelve nada (una lista vacía)

Lista de entrada = [1, 2, 3] Valor umbral: 10

Lista de salida = [6] // Todos los valores de la lista

Lista de entrada = [1, 2, 3] Valor umbral: 2

Lista de salida = [1, 2] // Dos elementos, el 3 como sub-secuencia supera el valor umbral.

Lista de entrada = [3, 5, 2, 7, 19, 14, 28] Valor umbral: 10

Lista de salida = [10, 7] // Los valores surgen de las sub-secuencias [3,5,2]; [7]; 

Lista de entrada = [3, 5, 4, 2, 7, 15, 14, 28] Valor umbral: 15
Lista de salida = [14,7,15,14] // Los valores surgen de las sub-secuencias [3,5,4,2]; [7]; [15];[14]


La entrega de este trabajo debe contener:

    Todo el código necesario para ejecutar, es decir, no solo el código de la función solicitada, sino también el código correspondiente a la lista y los nodos (mínimamente con los métodos propuestos en el esqueleto).
    El código debe contener comentarios que indiquen la complejidad de la función desarrollada y de los distintos métodos de la lista (recuerden siempre indicar que es N)
    Se debe proveer un main en el que carguen y ejecuten las pruebas con las listas de ejemplo propuestas en este enunciado.