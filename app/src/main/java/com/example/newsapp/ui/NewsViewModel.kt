package com.example.newsapp.ui

import androidx.lifecycle.ViewModel
import com.example.newsapp.adapters.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}