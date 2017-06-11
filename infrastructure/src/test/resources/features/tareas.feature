# language: es
Característica: Manejo de tareas

  Escenario: Agregado de tareas a una iteracion valida
    Dado que mi proyecto tiene "2" iteraciones,la iteracion "1" es la activa y tiene "1" tarea
    Cuando agrego una tarea a la iteracion "1"
    Entonces la iteracion "1" ahora tiene "2" tareas

  Escenario: Agregado de tareas a una iteracion invalida
    Dado que mi proyecto tiene "2" iteraciones,la iteracion "0" es la activa y tiene "1" tarea
    Cuando agrego una tarea a la iteracion "0"
    Entonces la iteracion "0" sigue teniendo "1" tareas


  Escenario: Finalizacion de una tarea por usuario que trabaja en ella
    Dado que el que usuario "1" posee la tarea "xxxx"
    Cuando el usuario "1" finaliza la tarea "xxxx"
    Entonces la tarea "xxxx" esta finalizada

  Escenario: Finalizacion de una tarea por usuario que no trabaja en ella
    Dado que el que usuario "1" posee la tarea "xxxx"
    Cuando el usuario "2" finaliza la tarea "xxxx"
    Entonces la tarea "xxxx" no esta finalizada