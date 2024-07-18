package co.edu.sena.myapp082

// Definición de una constante
const val PI = 3.14159

// Definición de una clase
class Persona(val nombre: String, val apellido: String?) {

    // Variable mutable
    var edad: Int = 0

    // Función para mostrar información de la persona
    fun mostrarInformacion() {
        // Safe call operator para manejar el apellido opcional
        val nombreCompleto = if (apellido != null) {
            "$nombre $apellido"
        } else {
            nombre
        }

        println("Nombre Completo: $nombreCompleto")
        println("Edad: $edad")
    }
}

fun main() {
    // Creación de un objeto Persona
    val persona1 = Persona("Nicolas", "Romero")
    persona1.edad = 17

    // Uso del Elvis operator para proporcionar un valor por defecto
    val longitudNombre = persona1.nombre.length
    val longitudApellido = persona1.apellido?.length ?: 0

    // Mostrar información de la persona
    persona1.mostrarInformacion()
    println("Longitud del Nombre: $longitudNombre")
    println("Longitud del Apellido: $longitudApellido")

    // Creación de otro objeto Persona con apellido nulo
    val persona2 = Persona("Niconi", null)
    persona2.edad = 25

    // Mostrar información de la persona
    persona2.mostrarInformacion()

    // Ejemplo de uso de una constante
    println("El valor de PI es $PI")
}
