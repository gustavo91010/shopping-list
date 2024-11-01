package com.ajudaqui.shopping_list.ui.recyclerview.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ajudaqui.shopping_list.modelo.Produto

class ListaProdutosAdapter (
    private val produtos: List<Produto>
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {

        return produtos.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        // o metodo que vai indicar qual o item, a position e qual o rodem que esta com a view especifica

        TODO("Not yet implemented")
    }

}
