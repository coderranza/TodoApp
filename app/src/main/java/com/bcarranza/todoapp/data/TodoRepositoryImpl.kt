package com.bcarranza.todoapp.data

import kotlinx.coroutines.flow.Flow

class TodoRepositoryImpl(
    private val dao: TodoDao
): TodoRepository {
    override suspend fun inserTodo(todo: Todo) {
        dao.inserTodo(todo)
    }

    override suspend fun deletTodo(todo: Todo) {
        dao.deletTodo(todo)
    }

    override suspend fun getTodoById(id: Int): Todo? {
        return dao.getTodoById(id)
    }

    override fun getTodos(): Flow<List<Todo>> {
        return dao.getTodos()
    }


}