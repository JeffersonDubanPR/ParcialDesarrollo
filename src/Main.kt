import java.util.*


fun main() {


      val sistema = reservaSistema()
      val scanner = Scanner(System.`in`)

      while (true) {
         println("\nMenú de Reservas")
         println("1 Registrar Reserva")
         println("2 Cancelar Reserva")
         println("3 Mostrar Reservas")
         println("4 Salir")
         print("Seleccione una opción")

         when (scanner.nextInt()) {
            1 -> {
               println("Ingrese el ID de la reserva")
               val idReserva = scanner.nextInt()
               println("Ingrese el ID del huesped")
               val idHuesped = scanner.nextInt()
               scanner.nextLine()
               println("Ingrese el nombre del huesped")
               val nombreHuesped = scanner.nextLine()
               println("Ingrese el email del huesped")
               val emailhuesped = scanner.nextLine()
               println("Ingrese el número de habitación")
               val numeroHabitacion = scanner.nextInt()
               scanner.nextLine()
               println("Ingrese el tipo de habitación")
               val tipoHabitacion = scanner.nextLine()
               println("Ingrese el precio por noche:")
               val precioNoche = scanner.nextDouble()
               println("Ingrese la cantidad de noches reservadas:")
               val nochesReservadas = scanner.nextInt()

               val reserva = Reserva(idReserva, idHuesped, nombreHuesped, emailhuesped, numeroHabitacion, tipoHabitacion, precioNoche, nochesReservadas)
               sistema.registrarReserva(reserva)
            }
            2 -> {
               println("Ingrese el ID de la reserva a cancelar:")
               val idReserva = scanner.nextInt()
               sistema.cancelarReserva(idReserva)
            }
            3 -> sistema.mostrarReservas()
            4 -> {
               println("Grcias por Elegirnos")
               return
            }
            else -> println("Opcion no válida")
         }
      }
   }




