# Conquerors of the League

**[ES]** Este es un proyecto para la asignatura Programación Modular Orientada a Objetos (PMOO) que hicimos en la facultad. Usamos Maquinas Abstractas de Datos (MAE), Tipos Abstractos de Datos (TAD), Estructuras de Datos (ArrayList en particular), Herencia, Excepciones y Pruebas Unitarias (Junits).

**[EN]**This is a project for the Object Oriented Modular Programming (OOMP) course we did in college. We used Abstract Data Machines (ADM), Abstract Data Types (ADT), Data Structures (ArrayList in particular), Inheritance, Exceptions and Unit Tests (Junits).

## Introduccion

El proyecto se trata de un juego de cartas. Se empieza con un entrenador, que será tu personaje, nada más iniciar el juego se le pregunta por el nombre, y posteriormente se le pide que elija una carta. Esa carta será con la que tenga que luchar. A lo largo del camino se encontrará con otros personajes que también portarán una carta. Nuestro protagonista deberá de combatir para hacer que su carta suba niveles y sea más fuerte. En los combates se puede perder, lo que conllevará, como penalización, la pérdida de niveles. En el enfrentamiento también se pierde vida, por eso hay que estar atento para decirle a la carta que recupere vida.

Los personajes que se puede encontrar son de tres tipos:

- **Entrenadores:** En cada casilla del mapa hay un entrenador. Con estos se puede luchar o no luchar, es el usuario el que decide. Si se enfrenta a ellos y pierde, la carta bajará de nivel. En el caso de que gane la carta subirá de nivel, y el contador del entrenador se aumentará en +1. No podrá ganar al mismo entrenador más de cuatro veces. El motivo es que el protagonista podría pelear infinitas veces con una carta muy inferior a él, hasta tener el nivel suficiente como para pasarse el juego sin esforzarse en absoluto.

- **Líderes:** El líder es una forma de frenar al protagonista, si no les derrotas al menos una vez, no podrás pasar a la siguiente casilla. Algunos líderes podrán tener más de una carta, pero esta no la usarán para combatir, sino que será utilizada a modo de recompensa. Si te enfrentas a un líder con una carta extra y le ganas, este te la entregará, y tendrás dos cartas. Sigue con el mismo patrón que el entrenador, tienen un contador para que les ganes a ellos más de 4 veces.

- **Élite:** Se componen de tres entrenadores con tres cartas diferentes. Se encuentran siempre al final de cada nivel. Sólo les puedes ganar una única vez, ya que cuando les ganes pasarás automáticamente al siguiente nivel, y no tendrás posibilidad de retroceder.


Por otro lado, tenemos cuatro tipos de cartas, que son Agua, Fuego, Hoja y Psico. En el caso de que tengamos más de una carta podemos decidir con cual nos queremos enfrentar. El de Fuego tiene ventaja sobre Hoja, el de Hoja tiene ventaja sobre Agua, el de Agua tiene ventaja contra Fuego. El de Psico, por el contrario, es neutral.
El juego se compone de 5 niveles, cada nivel tiene 7 casillas, cuando se llega a la séptima y se derrota a la élite pasamos a la primera casilla del siguiente nivel.
Tenemos que comentar que este juego no tiene fin. En un principio se gana cuando se llega a la última casilla del último nivel, pero es recursivo, tenemos la oportunidad de seguir jugando. En tal caso se vuelve a iniciar en el nivel uno con las mismas narraciones, pero con unas cartas a un nivel superior, ya que no sería equitativo volver a enfrentarse contra cartas de nivel 5 cuando el protagonista tiene un nivel 200.


## Estructura de directorios

    .
    ├── Proyecto Conquerors JAVA        # Proyecto completo. Puedes añadirlo a Eclipse o tu IDE favorito.
    │   ├── src                         # Código fuente del juego.
    │   └── test                        # Pruebas unitarias para todos los módulos del juego.
    ├── Compilacion y Ejecutable
    │   ├── Conqueror.jar               # El juego encapsulado en un fichero jar.
    │   ├── ejecutable.bat              # El script para Windows que debes ejecutar si quieres jugar.
    │   └── Read Me.txt                 # Instrucciones.
    └── README.md


##¿Cómo ejecutar el juego?

¿Quieres jugar? Te diremos como... Para Windows o para Linux.

### Entorno Windows

Si quieres jugar en Windows...

```sh
Just execute the file ZombieRising.bat
```

Si no confías en los ficheros ejecutables, puedes clonar este repositorio y añadir el código fuente en tu Entorno de Desarrollo favorito. Recuerda que lo programamos usando Java 1.7.



### Entorno Linux

En caso de que estés usando un sistema operativo Linux...

```sh
git clone https://github.com/jagumiel/Conquerors-of-the-League.git
cd Conquerors-of-the-League
cd Compilacion y Ejecutable
java -jar Conqueror.jar
```

Lo mismo de antes, si no confías en los ejecutables, usa tu IDE favorito.

## Miscelanea

Este proyecto lo hicimos en grupo en 2013. Tal vez quieras visitar el portfolio de Github de algunos de sus creadores:

### Authors:


- [BegoMdeMM](https://github.com/BegoMdeMM)
- [mbarcina001](https://github.com/mbarcina001)
- [jagumiel](https://github.com/jagumiel)



