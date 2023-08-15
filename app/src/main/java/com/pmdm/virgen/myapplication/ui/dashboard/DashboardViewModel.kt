package com.pmdm.virgen.myapplication.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/*
LiveData<T> es una clase abstracta observable que no posee implementación de los setValue y postValue.
Internamente y como privado, tenemos nuestro atributo de tipo MutableLiveData, pero hacia afuera, tenemos
un liveData para denegar que fuera de la clase, pueda modificarse ya que no implementa setValue y postValue.
 */
class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text  //LiveData<String> es clase abstracta y observable. Lo queremos progeger

    var text1 = MutableLiveData<String>()

    val text2 : LiveData<String> = MutableLiveData<String>().apply {
        value = "santi2"
    }


    init {
        text1.postValue("Santi")
    }


}