$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("tareas.feature");
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
  "location": "PSATest.que_mi_proyecto(int,int,int)"
});
formatter.result({
  "duration": 132650060,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 33
    }
  ],
  "location": "PSATest.cuando_agrego_una_tarea(Integer)"
});
formatter.result({
  "duration": 166483,
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
  "location": "PSATest.la_iteracion_tiene(Integer,Integer)"
});
formatter.result({
  "duration": 190626,
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
  "location": "PSATest.que_mi_proyecto(int,int,int)"
});
formatter.result({
  "duration": 272991,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 33
    }
  ],
  "location": "PSATest.cuando_agrego_una_tarea(Integer)"
});
formatter.result({
  "duration": 109873,
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
  "location": "PSATest.la_iteracion_sigue_teniendo(Integer,Integer)"
});
formatter.result({
  "duration": 122165,
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
  "location": "PSATest.que_el_usuario_posee_tarea(Integer,String)"
});
formatter.result({
  "duration": 977414,
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
  "location": "PSATest.cuando_agrego_una_tarea(Integer,String)"
});
formatter.result({
  "duration": 116639,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xxxx",
      "offset": 10
    }
  ],
  "location": "PSATest.la_tarea_esta_finalizada(String)"
});
formatter.result({
  "duration": 97677,
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
  "location": "PSATest.que_el_usuario_posee_tarea(Integer,String)"
});
formatter.result({
  "duration": 199857,
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
  "location": "PSATest.cuando_agrego_una_tarea(Integer,String)"
});
formatter.result({
  "duration": 144285,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xxxx",
      "offset": 10
    }
  ],
  "location": "PSATest.la_tarea_no_esta_finalizada(String)"
});
formatter.result({
  "duration": 83729,
  "status": "passed"
});
});