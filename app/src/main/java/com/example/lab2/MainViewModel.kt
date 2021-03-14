package com.example.lab2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// Создайте класс MainViewModel, унаследовав его от ViewModel
class MainViewModel : ViewModel() {

    // Обьявите переменную типа MutableLiveData с параметром типа, который вы хотите сохранять
    // в нашем случае это Int? - целочисленная nullable
    val invertedValueLiveData = MutableLiveData<Int?>()
}
