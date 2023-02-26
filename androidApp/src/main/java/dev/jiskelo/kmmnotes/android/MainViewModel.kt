package dev.jiskelo.kmmnotes.android

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.jiskelo.kmmnotes.shared.ZooSDK
import dev.jiskelo.kmmnotes.shared.entity.Product
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class MainViewModel :ViewModel() {

    private val sdk = ZooSDK()

    private val _recommended = mutableStateOf(emptyList<Product>())
    val recommended: State<List<Product>> = _recommended

    init {
        viewModelScope.launch(IO){
            _recommended.value = sdk.getRecommended(false).data.products
        }
    }
}