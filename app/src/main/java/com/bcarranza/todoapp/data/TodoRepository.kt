package com.bcarranza.todoapp.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface TodoRepository {

    suspend fun inserTodo(todo: Todo)

    suspend fun deletTodo(todo: Todo)

    suspend fun getTodoById(id: Int): Todo?

    fun getTodos(): Flow<List<Todo>>
}