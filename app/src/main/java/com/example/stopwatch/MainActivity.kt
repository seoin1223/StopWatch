package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener {

    // view 초기화
    // lateinit : property를 non-null로 하고 늦은 초기화를 할 때 사용
    private lateinit var btn_start : Button
    private lateinit var btn_refresh : Button
    private lateinit var tv_minute : TextView
    private lateinit var tv_second : TextView
    private lateinit var tv_millisecond : TextView

    private var isRunning = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_start = findViewById(R.id.btn_start)
        btn_refresh = findViewById(R.id.btn_refresh)
        tv_minute = findViewById(R.id.tv_minute)
        tv_second = findViewById(R.id.tv_second)
        tv_millisecond = findViewById(R.id.tv_millisecond)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.btn_start -> {
                if(isRunning){
                    pause()
                }else{
                    start()
                }
            }
            R.id.btn_refresh -> {
                refresh()
            }

        }
    }


    private fun start(){

    }

    private fun pause(){

    }

    private fun refresh(){

    }


}