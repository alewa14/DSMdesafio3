package edu.udb.taskmanagement.model

import java.util.Date

data class Task(
    val id: Int,              // Identificador único de la tarea
    val title: String,          // Título del recurso
    val description: String,    // Descripción del recurso
    val dueDate: String,        // Fecha de vencimiento de la tarea
    val priority: String,        // Prioridad de la tarea (por ejemplo, 1 para alta, 2 para media, 3 para baja)
    val image: String
)