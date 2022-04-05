package com.example.vse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vse.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var yyy : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        yyy = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(yyy.root)



        /*val inm =Intent()
        inm.putExtra("nnn",)
        setResult(1,inm)
        finish()*/








    }
}