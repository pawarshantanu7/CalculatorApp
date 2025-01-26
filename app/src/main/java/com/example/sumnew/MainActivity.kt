package com.example.sumnew

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var editNum1:EditText
    private lateinit var editNum2:EditText
    private lateinit var textResult:TextView
    private lateinit var buttonAdd:Button
    private lateinit var buttonSub:Button
    private lateinit var buttonMul:Button
    private lateinit var buttonDiv:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        editNum1=findViewById(R.id.editNum1)
        editNum2=findViewById(R.id.editNum2)
        textResult=findViewById(R.id.textResult)
        buttonAdd=findViewById(R.id.buttonAdd)
        buttonSub=findViewById(R.id.buttonSub)
        buttonMul=findViewById(R.id.buttonMul)
        buttonDiv=findViewById(R.id.buttonDiv)

        buttonAdd.setOnClickListener {
            val num1Text=editNum1.text.toString()
            val num2Text=editNum2.text.toString()
            if(num1Text.isNotEmpty() && num2Text.isNotEmpty()){
                val num1=num1Text.toDoubleOrNull()?:0.0
                val num2=num2Text.toDoubleOrNull()?:0.0
                val sum=num1+num2
                textResult.text="Result: $sum"

            }
            else{
                textResult.text="Please enter the valid numbers"
            }
        }
        buttonSub.setOnClickListener {
            val num1Text=editNum1.text.toString()
            val num2Text=editNum2.text.toString()
            if(num1Text.isNotEmpty() && num2Text.isNotEmpty()){
                val num1=num1Text.toDoubleOrNull()?:0.0
                val num2=num2Text.toDoubleOrNull()?:0.0
                val sub=num1-num2
                textResult.text="Result: $sub"

            }
            else{
                textResult.text="Please enter the valid numbers"
            }
        }
        buttonMul.setOnClickListener {
            val num1Text=editNum1.text.toString()
            val num2Text=editNum2.text.toString()
            if(num1Text.isNotEmpty() && num2Text.isNotEmpty()){
                val num1=num1Text.toDoubleOrNull()?:0.0
                val num2=num2Text.toDoubleOrNull()?:0.0
                val mul=num1*num2
                textResult.text="Result: $mul"

            }
            else{
                textResult.text="Please enter the valid numbers"
            }
        }
        buttonDiv.setOnClickListener {
            val num1Text=editNum1.text.toString()
            val num2Text=editNum2.text.toString()
            if(num2Text.toInt()==0){
                textResult.text="The second number should not be zero"
            }
            else{
                if(num1Text.isNotEmpty() && num2Text.isNotEmpty()){
                    val num1=num1Text.toDoubleOrNull()?:0.0
                    val num2=num2Text.toDoubleOrNull()?:0.0
                    val div=num1/num2
                    textResult.text="Result: $div"

                }
                else{
                    textResult.text="Please enter the valid numbers"
                }
            }

        }

    }
}