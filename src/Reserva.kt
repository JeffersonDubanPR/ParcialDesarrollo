data class Reserva(
        val idreserva: Int,
        val idhuesped: Int,
        val nombrehuesped: String,
        val emailhuesped: String,
        val nuhabitacion: Int,
        val tipohabitacion: String,
        val precionoche: Double,
        val nochesreservada: Int
    ) {
        fun calcularTotal(): Double {
            return precionoche * nochesreservada
        }
    }

class reservaSistema {
    private val reservas = mutableListOf<Reserva>()

    fun registrarReserva(reserva: Reserva) {
        if (reservas.any { it.nuhabitacion == reserva.nuhabitacion }) {
            println("La habitación ${reserva.nuhabitacion} ya está reservada")
        } else {
            reservas.add(reserva)
            println(" La reserva fue registrada con éxito: ${reserva}")
        }

    }

    fun cancelarReserva(idReserva: Int) {
        val reserva = reservas.find { it.idreserva == idReserva }
        if (reserva != null) {
            reservas.remove(reserva)
            println("Reserva con Id $idReserva cancelada correctamente.")
        } else {
            println("No se encontró ninguna reserva con Id $idReserva.")
        }
    }

    fun mostrarReservas() {
        if (reservas.isEmpty()) {
            println("No hay reservas activas.")
        } else {
            println("Reservas activas:")
            reservas.forEach {
                println("ID: ${it.idreserva}, Huesped: ${it.nombrehuesped}, Habitación: ${it.nuhabitacion}, Total: \$${it.calcularTotal()}")
            }
        }
    }
}

















