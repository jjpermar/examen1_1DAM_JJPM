/**
 * @param entrada, es una variable de tipo cadena a la cual vamos a almacenar los datos
 * introducidos por el usuario.
 * @param listaEntrada, es una variable de tipo Arraylist en la cual vamos ir almacenando por separado
 * la edad y el mes introduccido por el usuario, para luego hacer uso de ella por separados.
 * @param edad, es una variable de tipo byte que va almacenar el valor de edad qu inserte el usuario.
 * @param mes, es una variable de tipo byte que almacenara el numero del mes que inserte el usuario.
 * @param prueba, es una variable de tipo entero, en la cual va almacenar el resultado de mes % 2,
 * para saber si el mes intruducido por el usuario es par o impar.
 */

/**
 * Funcion para mostrar las tablas de multiplicar, dependiendo del numero que le introduzca.
 */
fun tablas(num: Int){
    var i: Int = 0
    println("Tabla del $num")
    println("_".repeat(10))
    while (i <= 10){
        println("$num * $i = ${num*i}")
        i++
    }
}
/**
 * Funcion para mostrar el encabezado del programa
 */
fun generado_tablas(){
    var miNombre: String = "Juan Jose Perez Martinez"
    println("*".repeat(80))
    println("PROGRAMA DE GENERACIÓN DE TABLAS: $miNombre")
    println("_".repeat(80))
}
fun main(){
    var entrada: String
    var listaEntrada: List<String> = ArrayList()
    var edad: Byte
    var mes: Byte
    var prueba: Int
    println("Introduzca la configuración del programa en este formato: <edadDelAlumno>,  <mesActual>")
    entrada = readLine() ?: ""
    listaEntrada = entrada.split(",")
    if (listaEntrada.size != 2) //Compruebo el tamaño de la lista, si es != 2, finaliza el programa
    {
        println("La entrada no es correcta")
        println("_".repeat(80))
    }
    else { // Sino, leo edad y mes. Asigno -1 si hay error en la lectura.
        edad = try {listaEntrada[0].trim().toByte()} catch (_: Exception) {-1}
        mes = try {listaEntrada[1].trim().toByte()} catch (_: Exception) {-1}

        if ((edad <= 0) || (mes <= 0)) // Si alguno es menor que -1, finaliza el programa
        {
            generado_tablas()
            println("La entrada no es correcta")
            println("_".repeat(80))
        }
        else //Sino, continuo
        {
            // Añadimos el valor residuo a prueba para comprobar si el mes pasado por parametro es impar o par.
            prueba = mes%2
            generado_tablas()
            // Creo este if para comprobar si el mes pasado es mayor a 12, ya que solo existe 12 meses en un año
            // si el mes es mayor que 12 nos mostrara un mensaje y saldra del programa, si es menor que 12 entrara en el else.
            if (mes > 12 ) {
                println("Mes: $mes. No es un mes correcto")
                println("_".repeat(80))
            }else{
                if (edad in 6..8 && prueba == 0) { //comprobamos que si edad esta entre 6-8 y ademas es par
                    println("Edad: $edad. El alumno esta dentro del rango [6-8]")
                    println("Mes: $mes. El mes es par, corresponden las tablas siguientes: {2, 4}")
                    println("_".repeat(80))
                    println(" ")
                    // llamamos a la funcion de creacion de tablas y le pasamos los parametros correctos
                    tablas(2)
                    println(" ")
                    tablas(4)
                } else if (edad in 9..10 && prueba == 0) { // comprobamos si edad esta entre 9 - 10 y ademas es par
                    println("Edad: $edad. El alumno esta dentro del rango [9-10]")
                    println("Mes: $mes. El mes es par, corresponden las tablas siguientes: {6, 8, 10}")
                    println("_".repeat(80))
                    println(" ")
                    // llamamos a la funcion de creacion de tablas y le pasamos los parametros correctos
                    tablas(6)
                    println(" ")
                    tablas(8)
                    println(" ")
                    tablas(10)
                } else if (edad in 11..12 && prueba == 0) { // comprobamos que la edad este entre 11 - 12 y ademas sea par
                    println("Edad: $edad. El alumno esta dentro del rango [11-12]")
                    println("Mes: $mes. El mes es par, corresponden las tablas siguientes: {11, 12, 13}")
                    println("_".repeat(80))
                    println(" ")
                    // llamamos a la funcion de creacion de tablas y le pasamos los parametros correctos
                    tablas(11)
                    println(" ")
                    tablas(12)
                    println(" ")
                    tablas(13)
                } else if (edad in 6..8 && prueba !== 0) { //comprobamos que la edad este entre 6-8 y sea impar
                    println("Edad: $edad. El alumno esta dentro del rango [6-8]")
                    println("Mes: $mes. El mes es impar, corresponden las tablas siguientes: {1, 3, 5}")
                    println("_".repeat(80))
                    println(" ")
                    // llamamos a la funcion de creacion de tablas y le pasamos los parametros correctos
                    tablas(1)
                    println(" ")
                    tablas(3)
                    println(" ")
                    tablas(5)
                } else if (edad in 9..10 && prueba !== 0) {//comprobamos que la edad este entre 9-10 y sea impar
                    println("Edad: $edad. El alumno esta dentro del rango [6-8]")
                    println("Mes: $mes. El mes es par, corresponden las tablas siguientes: {7, 9}")
                    println("_".repeat(80))
                    println(" ")
                    // llamamos a la funcion de creacion de tablas y le pasamos los parametros correctos
                    tablas(7)
                    println(" ")
                    tablas(9)
                } else if (edad in 11..12 && prueba !== 0) {//comprobamos que la edad este entre 11-12 y sea impar
                    println("Edad: $edad. El alumno esta dentro del rango [6-8]")
                    println("Mes: $mes. El mes es par, corresponden las tablas siguientes: {11, 12, 13}")
                    println("_".repeat(80))
                    println(" ")
                    // llamamos a la funcion de creacion de tablas y le pasamos los parametros correctos
                    tablas(11)
                    println(" ")
                    tablas(12)
                    println(" ")
                    tablas(13)
                } else if (edad < 6 || edad > 12) { // comprobamos que la variable edad no sea menor que 6 o mayor de 12
                    println("Edad: $edad. No esta contemplada en el programa")
                    println("_".repeat(80))
                }
            }
        }

    }
    println("*".repeat(80))
}