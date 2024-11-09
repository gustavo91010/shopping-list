package com.ajudaqui.shopping_list.ui.activity


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Identity
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ajudaqui.shopping_list.R
import com.ajudaqui.shopping_list.dao.ProdutosDAO
import com.ajudaqui.shopping_list.modelo.Produto
import com.ajudaqui.shopping_list.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInsaceState: Bundle?) {
        super.onCreate(savedInsaceState)

    }

    override fun onResume() {
        super.onResume()

// A classe R, é a classe que captura todos os idś que são gerados
        var recycleView = findViewById<RecyclerView>(R.id.recycleView)

        recycleView.adapter = ListaProdutosAdapter(
            context = this, produtos = ProdutosDAO().buscaTodos()
//            listOf(
//                Produto(nome = "teste_01", descricao = "desc_01", valor = BigDecimal("19.88")),
//                Produto(nome = "teste_02", descricao = "desc_02", valor = BigDecimal("45.88")),
//                Produto(nome = "teste_03", descricao = "desc_03", valor = BigDecimal("5.88")),
//                Produto(nome = "teste_04", descricao = "desc_04", valor = BigDecimal("55.77"))
//            )
        )
        // eu adicionei o layout do botão la no active main, dentro do ConstraintLayout
        // e to chamando ele aqui
        // coloquei o botão para chamar o FormularioProdutoActivity

        var fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener{
            var identity= Intent(this, FormularioProdutoActivity::class.java)
            startActivity(identity)
        }
    }


}