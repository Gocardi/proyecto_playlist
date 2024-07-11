# Music Library Project

## Descripción

Este proyecto es una aplicación de biblioteca de música que permite gestionar canciones y listas de reproducción utilizando estructuras de datos personalizadas. Está desarrollado en Java y utiliza Gradle como herramienta de construcción y gestión de dependencias.

## Estructura del proyecto

~~~bash 
.
├── README.md
├── build
│   ├── classes
│   │   └── java
│   │       └── main
│   │           └── controllers
│   │               └── AddSongController.class
│   ├── generated
│   │   └── sources
│   │       ├── annotationProcessor
│   │       │   └── java
│   │       │       └── main
│   │       └── headers
│   │           └── java
│   │               └── main
│   └── tmp
│       └── compileJava
├── build.gradle
├── data
│   └── songs.csv
├── docs
│   ├── presentation.pdf
│   └── project_report.pdf
├── lib
├── settings.gradle
└── src
    ├── main
    │   └── java
    │       ├── App.java
    │       ├── Main.java
    │       ├── controllers
    │       │   ├── AddSongController.java
    │       │   ├── ChangeOrderController.java
    │       │   ├── RemoveSongController.java
    │       │   └── ShuffleController.java
    │       └── models
    │           ├── Playlist.java
    │           ├── Song.java
    │           └── structures
    │               ├── BSTNode.java
    │               ├── BinarySearchTree.java
    │               ├── HashTable.java
    │               ├── Heap.java
    │               ├── LinkedList.java
    │               └── Node.java
    └── test
        └── java
            ├── LinkedListTest.java
            ├── NodeTest.java
            ├── PlaylistTest.java
            └── SongTest.java
~~~

## Requisitos

- Java Development Kit (JDK) 17
- Gradle
- Termux (si estás trabajando desde un entorno Android)

## Instalación

1. **Clonar el repositorio**:
   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd music-library
   ```

2. **Instalar JDK y Gradle (en Termux)**:
   ```bash
   pkg install openjdk-17
   pkg install gradle
   ```

## Uso

1. **Compilar el proyecto**:
   ```bash
   gradle build
   ```

2. **Ejecutar las pruebas**:
   ```bash
   gradle test
   ```

3. **Ejecutar la aplicación**:
   ```bash
   gradle run
   ```

## Estructuras de Datos Personalizadas

El proyecto incluye varias estructuras de datos personalizadas:

- `LinkedList`: Lista enlazada simple.
- `Stack`: Pila.
- `Queue`: Cola.
- `BinarySearchTree`: Árbol de búsqueda binaria.
- `HashTable`: Tabla hash.

Estas estructuras se encuentran en `src/main/java/models/structures/`.

## Controladores

Los controladores se utilizan para gestionar las operaciones sobre las listas de reproducción y las canciones. Se encuentran en `src/main/java/controllers/`.

## Modelos

Los modelos representan las entidades principales del proyecto: `Playlist` y `Song`. Se encuentran en `src/main/java/models/`.

## Pruebas

Las pruebas se han implementado utilizando JUnit y se encuentran en `src/test/java/tests/`. Las pruebas cubren las funcionalidades básicas de las estructuras de datos y los modelos.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, sigue los siguientes pasos:

1. Realiza un fork del repositorio.
2. Crea una rama nueva (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y commitea (`git commit -am 'Añadir nueva funcionalidad'`).
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`).
5. Crea un nuevo Pull Request.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.
```