# Project Name

## Descripción

Este proyecto es una aplicación de gestión de listas de reproducción de canciones. Permite agregar, eliminar, cambiar el orden y reproducir aleatoriamente las canciones. La base de datos de canciones está almacenada en un archivo CSV.

## Estructura del Proyecto
project-root/ │ ├── src/ │   ├── main/ │   │   ├── java/ │   │   │   ├── App.java │   │   │   ├── Main.java │   │   │   ├── controllers/ │   │   │   │   ├── AddSongController.java │   │   │   │   ├── RemoveSongController.java │   │   │   │   ├── ChangeOrderController.java │   │   │   │   └── ShuffleController.java │   │   │   ├── models/ │   │   │   │   ├── Playlist.java │   │   │   │   ├── Song.java │   │   │   │   └── structures/ │   │   │   │       ├── LinkedList.java │   │   │   │       ├── Node.java │   │   │   │       ├── BinarySearchTree.java │   │   │   │       ├── BSTNode.java │   │   │   │       ├── HashTable.java │   │   │   │       └── Heap.java │   ├── test/ │   │   └── java/ │   │       ├── PlaylistTest.java │   │       └── SongTest.java │ ├── data/ │   └── songs.csv │ ├── docs/ │   ├── project_report.pdf │   └── presentation.pdf │ ├── lib/ │   └── (bibliotecas externas si es necesario) │ ├── build.gradle ├── settings.gradle ├── gradlew ├── gradlew.bat ├── README.md └── .gitignore

## Comandos Gradle

- **Construir el proyecto**: `./gradlew build`
- **Ejecutar pruebas**: `./gradlew test`
- **Limpiar el proyecto**: `./gradlew clean`

## Configuración del Proyecto

Asegúrate de tener Gradle instalado y configurado correctamente. Puedes utilizar el wrapper de Gradle incluido en el proyecto para ejecutar los comandos sin necesidad de una instalación global.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.
