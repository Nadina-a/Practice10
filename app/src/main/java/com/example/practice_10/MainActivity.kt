package com.example.practice_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tablelayout)
        setTitle("TableLayout")
           /*  setContentView(R.layout.activity_main)
           /
           setContentView(R.layout.linerlayout)
           setTitle("LinerLayout")*/


    }
fun Click(view: View){
    val orient = findViewById<TextView>(R.id.textView1)
val gravity = findViewById<TextView>(R.id.textView2)
    val button = view as Button
    when(button.id){
        R.id.button1-> orient.text = "Вертикальная"
        R.id.button2-> gravity.text = "По левой границе"
        R.id.button3-> orient.text = "Горизонтальная"
        R.id.button4-> gravity.text = "По центру"
        R.id.button5-> orient.text = "Вертикальная"
        R.id.button6-> gravity.text = "По правой границе"

    }
}
    /*var info: Boolean = true
    fun Click(view: View){
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        if (info == true) {
            button1.visibility = View.INVISIBLE
            button2.visibility = View.VISIBLE
            info = false
        }
        else {
            button1.visibility = View.VISIBLE
            button2.visibility = View.INVISIBLE
            info = true
        }
    }*/
}