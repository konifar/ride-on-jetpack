package com.kgmyshin.todo.ui.todo.list

import com.kgmyshin.todo.ui.todo.bindingModel.TodoBindingModel

interface OnClickUndoneTodoListener {

    fun onClick(
            bindingModel: TodoBindingModel
    )

}