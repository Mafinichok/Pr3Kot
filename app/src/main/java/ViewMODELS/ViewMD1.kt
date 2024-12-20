package ViewMODELS

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewMD1: ViewModel() {
    private val _name = MutableLiveData<String>()
    val name:MutableLiveData<String> = _name

    fun setName(newName: String){
        _name.value = newName
    }
}