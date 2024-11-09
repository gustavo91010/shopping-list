package com.ajudaqui.shopping_list.dao

import com.ajudaqui.shopping_list.modelo.Produto

class ProdutosDAO {

    fun adciona(produto: Produto) {
        produtos.add(produto)
    }

    fun buscaTodos(): List<Produto> {

        return produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>()
    }
}