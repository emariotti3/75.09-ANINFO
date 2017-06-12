# language: es
Característica: Manipulacion de la aplicacion a traves de distintos usuarios

  #Usuario 0 es el gerente.

  Escenario: Un gerente pide la cantidad de tares en determinado proyecto
    Dado que mi proyecto tiene una iteracion con "5" tareas y las primeras "3" terminadas
    Cuando el usuario "0" pide las tareas de ese proyecto
    Entonces obtengo un listado con "5" tareas

  Escenario: Un gerente pide la cantidad de tares en determinado proyecto
    Dado que mi proyecto tiene una iteracion con "5" tareas y las primeras "3" terminadas
    Cuando el usuario "0" pide las tareas terminadas de ese proyecto
    Entonces obtengo un listado con "3" tareas


  Escenario: Un usuario fuera del proyecto pide la cantidad de tares en determinado proyecto
    Dado que mi proyecto tiene una iteracion con "5" tareas y las primeras "3" terminadas
    Cuando el usuario "2" pide las tareas de ese proyecto
    Entonces obtengo un listado con "0" tareas