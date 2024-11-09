package com.ajudaqui.shopping_list.ui.activity


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.ajudaqui.shopping_list.R
import com.ajudaqui.shopping_list.dao.ProdutosDAO
import com.ajudaqui.shopping_list.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaProdutoActivty : AppCompatActivity(R.layout.activity_lista_produto) {

    private val adapter= ListaProdutosAdapter(
        context = this, produtos = ProdutosDAO().buscaTodos()
    )
    override fun onCreate(savedInsaceState: Bundle?) {
        super.onCreate(savedInsaceState)
        configura_reciclye_view()

    }

    // depois ve em qual parce do ciclo da vida do view isso se enquadra...
    override fun onResume() {
        super.onResume()
adapter.atualiza_itens(ProdutosDAO().buscaTodos())

        configura_fab()
    }

    private fun configura_fab() {
        var fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            var identity = Intent(this, FormularioProdutoActivity::class.java)
            startActivity(identity)
        }
    }

    private fun configura_reciclye_view() {
        var recycleView = findViewById<RecyclerView>(R.id.recycleView)

        recycleView.adapter = adapter
    }


}