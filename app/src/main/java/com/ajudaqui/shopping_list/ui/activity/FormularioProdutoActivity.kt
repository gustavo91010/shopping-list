package com.ajudaqui.shopping_list.ui.activity

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.ajudaqui.shopping_list.R
import com.ajudaqui.shopping_list.dao.ProdutosDAO
import com.ajudaqui.shopping_list.modelo.Produto
import java.math.BigDecimal

class FormularioProdutoActivity : AppCompatActivity(R.layout.activity_formulario_produto) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val botaoSalvar = findViewById<Button>(R.id.botao_salvar)
        botaoSalvar.setOnClickListener {
            val nome = findViewById<EditText>(R.id.nome).text.toString()
            val descricao = findViewById<EditText>(R.id.descricao).text.toString()
            var valor = findViewById<EditText>(R.id.valor).text.toString()
            if (valor.isBlank()) {
                valor = "0"
            }
            val produto = Produto(
                nome = nome,
                descricao = descricao,
                valor = BigDecimal(valor)
            )

            val produtoDao = ProdutosDAO()

            produtoDao.adciona(produto)
            Log.i("FormularioProduto", "tamanho: ${produtoDao.buscaTodos()?.size}")
            Log.i("FormularioProduto", "onCreate: ${produtoDao.buscaTodos()}")
            finish()
        }

    }
}

