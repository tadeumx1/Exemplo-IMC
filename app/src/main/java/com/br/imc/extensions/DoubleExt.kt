package com.br.imc.extensions

fun Double.format(digits: Int): String = String.format("%.${digits}f", this)