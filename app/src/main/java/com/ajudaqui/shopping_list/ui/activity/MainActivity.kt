package com.ajudaqui.shopping_list.ui.activity


import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ajudaqui.shopping_list.R
import com.ajudaqui.shopping_list.modelo.Produto
import com.ajudaqui.shopping_list.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInsaceState: Bundle?) {
        super.onCreate(savedInsaceState)

// A classe R, é a classe que captura todos os idś que são gerados
        var recycleView = findViewById<RecyclerView>(R.id.recycleView)
        recycleView.adapter = ListaProdutosAdapter(
            context = this, produtos = listOf(
                Produto(nome = "teste_01", descricao = "desc_01", valor = BigDecimal("19.88")),
                Produto(nome = "teste_02", descricao = "desc_02", valor = BigDecimal("45.88")),
                Produto(nome = "teste_03", descricao = "desc_03", valor = BigDecimal("5.88")),
                Produto(nome = "teste_04", descricao = "desc_04", valor = BigDecimal("55.77"))
            )
        )
        // para fazer o layout aparecer... ou aqui, ou no layout, active _ main
//        recycleView.layoutManager= LinearLayoutManager(this)
    }
}