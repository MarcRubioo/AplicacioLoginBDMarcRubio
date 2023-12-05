package com.marcr.aplicaciologinbdmarcrubio
import androidx.lifecycle.ViewModel

class Frg2ViewModel : ViewModel() {

    private var _nom = ""
    val nom: String
        get() = _nom

    private var _edat= 0
    val edat: Int
        get() = _edat

    private var _correu = ""
    val correu: String
        get() = _correu

    fun next() {
        val currentPerson = PersonaProvider.next()
        _nom=currentPerson.nom
        _edat=currentPerson.edat
        _correu=currentPerson.correu
    }
}