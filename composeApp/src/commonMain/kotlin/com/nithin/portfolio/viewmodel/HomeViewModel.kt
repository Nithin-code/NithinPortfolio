package com.nithin.portfolio.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nithin.portfolio.model.HomeData
import com.nithin.portfolio.model.RequestState
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {


    var uiState : RequestState<HomeData> by mutableStateOf(RequestState.Loading)


    init {
        viewModelScope.launch {
            delay(1000)
            uiState = RequestState.Success(HomeData())
        }

    }

}