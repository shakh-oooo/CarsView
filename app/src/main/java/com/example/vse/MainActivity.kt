package com.example.vse

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.vse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()  {

    /*private var launch : ActivityResultLauncher<Intent>? = null*/

    lateinit var xxx: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        xxx = ActivityMainBinding.inflate(layoutInflater)
        setContentView(xxx.root)

        /*launch = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        if(it.resultCode == 1){
            val xx =it.data?.getStringExtra("nnn")
        }
        }
        xxx.dochImg1111.setOnClickListener {
            launch?.launch(Intent(this,MainActivity2::class.java))
        }*/


        XXX()


       /* xxx.img1111.setOnClickListener {
            if (xxx.linner1111.visibility == View.GONE) {
                xxx.linner1111.visibility = View.VISIBLE
            } else if (xxx.linner1111.visibility == View.VISIBLE) {
                xxx.linner1111.visibility = View.GONE
            }
        }*/






        /* xxx.imageView.setOnClickListener{
             when(xxx.linner1.visibility){
                View.GONE -> View.VISIBLE
                View.VISIBLE -> View.GONE
             }
         }*/

    }

    private fun XXX(){
        xxx.img1111.setOnClickListener {
            if (xxx.linner1111.visibility == View.GONE) {
                xxx.linner1111.visibility = View.VISIBLE
            } else if (xxx.linner1111.visibility == View.VISIBLE) {
                xxx.linner1111.visibility = View.GONE
            }
        }
        xxx.img2222.setOnClickListener {
            if (xxx.linner2222.visibility == View.GONE) {
                xxx.linner2222.visibility = View.VISIBLE
            } else if (xxx.linner2222.visibility == View.VISIBLE) {
                xxx.linner2222.visibility = View.GONE
            }
        }
        xxx.img3333.setOnClickListener {
            if (xxx.linner3333.visibility == View.GONE) {
                xxx.linner3333.visibility = View.VISIBLE
            } else if (xxx.linner3333.visibility == View.VISIBLE) {
                xxx.linner3333.visibility = View.GONE
            }
        }


    }
     fun YYY(view: View){
        val Inn =Intent(this,MainActivity2::class.java)
        startActivity(Inn)
    }




}