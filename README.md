# Project Name

## Descripción

Este proyecto es una aplicación de gestión de listas de reproducción de canciones. Permite agregar, eliminar, cambiar el orden y reproducir aleatoriamente las canciones. La base de datos de canciones está almacenada en un archivo CSV.

## Estructura del Proyecto
~~~bash 
.
├── README.md
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
            ├── PlaylistTest.java
            └── SongTest.java
~~~

## Comandos Gradle

- **Construir el proyecto**: `./gradlew build`
- **Ejecutar pruebas**: `./gradlew test`
- **Limpiar el proyecto**: `./gradlew clean`

## Configuración del Proyecto

Asegúrate de tener Gradle instalado y configurado correctamente. Puedes utilizar el wrapper de Gradle incluido en el proyecto para ejecutar los comandos sin necesidad de una instalación global.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.
