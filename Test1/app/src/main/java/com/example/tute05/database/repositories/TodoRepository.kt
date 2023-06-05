package com.example.tute05.database.repositories

import com.example.tute05.database.TodoDatabase
import com.example.tute05.database.entities.Todo

class TodoRepository(
    private val db: TodoDatabase
) {
    suspend fun insert(todo: Todo) = db.getTodoDao().insertTodo(todo)
    suspend fun delete(todo: Todo) = db.getTodoDao().delete(todo)
    fun getAllTodos() =db.getTodoDao().getAllUsers()
}