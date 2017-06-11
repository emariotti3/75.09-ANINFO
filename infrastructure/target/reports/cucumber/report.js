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
  "duration": 2594438013,
  "status": "passed"
});
formatter.match({
  "location": "IteracionTest.cuando_agrego_una_iteracion()"
});
formatter.result({
  "duration": 23081,
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
  "duration": 97030,
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
  "duration": 195375,
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
  "duration": 107441,
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
  "duration": 102659,
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
  "duration": 286255,
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
  "duration": 151928,
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
  "duration": 94454,
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
  "duration": 819652,
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
  "duration": 125427,
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
  "duration": 73496,
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
  "duration": 497512,
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
  "duration": 116775,
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
  "duration": 199599,
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
  "duration": 358179,
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
  "duration": 133050,
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
  "duration": 133534,
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
  "duration": 962641,
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
  "duration": 136901,
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
  "duration": 95394,
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
  "duration": 203174,
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
  "duration": 160699,
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
  "duration": 81663,
  "status": "passed"
});
});