package edu.udb.taskmanagement.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import edu.udb.taskmanagement.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        supportActionBar?.hide()

        val entrarButton = findViewById<Button>(R.id.Entrarbutton)
        entrarButton.setOnClickListener {
            val intent = Intent(this, TaskListActivity::class.java)
            startActivity(intent)
        }
    }
}