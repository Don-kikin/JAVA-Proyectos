# Mundo Animal — Herencia, Polimorfismo y Diseño de Clases

## Descripción
Aplicación en Java desarrollada para demostrar la aplicación práctica de los pilares de la Programación Orientada a Objetos (POO): encapsulamiento, herencia, abstracción (clases abstractas e interfaces), sobrescritura de métodos y polimorfismo.

## Estructura del Proyecto
El código fuente está organizado dentro del paquete `mx.com.animales`:

* **Animal**: Clase abstracta base que encapsula `nombre` y `edad`, provee el método concreto `mostrarInformacion()` y declara el método abstracto `hacerSonido()`.
* **Movible**: Interfaz que define el contrato `moverse()`.
* **Perro**: Subclase de `Animal` que implementa `Movible`.
* **Gato**: Subclase de `Animal` que implementa `Movible`.
* **Vaca**: Subclase de `Animal` que implementa `Movible`.
* **Caballo**: Subclase adicional (reto extra) que extiende `Animal` e implementa `Movible`.
* **Main**: Clase ejecutable que gestiona el arreglo polimórfico `Animal[]` y ejecuta las acciones de cada instancia.

## Instrucciones de Ejecución
1. Clonar el repositorio:
   ```bash
   git clone <URL_DEL_REPOSITORIO>