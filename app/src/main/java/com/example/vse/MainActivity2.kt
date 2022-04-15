package com.example.vse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.vse.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var yyy : ActivityMain2Binding

    var xx=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        yyy = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(yyy.root)

        xx=intent.getStringExtra(Costi.obsh)!!

        Merc1(Costi.merc1)
        Merc2(Costi.merc2)
        Merc3(Costi.merc3)

        val decor = window.decorView
        val ui =(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
        decor.systemUiVisibility=ui


    }

    private fun Merc1(st: String){
        if (xx==st){
            yyy.apply {
                imageM.setImageResource(R.drawable.merc11)
                izmenitImyaDop.setText(R.string.merc1)
                moshnostOtv.setText(R.string.M1_moshnost_otv)
                obyemOtv.setText(R.string.M1_obyem_otv)
                privodOtv.setText(R.string.M1_privod_otv)
                rasxodOtv.setText(R.string.M1_rasxod_otv)
                godVipuskaOtv.setText(R.string.M1_god_vipuska_otv)
                klirensOtv.setText(R.string.M1_klirens_otv)
                senaOtv.setText(R.string.M1_sena_otv)
            }
        }
    }

    private fun Merc2(st: String){
        if (xx==st){
            yyy.apply {
                imageM.setImageResource(R.drawable.merc22)
                izmenitImyaDop.setText(R.string.merc2)
                moshnostOtv.setText(R.string.M2_moshnost_otv)
                obyemOtv.setText(R.string.M2_obyem_otv)
                privodOtv.setText(R.string.M2_privod_otv)
                rasxodOtv.setText(R.string.M2_rasxod_otv)
                godVipuskaOtv.setText(R.string.M2_god_vipuska_otv)
                klirensOtv.setText(R.string.M2_klirens_otv)
                senaOtv.setText(R.string.M2_sena_otv)
            }
        }
    }

    private fun Merc3(st: String){
        if (xx==st){
            yyy.apply {
                imageM.setImageResource(R.drawable.merc33)
                izmenitImyaDop.setText(R.string.merc3)
                moshnostOtv.setText(R.string.M3_moshnost_otv)
                obyemOtv.setText(R.string.M3_obyem_otv)
                privodOtv.setText(R.string.M3_privod_otv)
                rasxodOtv.setText(R.string.M3_rasxod_otv)
                godVipuskaOtv.setText(R.string.M3_god_vipuska_otv)
                klirensOtv.setText(R.string.M3_klirens_otv)
                senaOtv.setText(R.string.M3_sena_otv)
            }
        }
    }

}

