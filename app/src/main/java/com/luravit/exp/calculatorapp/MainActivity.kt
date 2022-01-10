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
                numberClicked(1)

            }
                R.id.btn_two -> {
                    numberClicked(2)

            }R.id.btn_three -> {
                numberClicked(3)

            }     R.id.btn_four -> {
                numberClicked(4)

            }     R.id.btn_five -> {
                numberClicked(5)

            }     R.id.btn_six -> {
                numberClicked(6)

            }     R.id.btn_seven -> {
                numberClicked(7)

            }     R.id.btn_eight -> {
                numberClicked(8)

            }     R.id.btn_nine -> {
                numberClicked(9)

            }     R.id.btn_zero -> {
                numberClicked(0)

            }     R.id.btn_dot -> {
               dotClicked()

            }
                R.id.btn_c -> {
                   clearClicked()
                }
                R.id.btn_plus -> {
                   plusClicked()
                }
                R.id.btn_minus -> {
                    minusClicked()
                }
                R.id.btn_del -> {
                    delClicked()
                }
                R.id.btn_equal -> {
                    equalClicked()
                }

        }
    }
    fun numberClicked(numberClicked : Int) {
        val number = eTextNum.text.toString() + numberClicked
        eTextNum.setText(number)
    }
    fun dotClicked() {
        val number = eTextNum.text.toString() + "."
        eTextNum.setText(number)
    }
    fun plusClicked() {
        num1 = eTextNum.text.toString().toFloat()
        eTextNum.setText("")
        isPlus = true
    }
    fun minusClicked() {
        num1 = eTextNum.text.toString().toFloat()
        eTextNum.setText("")
        isMinus = true
    }
    fun delClicked() {
        num1 = eTextNum.text.toString().toFloat()
        eTextNum.setText("")
        isDel = true
    }
    fun clearClicked() {
        eTextNum.setText("")
    }
    fun equalClicked() {


        when  {
            isPlus -> {
                plus()
            }

        isMinus -> {
            minus()
        }
        isDel ->  {
            del()
        }
    }



    }

    fun plus() {
        val num2 = eTextNum.text.toString().toFloat()
        val result = num1 + num2
        isPlus = false
        eTextNum.setText(result.toString())
    }
    fun minus() {
        val num2 = eTextNum.text.toString().toFloat()
        val result = num1 - num2
        isMinus = false
        eTextNum.setText(result.toString())
    }
    fun del() {
        val num2 = eTextNum.text.toString().toFloat()
        val result = num1 / num2
        isDel = false
        eTextNum.setText(result.toString())
    }
}