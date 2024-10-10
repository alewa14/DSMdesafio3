package edu.udb.taskmanagement.network

import android.util.Log
import com.google.gson.GsonBuilder
import edu.udb.taskmanagement.model.Task
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface ApiService {

    companion object {
        private const val BASE_URL = "https://67044e8fab8a8f8927338e44.mockapi.io/api/libreria/"
        val gson = GsonBuilder().setLenient().create() // Habilitar la lectura lenient del JSON

        fun create(): ApiService {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
            Log.d("ApiService", "URL: $BASE_URL")
            return retrofit.create(ApiService::class.java)
        }
    }

    // Endpoint para obtener la lista de tareas
    @GET("Task")
    suspend fun getTasks(): List<Task>

    // Endpoint para obtener una tarea por su ID
    @GET("Task/{id}")
    suspend fun getTask(@Path("id") taskId: Int): Task

    // Endpoint para agregar una nueva tarea
    @POST("Task")
    suspend fun addTask(@Body task: Task): Task

    // Endpoint para eliminar una tarea
    @DELETE("Task/{id}")
    suspend fun deleteTask(@Path("id") taskId: Int)

    // Endpoint para actualizar una tarea
    @PUT("Task/{id}")
    suspend fun updateTask(@Path("id") taskId: Int, @Body task: Task): Task

}
