package com.example.jetpackcompose.pagination

interface Paginator<key, Item> {
    suspend fun loadNextItems()
    fun reset()
}