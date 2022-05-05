package com.example.automotivelist.ui.home

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.automotivelist.R
import com.example.automotivelist.model.HomeDataModel
import com.example.automotivelist.model.OliDataModel


class HomeViewModel : ViewModel() {
    private val _imagehome = MutableLiveData<Int>()
    val imagehome: LiveData<Int> = _imagehome
    private val _judulhome = MutableLiveData<String>()
    val judulhome: LiveData<String> = _judulhome
    private val _deschome = MutableLiveData<String>()
    val deschome: LiveData<String> = _deschome


    fun loadData(): List<HomeDataModel>{
        return listOf(
            HomeDataModel(
                R.drawable.logo1,
                R.string.logo1,
                R.string.dlogo1
            ),
            HomeDataModel(
                R.drawable.logo2,
                R.string.logo2,
                R.string.dlogo2
            ),
            HomeDataModel(
                R.drawable.logo3,
                R.string.logo3,
                R.string.dlogo3
            ),
            HomeDataModel(
                R.drawable.logo4,
                R.string.logo4,
                R.string.dlogo4
            ),
            HomeDataModel(
                R.drawable.logo5,
                R.string.logo5,
                R.string.dlogo5
            )
        )
    }

    fun setData(data: HomeDataModel, context: Context){
        _imagehome.value = data.HomeImageResourceId
        _judulhome.value = context.getString(data.HomenameResourceId)
        _deschome.value = context.getString(data.HomedescResourceId)
    }
}