package com.example.automotivelist.ui.oli

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.automotivelist.R
import com.example.automotivelist.model.OliDataModel

class OliViewModel : ViewModel() {
    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    private val _title = MutableLiveData<String>()
    val title: LiveData<String> = _title

    private val _desc = MutableLiveData<String>()
    val desc: LiveData<String> = _desc

    fun LoadData(): List<OliDataModel>
    {
        return listOf(
            OliDataModel(
                R.drawable.oli1,
                R.string.judulN1,
                R.string.isiN1
            ),
            OliDataModel(
                R.drawable.oli2,
                R.string.judulN2,
                R.string.isiN2
            ),
            OliDataModel(
                R.drawable.oli3,
                R.string.judulN3,
                R.string.isiN3
            ),
            OliDataModel(
                R.drawable.oli4,
                R.string.judulN4,
                R.string.isiN4
            ),
            OliDataModel(
                R.drawable.oli5,
                R.string.judulN5,
                R.string.isiN5
            ),
            OliDataModel(
                R.drawable.oli6,
                R.string.judulN6,
                R.string.isiN6
            )
        )
    }

    fun setData(data: OliDataModel, context: Context)
    {
        _image.value = data.imageResourceId
        _title.value = context.getString(data.titleResourceId)
        _desc.value = context.getString(data.descResourceId)
    }
}