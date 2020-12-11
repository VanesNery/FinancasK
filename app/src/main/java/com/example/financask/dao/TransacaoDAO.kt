package com.example.financask.dao

import com.example.financask.model.Transacao

class TransacaoDAO {

    val transacoes: MutableList<Transacao> = mutableListOf()

    fun adiciona(transacao: Transacao){
        transacoes.add(transacao)
    }

    fun altera(transacao: Transacao, posicao: Int){
        transacoes[posicao] = transacao
    }

    fun remove(posicao: Int){
        transacoes.removeAt(posicao)
    }
}