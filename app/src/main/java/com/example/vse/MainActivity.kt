package com.example.vse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.viewpager.widget.ViewPager
import com.example.vse.databinding.ActivityMainBinding

open class MainActivity : AppCompatActivity()  {

    lateinit var xxx: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        xxx = ActivityMainBinding.inflate(layoutInflater)
        setContentView(xxx.root)

        xxx.mercMain.setOnClickListener { Vision(xxx.linner1111) }
        xxx.bmwMain.setOnClickListener { Vision(xxx.linner2222) }
        xxx.audiMain.setOnClickListener { Vision(xxx.linner3333) }
        //ОТКРЫТЬ ЛАЙАУТЫ

        xxx.merc1Txt.setOnClickListener { Obsh(Costi.merc1) }
        xxx.merc2Txt.setOnClickListener { Obsh(Costi.merc2) }
        xxx.merc3Txt.setOnClickListener { Obsh(Costi.merc3) }
        //ОТКРЫТЬ МЕРСЫ

        xxx.bmw1Txt.setOnClickListener { Obsh(Costi.bmw1) }
        xxx.bmw2Txt.setOnClickListener { Obsh(Costi.bmw2) }
        xxx.bmw3Txt.setOnClickListener { Obsh(Costi.bmw3) }
        //ОТКРЫТЬ БМВ

        xxx.audi1Txt.setOnClickListener { Obsh(Costi.audi1) }
        xxx.audi2Txt.setOnClickListener { Obsh(Costi.audi2) }
        xxx.audi3Txt.setOnClickListener { Obsh(Costi.audi3) }
        //ОТКРЫТЬ АУДИ



        val decor = window.decorView
        val ui =(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
        decor.systemUiVisibility=ui



    }

    private fun Vision(lay: LinearLayout){
            if (lay.visibility == View.GONE) lay.visibility = View.VISIBLE
             else if (lay.visibility == View.VISIBLE) lay.visibility = View.GONE
    }
    private fun Obsh(st:String) {
            var launch = Intent(this,MainActivity2::class.java)
            launch.putExtra(Costi.obsh,st)
            startActivity(launch)
    }
}