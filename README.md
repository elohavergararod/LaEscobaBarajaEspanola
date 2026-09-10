![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

# La Escoba – Baraja Española 🃏

## 📌 Descripción

Implementación en Java del clásico juego de cartas español **"La Escoba"**, jugado con la baraja española (40 cartas). Incluye la lógica del juego, gestión de jugadores, cálculo de puntos y persistencia de estadísticas entre partidas.

## 🚀 Funcionalidades

* Simulación completa de una partida de La Escoba con la baraja española
* Gestión de jugadores (turnos, manos, jugadas)
* Aplicación de las reglas del juego
* Cálculo y acumulación de puntos por partida
* Registro de estadísticas persistentes entre ejecuciones (`stats.bin`)

## 📂 Estructura del proyecto

Proyecto de IntelliJ IDEA. Todo el código fuente vive dentro de `src/`, organizado en paquetes:

```
LaEscobaBarajaEspanola/
│── .idea/           # Configuración del proyecto de IntelliJ IDEA
│── src/
│   │── aplicacion/  # Punto de entrada de la aplicación
│   │── baraja/       # Modelo de la baraja española y las cartas
│   │── juego/         # Lógica principal del juego (turnos, jugadas, flujo de partida)
│   │── jugador/       # Modelo del jugador (mano, puntuación individual)
│   │── puntos/         # Cálculo y acumulación de puntos
│   │── reglas/         # Reglas del juego (escoba, cartas especiales, etc.)
│   │── stats/           # Registro y lectura de estadísticas de partidas
│   │── input/           # Archivos de entrada de datos
│   │── output/          # Archivos de salida / resultados generados
│── stats.bin        # Archivo binario con estadísticas guardadas
│── LaEscoba.iml     # Módulo de IntelliJ IDEA
```

## 🛠️ Tecnologías

* Java
* IntelliJ IDEA

## ⚙️ Instalación

1. Clona el repositorio:
   ```sh
   git clone https://github.com/elohavergararod/LaEscobaBarajaEspanola.git
   cd LaEscobaBarajaEspanola
   ```
2. Abre el proyecto con IntelliJ IDEA (ya incluye la configuración `.idea` y el archivo `LaEscoba.iml`), o compílalo manualmente:
   ```sh
   javac src/aplicacion/*.java -d out
   ```

## ▶️ Uso

Ejecuta la clase principal desde el paquete `aplicacion` y sigue las instrucciones por consola para jugar una partida:

```sh
java -cp out aplicacion.Main
```

> 💡 Ajusta el nombre de la clase principal según cómo se llame realmente en `aplicacion/` (por ejemplo `Main`, `App`, etc.).

Las estadísticas de las partidas jugadas se guardan automáticamente en `stats.bin` y se cargan en ejecuciones posteriores.

## 👤 Autora

Elohá Vergara Rodrigues

## 📄 Licencia

Este proyecto es de código abierto bajo la licencia MIT.
