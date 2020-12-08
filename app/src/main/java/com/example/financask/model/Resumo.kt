package com.example.financask.model

import java.math.BigDecimal

class Resumo(private val transacoes: List<Transacao>) {

    fun receita() : BigDecimal{
        val somaDeReceita: Double = transacoes
            .filter { transacao -> transacao.tipo == Tipo.RECEITA }
            .sumByDouble { transacao -> transacao.valor.toDouble() }
        return BigDecimal(somaDeReceita)
    }

    fun despesa() : BigDecimal{
        val somaDeDespesa = transacoes
            .filter { transacao -> transacao.tipo == Tipo.DESPESA }
            .sumByDouble { transacao -> transacao.valor.toDouble() }
        return BigDecimal(somaDeDespesa)
    }

    fun total() : BigDecimal{
        return receita().subtract(despesa())
    }
}