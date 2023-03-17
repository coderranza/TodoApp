package com.bcarranza.todoapp.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodoViewModel: ViewModel()
{
    private val _todolist = MutableLiveData<MutableList<Item>>()
    val todoList: LiveData<MutableList<Item>>
        get() = _todolist

    init
    {
        _todolist.value = mutableListOf()
    }

    fun addItem(item: Item)
    {
        val list = _todolist.value
        list?.add(item)
        _todolist.value = list
    }

    fun removeItem(item: Item)
    {
        val list = _todolist.value
        list?.remove(item)
        _todolist.value = list
    }

    fun updateItem(item: Item)
    {
        val list = _todolist.value
        val index = list?.indexOfFirst { it.id == item.id }
        if (index != null && index >= 0)
        {
            list[index] = item
            _todolist.value = list
        }
    }
}