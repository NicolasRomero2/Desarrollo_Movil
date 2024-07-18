Variables
En Kotlin, las principales formas de declarar variables son con val y var. Sin embargo, Kotlin también soporta tipos específicos de variables basados en la mutabilidad y la referencia.
val: Variable inmutable. Una vez asignado, su valor no puede cambiar.
var: Variable mutable. Su valor puede cambiar después de la asignación inicial.
Constantes
En Kotlin, las constantes son valores que no cambian una vez asignados. Se definen utilizando la palabra clave const y solo pueden ser usadas con tipos primitivos
y el tipo String. Las constantes se deben definir a nivel de clase o a nivel de objeto (no dentro de una función).
Opcionales
En Kotlin, los tipos opcionales se usan para manejar variables que pueden contener un valor o ser nulas. Se utilizan para evitar errores de referencia nula (null pointer exceptions). Un tipo opcional se define
añadiendo un ? al final del tipo de dato.
Nulos
En Kotlin, null es un valor que puede ser asignado a cualquier tipo de variable opcional (nullable). Kotlin tiene un sistema de tipos seguro que previene referencias nulas a menos que explícitamente se permita. Esto ayuda a reducir los errores comunes en otros lenguajes de programación causados por referencias nulas.

RESUMEN: Constantes (const): Son valores inmutables que se definen a nivel de clase o objeto y se utilizan con tipos primitivos y String.
Opcionales (T?): Tipos que pueden contener un valor o ser nulos, ayudando a manejar referencias nulas de manera segura.
Nulos (null): Representa la ausencia de un valor y puede asignarse a variables opcionales para indicar que no tienen valor.