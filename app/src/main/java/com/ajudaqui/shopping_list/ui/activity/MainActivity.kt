package com.ajudaqui.shopping_list.ui.activity


import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ajudaqui.shopping_list.R
import com.ajudaqui.shopping_list.modelo.Produto
import com.ajudaqui.shopping_list.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {
    override fun onCreate(savedInsaceState: Bundle?) {
        super.onCreate(savedInsaceState)

// A classe R, é a classe que captura todos os idś que são gerados
        setContentView(R.layout.activity_main)
        var recycleView = findViewById<RecyclerView>(R.id.recycleView)
        //recycleView.adapter= ListaProdutosAdapter()
        recycleView.adapter = ListaProdutosAdapter(
            context = this, produtos = listOf(
                Produto(nome = "teste 1", descricao = "tesc desc 1", valor = BigDecimal("16.98")),
                Produto(nome = "teste 2", descricao = "tesc desc 2", valor = BigDecimal("45.98"))
            )
        )
        // essa configuraçãço de exibicao pode ser feita tanto via codigo aqui mesmo, quanto no layout
        recycleView.layoutManager= LinearLayoutManager(this)

    }
}