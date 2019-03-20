package com.example.myfirstkotlinapp

class PersonK(              // data class PersonK(     <- data ermöglicht copy, equals und hash-code
    var vName: String,
    var nName: String,
    var strasse: String,
    var ort: String,
    var plz: String,
    var hnr: Int,
    var alter: Int,
    var isMitarbeiter: Boolean
) {


}