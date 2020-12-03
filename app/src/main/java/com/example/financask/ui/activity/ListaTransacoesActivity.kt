package com.example.financask.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.financask.R
import com.example.financask.model.Tipo
import com.example.financask.model.Transacao
import com.example.financask.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*

class ListaTransacoesActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes = listOf(Transacao(valor = BigDecimal(20.5),
            tipo = Tipo.DESPESA, data = Calendar.getInstance()),
            Transacao(valor = BigDecimal(100.0), categoria = "Economia", tipo = Tipo.RECEITA)
        )

        lista_transacoes_listview.adapter = (ListaTransacoesAdapter(transacoes, this))

    }
}