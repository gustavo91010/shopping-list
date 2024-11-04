package com.ajudaqui.shopping_list.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ajudaqui.shopping_list.R
import com.ajudaqui.shopping_list.modelo.Produto

class ListaProdutosAdapter (
    private val produtos: List<Produto>,
    private val context: Context,
): RecyclerView.Adapter<ListaProdutosAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val inflater= LayoutInflater.from(context)
        val view= inflater.inflate(R.layout.produto_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {

        return produtos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // o metodo que vai indicar qual o item, a position e qual o rodem que esta com a view especifica

        val produto = produtos[position]
    holder.vincular(produto)

    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun vincular(produto: Produto) {
            val name = itemView.findViewById<TextView>(R.id.name)
            name.text= produto.nome
            itemView.findViewById<TextView>(R.id.descricao).text= produto.descricao
            itemView.findViewById<TextView>(R.id.valor).text= produto.valor.toPlainString()

        }
    }
}
