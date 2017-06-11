# language: es
Característica: Manejo del proyecto

  Escenario: Finalizado de un proyecto valido
    Dado que mi proyecto tiene una iteracion y se finalizo la tarea "true"
    Cuando finalizo el proyecto
    Entonces el proyecto esta finalizado

  Escenario: Finalizado de un proyecto invalido
    Dado que mi proyecto tiene una iteracion y se finalizo la tarea "false"
    Cuando finalizo el proyecto
    Entonces el proyecto no esta finalizado