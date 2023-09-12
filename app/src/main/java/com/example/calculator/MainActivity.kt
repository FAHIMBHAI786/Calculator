package com.example.calculator

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bind: ActivityMainBinding
    var data = String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = DataBindingUtil.setContentView(this, R.layout.activity_main)

        bind.apply {
            run {
                btn1.setOnClickListener() {
                    input.append("1")
                }

                btn2.setOnClickListener() {
                    input.append("2")
                }

                btn3.setOnClickListener() {
                    input.append("3")
                }


                btn4.setOnClickListener() {
                    input.append("4")
                }
                btn5.setOnClickListener() {
                    input.append("5")
                }
                btn6.setOnClickListener() {
                    input.append("6")
                }
                btn7.setOnClickListener() {
                    input.append("7")
                }
                btn8.setOnClickListener() {
                    input.append("8")
                }
                btn9.setOnClickListener() {
                    input.append("9")
                }
                btn0.setOnClickListener() {
                    input.append("0")
                }
                btndot.setOnClickListener() {
                    input.append(".")
                }
                btnplus.setOnClickListener() {
                    input.append("+")
                }
                btnminus.setOnClickListener() {
                    input.append("-")
                }

                btndiv.setOnClickListener() {
                    input.append("/")
                }

                btnmultiply.setOnClickListener() {
                    input.append("*")
                }

                btnequals.setOnClickListener() {
                    input.append("=")

                }
            }

        }
    }
}