package com.example.myapplication.views

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModel

class MainGuiViewModel : viewModel() {

    private val _contador = MutableLiveData<Int>(0)
    var contador = _contador;

    fun IncrementContador(){
        _contador.value = _contador.value?.plus(1)
    }
}
