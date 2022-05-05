package com.example.automotivelist.ui.gallery

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.automotivelist.R
import com.example.automotivelist.model.GalleryDataModel

class GalleryViewModel : ViewModel() {

    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image
    private val _merek = MutableLiveData<String>()
    val merek: LiveData<String> = _merek
    private val _type = MutableLiveData<String>()
    val type: LiveData<String> = _type

    fun loadData(): List<GalleryDataModel>{
        return listOf(
            GalleryDataModel(
                R.string.type1,
                R.string.merek1,
                R.drawable.mobil_coupe
            ),

            GalleryDataModel(
                R.string.type2,
                R.string.merek2,
                R.drawable.mobil_covertible
            ),

            GalleryDataModel(
                R.string.type3,
                R.string.merek3,
                R.drawable.mobil_double_cabin
            ),

            GalleryDataModel(
                R.string.type4,
                R.string.merek4,
                R.drawable.mobil_hatcback
            ),

            GalleryDataModel(
                R.string.type5,
                R.string.merek5,
                R.drawable.mobil_mvp
            ),

            GalleryDataModel(
                R.string.type6,
                R.string.merek6,
                R.drawable.mobil_offroad
            ),

            GalleryDataModel(
                R.string.type7,
                R.string.merek7,
                R.drawable.mobil_offroad1
            ),

            GalleryDataModel(
                R.string.type8,
                R.string.merek8,
                R.drawable.mobil_sedan
            ),

            GalleryDataModel(
                R.string.type9,
                R.string.merek9,
                R.drawable.mobil_sport
            ),

            GalleryDataModel(
                R.string.type10,
                R.string.merek10,
                R.drawable.mobil_station_wagon
            ),
            GalleryDataModel(
                R.string.type11,
                R.string.merek11,
                R.drawable.mobil_suv

            )

        )
    }
    fun setData(data: GalleryDataModel, context: Context){
        _image.value = data.ImageResId
        _merek.value = context.getString(data.MerekResId)
        _type.value = context.getString(data.MerekResId)
    }
}