$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("iteraciones.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: es"
    }
  ],
  "line": 2,
  "name": "Manejo de iteraciones",
  "description": "",
  "id": "manejo-de-iteraciones",
  "keyword": "Característica"
});
formatter.scenario({
  "line": 4,
  "name": "Agregado de una iteracion",
  "description": "",
  "id": "manejo-de-iteraciones;agregado-de-una-iteracion",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 5,
  "name": "que mi proyecto tiene \"5\" iteraciones y la numero \"3\" esta activa",
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "agrego una iteracion",
  "keyword": "Cuando "
});
formatter.step({
  "line": 7,
  "name": "mi proyecto tiene \"6\" iteraciones",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 23
    },
    {
      "val": "3",
      "offset": 51
    }
  ],
  "location": "IteracionTest.que_mi_proyecto_tiene_iteraciones(int,int)"
});
formatter.result({
  "duration": 121944980,
  "status": "passed"
});
formatter.match({
  "location": "IteracionTest.cuando_agrego_una_iteracion()"
});
formatter.result({
  "duration": 22724,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 19
    }
  ],
  "location": "IteracionTest.mi_proyecto_tiene(Integer)"
});
formatter.result({
  "duration": 88750,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Finalizacion de una iteracion valida",
  "description": "",
  "id": "manejo-de-iteraciones;finalizacion-de-una-iteracion-valida",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 10,
  "name": "que mi proyecto tiene \"5\" iteraciones y la numero \"3\" esta activa",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "finalizo la iteracion \"3\"",
  "keyword": "Cuando "
});
formatter.step({
  "line": 12,
  "name": "la iteracion \"3\" esta finalizada",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 23
    },
    {
      "val": "3",
      "offset": 51
    }
  ],
  "location": "IteracionTest.que_mi_proyecto_tiene_iteraciones(int,int)"
});
formatter.result({
  "duration": 196045,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 23
    }
  ],
  "location": "IteracionTest.cuando_finalizo_la_iteracion(Integer)"
});
formatter.result({
  "duration": 77884,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 14
    }
  ],
  "location": "IteracionTest.la_iteracion_esta_finalizada(Integer)"
});
formatter.result({
  "duration": 94047,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Finalizacion de una iteracion valida con tarea incompleta",
  "description": "",
  "id": "manejo-de-iteraciones;finalizacion-de-una-iteracion-valida-con-tarea-incompleta",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 15,
  "name": "que mi proyecto tiene \"5\" iteraciones y la numero \"3\" esta activa",
  "keyword": "Dado "
});
formatter.step({
  "line": 16,
  "name": "finalizo la iteracion \"3\" sin finalizar todas las tareas",
  "keyword": "Cuando "
});
formatter.step({
  "line": 17,
  "name": "la iteracion \"3\" esta activa",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 23
    },
    {
      "val": "3",
      "offset": 51
    }
  ],
  "location": "IteracionTest.que_mi_proyecto_tiene_iteraciones(int,int)"
});
formatter.result({
  "duration": 185130,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 23
    }
  ],
  "location": "IteracionTest.cuando_finalizo_la_iteracion_sin_finalizar_tareas(Integer)"
});
formatter.result({
  "duration": 76081,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 14
    }
  ],
  "location": "IteracionTest.la_iteracion_esta_activa(Integer)"
});
formatter.result({
  "duration": 76544,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Finalizacion de una iteracion invalida",
  "description": "",
  "id": "manejo-de-iteraciones;finalizacion-de-una-iteracion-invalida",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 20,
  "name": "que mi proyecto tiene \"5\" iteraciones y la numero \"3\" esta activa",
  "keyword": "Dado "
});
formatter.step({
  "line": 21,
  "name": "finalizo la iteracion \"4\"",
  "keyword": "Cuando "
});
formatter.step({
  "line": 22,
  "name": "la iteracion \"4\" no esta activa",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 23
    },
    {
      "val": "3",
      "offset": 51
    }
  ],
  "location": "IteracionTest.que_mi_proyecto_tiene_iteraciones(int,int)"
});
formatter.result({
  "duration": 298097,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 23
    }
  ],
  "location": "IteracionTest.cuando_finalizo_la_iteracion(Integer)"
});
formatter.result({
  "duration": 146506,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 14
    }
  ],
  "location": "IteracionTest.la_iteracion_no_esta_activa(Integer)"
});
formatter.result({
  "duration": 103150,
  "status": "passed"
});
formatter.uri("proyectos.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: es"
    }
  ],
  "line": 2,
  "name": "Manejo del proyecto",
  "description": "",
  "id": "manejo-del-proyecto",
  "keyword": "Característica"
});
formatter.scenario({
  "line": 4,
  "name": "Finalizado de un proyecto valido",
  "description": "",
  "id": "manejo-del-proyecto;finalizado-de-un-proyecto-valido",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 5,
  "name": "que mi proyecto tiene una iteracion y se finalizo la tarea \"true\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "finalizo el proyecto",
  "keyword": "Cuando "
});
formatter.step({
  "line": 7,
  "name": "el proyecto esta finalizado",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 60
    }
  ],
  "location": "ProyectoTest.que_mi_proyecto_tiene(boolean)"
});
formatter.result({
  "duration": 774484,
  "status": "passed"
});
formatter.match({
  "location": "ProyectoTest.cuando_finalizo_el_proyecto()"
});
formatter.result({
  "duration": 80393,
  "status": "passed"
});
formatter.match({
  "location": "ProyectoTest.el_proyecto_esta_finalizado()"
});
formatter.result({
  "duration": 31955,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Finalizado de un proyecto invalido",
  "description": "",
  "id": "manejo-del-proyecto;finalizado-de-un-proyecto-invalido",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 10,
  "name": "que mi proyecto tiene una iteracion y se finalizo la tarea \"false\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "finalizo el proyecto",
  "keyword": "Cuando "
});
formatter.step({
  "line": 12,
  "name": "el proyecto no esta finalizado",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "false",
      "offset": 60
    }
  ],
  "location": "ProyectoTest.que_mi_proyecto_tiene(boolean)"
});
formatter.result({
  "duration": 150485,
  "status": "passed"
});
formatter.match({
  "location": "ProyectoTest.cuando_finalizo_el_proyecto()"
});
formatter.result({
  "duration": 58517,
  "status": "passed"
});
formatter.match({
  "location": "ProyectoTest.el_proyecto_no_esta_finalizado()"
});
formatter.result({
  "duration": 26674,
  "status": "passed"
});
formatter.uri("tareas.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: es"
    }
  ],
  "line": 2,
  "name": "Manejo de tareas",
  "description": "",
  "id": "manejo-de-tareas",
  "keyword": "Característica"
});
formatter.scenario({
  "line": 4,
  "name": "Agregado de tareas a una iteracion valida",
  "description": "",
  "id": "manejo-de-tareas;agregado-de-tareas-a-una-iteracion-valida",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 5,
  "name": "que mi proyecto tiene \"2\" iteraciones,la iteracion \"1\" es la activa y tiene \"1\" tarea",
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "agrego una tarea a la iteracion \"1\"",
  "keyword": "Cuando "
});
formatter.step({
  "line": 7,
  "name": "la iteracion \"1\" ahora tiene \"2\" tareas",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 23
    },
    {
      "val": "1",
      "offset": 52
    },
    {
      "val": "1",
      "offset": 77
    }
  ],
  "location": "TareaTest.que_mi_proyecto(int,int,int)"
});
formatter.result({
  "duration": 1021954,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 33
    }
  ],
  "location": "TareaTest.cuando_agrego_una_tarea(Integer)"
});
formatter.result({
  "duration": 127147,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 14
    },
    {
      "val": "2",
      "offset": 30
    }
  ],
  "location": "TareaTest.la_iteracion_tiene(Integer,Integer)"
});
formatter.result({
  "duration": 179565,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Agregado de tareas a una iteracion invalida",
  "description": "",
  "id": "manejo-de-tareas;agregado-de-tareas-a-una-iteracion-invalida",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 10,
  "name": "que mi proyecto tiene \"2\" iteraciones,la iteracion \"0\" es la activa y tiene \"1\" tarea",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "agrego una tarea a la iteracion \"0\"",
  "keyword": "Cuando "
});
formatter.step({
  "line": 12,
  "name": "la iteracion \"0\" sigue teniendo \"1\" tareas",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 23
    },
    {
      "val": "0",
      "offset": 52
    },
    {
      "val": "1",
      "offset": 77
    }
  ],
  "location": "TareaTest.que_mi_proyecto(int,int,int)"
});
formatter.result({
  "duration": 232249,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 33
    }
  ],
  "location": "TareaTest.cuando_agrego_una_tarea(Integer)"
});
formatter.result({
  "duration": 126746,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 14
    },
    {
      "val": "1",
      "offset": 33
    }
  ],
  "location": "TareaTest.la_iteracion_sigue_teniendo(Integer,Integer)"
});
formatter.result({
  "duration": 138755,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Finalizacion de una tarea por usuario que trabaja en ella",
  "description": "",
  "id": "manejo-de-tareas;finalizacion-de-una-tarea-por-usuario-que-trabaja-en-ella",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 16,
  "name": "que el que usuario \"1\" posee la tarea \"xxxx\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 17,
  "name": "el usuario \"1\" finaliza la tarea \"xxxx\"",
  "keyword": "Cuando "
});
formatter.step({
  "line": 18,
  "name": "la tarea \"xxxx\" esta finalizada",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    },
    {
      "val": "xxxx",
      "offset": 39
    }
  ],
  "location": "TareaTest.que_el_usuario_posee_tarea(Integer,String)"
});
formatter.result({
  "duration": 596397,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 12
    },
    {
      "val": "xxxx",
      "offset": 34
    }
  ],
  "location": "TareaTest.cuando_agrego_una_tarea(Integer,String)"
});
formatter.result({
  "duration": 94873,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xxxx",
      "offset": 10
    }
  ],
  "location": "TareaTest.la_tarea_esta_finalizada(String)"
});
formatter.result({
  "duration": 74379,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Finalizacion de una tarea por usuario que no trabaja en ella",
  "description": "",
  "id": "manejo-de-tareas;finalizacion-de-una-tarea-por-usuario-que-no-trabaja-en-ella",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 21,
  "name": "que el que usuario \"1\" posee la tarea \"xxxx\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 22,
  "name": "el usuario \"2\" finaliza la tarea \"xxxx\"",
  "keyword": "Cuando "
});
formatter.step({
  "line": 23,
  "name": "la tarea \"xxxx\" no esta finalizada",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    },
    {
      "val": "xxxx",
      "offset": 39
    }
  ],
  "location": "TareaTest.que_el_usuario_posee_tarea(Integer,String)"
});
formatter.result({
  "duration": 148385,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 12
    },
    {
      "val": "xxxx",
      "offset": 34
    }
  ],
  "location": "TareaTest.cuando_agrego_una_tarea(Integer,String)"
});
formatter.result({
  "duration": 108029,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xxxx",
      "offset": 10
    }
  ],
  "location": "TareaTest.la_tarea_no_esta_finalizada(String)"
});
formatter.result({
  "duration": 60276,
  "status": "passed"
});
});