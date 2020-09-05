package com.Javali.calculadordeimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Slide
import android.widget.ArrayAdapter
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Criando valores da seekBar

        seekAltura.max = 250

        seekAltura.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                txvAltura.text = "" + progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                txvAltura.text = "" + seekBar.progress
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                txvAltura.text = "" + seekBar.progress
            }
        })


        var listaSexo = arrayListOf<String>()
        listaSexo.add("Sexo")
        listaSexo.add("Maculino")
        listaSexo.add("Feminino")

        val adaptadorSexo = ArrayAdapter(
            this@MainActivity,
            android.R.layout.simple_spinner_dropdown_item, listaSexo
        )
        spnSexo.adapter = adaptadorSexo


    }
}



