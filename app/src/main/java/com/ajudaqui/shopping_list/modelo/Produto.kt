package com.ajudaqui.shopping_list.modelo

import java.math.BigDecimal

data class Produto (
    val nome: String,
    val descricao: String,
    val valor: BigDecimal
)