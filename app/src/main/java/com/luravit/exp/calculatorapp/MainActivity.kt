package com.luravit.exp.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    lateinit var eTextNum : EditText
    var num1 : Float = 0.0f
    var isPlus : Boolean = false
    var isMinus : Boolean = false
    var isDel : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        eTextNum = findViewById(R.id.number_edit_text)
    }
        fun operationFunction(view: View) {
            when(view.id) {
            R.id.btn_one -> {
                val number = eTextNum.text.toString() + "1"
                eTextNum.setText(number)

            }
                R.id.btn_two -> {
                val number = eTextNum.text.toString() + "2"
                eTextNum.setText(number)

            }R.id.btn_three -> {
                val number = eTextNum.text.toString() + "3"
                eTextNum.setText(number)

            }     R.id.btn_four -> {
                val number = eTextNum.text.toString() + "4"
                eTextNum.setText(number)

            }     R.id.btn_five -> {
                val number = eTextNum.text.toString() + "5"
                eTextNum.setText(number)

            }     R.id.btn_six -> {
                val number = eTextNum.text.toString() + "6"
                eTextNum.setText(number)

            }     R.id.btn_seven -> {
                val number = eTextNum.text.toString() + "7"
                eTextNum.setText(number)

            }     R.id.btn_eight -> {
                val number = eTextNum.text.toString() + "8"
                eTextNum.setText(number)

            }     R.id.btn_nine -> {
                val number = eTextNum.text.toString() + "9"
                eTextNum.setText(number)

            }     R.id.btn_zero -> {
                val number = eTextNum.text.toString() + "0"
                eTextNum.setText(number)

            }     R.id.btn_dot -> {
                val number = eTextNum.text.toString() + "."
                eTextNum.setText(number)

            }
                R.id.btn_c -> {
                    eTextNum.setText("")
                }
                R.id.btn_plus -> {
                    num1 = eTextNum.text.toString().toFloat()
                    eTextNum.setText("")
                    isPlus = true
                }
                R.id.btn_minus -> {
                    num1 = eTextNum.text.toString().toFloat()
                    eTextNum.setText("")
                    isMinus = true
                }
                R.id.btn_del -> {
                        num1 = eTextNum.text.toString().toFloat()
                    eTextNum.setText("")
                    isDel = true
                }
                R.id.btn_equal -> {
                    val num2 = eTextNum.text.toString().toFloat()
                    var result : Float = 0.0f
                    if (isPlus) {
                         result = num1 + num2
                    }
                    else if (isMinus) {
                         result = num1 - num2
                    }
                    else if (isDel) {
                         result = num1 / num2
                    }
                    isPlus = false
                    isDel = false
                    isMinus = false
                    eTextNum.setText(result.toString())
                }


        }
    }
}