package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {

    // Как и в прошлый раз, инициализируем переменные с нашими Views:
    private val etInitialValue by lazy { findViewById<EditText>(R.id.etInitialValue) }
    private val bInvert by lazy { findViewById<Button>(R.id.bInvert) }
    private val tvInvertedValue by lazy { findViewById<TextView>(R.id.tvInvertedValue) }

    // Обьявляем целочисленную переменную, которая будет хранить инвертированное значение
    private var invertedValue: Int? = null

    // Из функции onCreate вызываем функцию initUI()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()

        // TODO: ViewModel
//        observeLiveData()
    }

    // TODO: Bundle
    // Этот метод вызывается, когда нужно сохранить состояние View
//    override fun onSaveInstanceState(outState: Bundle) {
//        // Состояние сохраняется в обьект типа Bundle
//
//        // Добавим конструкцию ?.let{}, которая позволит вызвать лямбду
//        // с не-null параметром "it"
//        invertedValue?.let {
//            // Записываем наше значение в outState по строковому ключу
//           outState.putInt("SAVED STATE", it)
//       }
//
//       super.onSaveInstanceState(outState)
//   }
//
    // Этот метод вызывается, когда нужно восстановить состояние View
//   override fun onRestoreInstanceState(savedInstanceState: Bundle) {
//       super.onRestoreInstanceState(savedInstanceState)
//
//       // Обновляем значение нашей переменной из savedInstanceState по строковому ключу
//       invertedValue = savedInstanceState.getInt("SAVED STATE")
//
//       // Вызываем функцию для отображения нашего значения
//       setInvertedValueText()
//   }

    // TODO: ViewModel
//    // Обьявляем нашу ViewModel при помощи делегата by viewModels
//    private val viewModel: MainViewModel by viewModels()
//
//    // Этот метод инициализирует observe обьета live data, который хранит наше значение
//    private fun observeLiveData() {
//        // Чтобы наблюдать зачение обьекта live data, вызовем метод observe
//        // и передадим в аргументы this и Observer
//        // Observer имеет лямбду, которая и будет вызываться с новым значением
//        viewModel.invertedValueLiveData.observe(this, Observer {
//            // Обновляем значение нашей переменной
//            invertedValue = it
//
//            // Вызываем функцию для отображения нашего значения
//            setInvertedValueText()
//        })
//    }

    private fun initUI() {
        // Устанавливаем слушатель нажатия на кнопку
        bInvert.setOnClickListener {
            // Получаем нашу строку, конвертируем в целое число и умножаем на -1
            invertedValue = etInitialValue.text.toString().toIntOrNull()?.times(-1)

            // Вызываем функцию для отображения нашего значения
            setInvertedValueText()

            // TODO: ViewModel
//            viewModel.invertedValueLiveData.value = invertedValue
        }
    }

    private fun setInvertedValueText() {
        invertedValue?.toString()?.let {
            tvInvertedValue.text = it
        }
    }
}
