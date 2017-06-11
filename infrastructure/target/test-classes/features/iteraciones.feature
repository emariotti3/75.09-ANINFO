# language: es
Característica: Manejo de iteraciones

  Escenario: Agregado de una iteracion
    Dado que mi proyecto tiene "5" iteraciones y la numero "3" esta activa
    Cuando agrego una iteracion
    Entonces mi proyecto tiene "6" iteraciones

  Escenario: Finalizacion de una iteracion valida
    Dado que mi proyecto tiene "5" iteraciones y la numero "3" esta activa
    Cuando finalizo la iteracion "3"
    Entonces la iteracion "3" esta finalizada

  Escenario: Finalizacion de una iteracion valida con tarea incompleta
    Dado que mi proyecto tiene "5" iteraciones y la numero "3" esta activa
    Cuando finalizo la iteracion "3" sin finalizar todas las tareas
    Entonces la iteracion "3" esta activa

  Escenario: Finalizacion de una iteracion invalida
    Dado que mi proyecto tiene "5" iteraciones y la numero "3" esta activa
    Cuando finalizo la iteracion "4"
    Entonces la iteracion "4" no esta activa

