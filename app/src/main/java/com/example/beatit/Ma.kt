package com.example.beatit

class Ma {
    fun funcionSuma(valor1: Double, valor2: Double): Double {
        return valor1 + valor2
    }

    fun funcionResta(valor1: Double, valor2: Double): Double {
        return valor1 - valor2
    }

    fun funcionMultiplicacion(valor1: Double, valor2: Double): Double {
        return valor1 * valor2
    }

    fun funcionDivision(valor1: Double, valor2: Double): Double {
        return if (valor2 != 0.0) {
            valor1 / valor2
        } else {
            Double.NaN
        }
    }

    fun funcionPotencia(valor1: Double, valor2: Double): Double {
        val msj: Double
        msj = if (valor2 == 0.0) {
            1.0
        } else {
            valor1 * funcionPotencia(valor1, valor2 - 1)
        }
        return msj
    }

    fun funcionFactorial(valor1: Double): Double {
        val msj: Double
        msj = if (valor1 == 0.0) {
            return 1.0
        } else {
            valor1 * funcionFactorial(valor1 - 1)
        }
        return msj
    }

    fun funcionSucesion(valor1: Double): Long {
        val msj: Long
        msj = if (valor1 == 0.0) {
            return 0
        } else if (valor1 == 1.0) {
            return 1
        } else {
            funcionSucesion(valor1 - 1) + funcionSucesion(valor1 - 2)
        }
        return msj
    }
}