package com.marcr.aplicaciologinbdmarcrubio

class PersonaProvider {
    companion object {

        private var currentIndex = 0

        fun next(): PersonaModel {
            val currentPerson = quotes[currentIndex]
            currentIndex = (currentIndex + 1) % quotes.size
            return currentPerson
        }

        private val quotes = listOf(
            PersonaModel(
                nom= "Marc",
                edat = 19,
                correu = "marc@gmail.com"
            ),
            PersonaModel(
                nom= "Dani",
                edat = 13,
                correu = "dani@gmail.com"
            ),
            PersonaModel(
                nom= "Gerard",
                edat = 20,
                correu = "gerard@gmail.com"
            ),
            PersonaModel(
                nom= "Santi",
                edat = 32,
                correu = "santi@gmail.com"
            ),
            PersonaModel(
                nom= "Pepe",
                edat = 16,
                correu = "pepe@gmail.com"
            ),
            PersonaModel(
                nom= "carlos",
                edat = 22,
                correu = "calos@gmail.com"
            ),
        )
    }
}