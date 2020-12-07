package com.example.financask.extension

fun String.limitaEmAte(caracteres: Int) : String{
    if(this.length > caracteres){
        val primeiroLetra = 0
        return "${this.substring(primeiroLetra, caracteres)}..."
    }
    return this
}