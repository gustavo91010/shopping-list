package com.ajudaqui.shopping_list.ui.activity


import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.ajudaqui.shopping_list.R
import com.ajudaqui.shopping_list.ui.recyclerview.adapter.ListaProdutosAdapter

class MainActivity : Activity() {
    override fun onCreate(savedInsaceState: Bundle?) {
        super.onCreate(savedInsaceState)

// A classe R, é a classe que captura todos os idś que são gerados
        setContentView(R.layout.activity_main)
        var recycleView = findViewById<RecyclerView>(R.id.recycleView)
        recycleView.adapter= ListaProdutosAdapter()

    }
}