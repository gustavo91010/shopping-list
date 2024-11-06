package com.ajudaqui.shopping_list.ui.activity

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.ajudaqui.shopping_list.R

class FormularioProdutoActivity : AppCompatActivity(R.layout.activity_formulario_produto) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val botaoSalvar = findViewById<Button>(R.id.botao_salvar)
        botaoSalvar.setOnClickListener {
            val nameField = findViewById<EditText>(R.id.nome)
            val nome = nameField.text.toString()
            Log.i("FormularioProduto", "onCreate: $nome")
                    }

    }
}

