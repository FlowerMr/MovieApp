package com.example.movieapp.ViewModel

import FilmItemModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.movieapp.Repository.MainRepository
import kotlinx.coroutines.MainScope

class MainViewModel:ViewModel() {

    private val repository= MainRepository()
    fun loadUpcoming():LiveData<MutableList<FilmItemModel>>{
        return repository.loadUpcoming()
    }
    fun loadItems():LiveData<MutableList<FilmItemModel>>{
        return repository.loadItems()
    }
}