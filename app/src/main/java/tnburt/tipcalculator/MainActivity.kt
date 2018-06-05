package tnburt.tipcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.math.RoundingMode
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculateTip(view: View) {

        val subTotalEdit = findViewById(R.id.textInput_total) as EditText
        val percentEdit = findViewById(R.id.textInput_percent) as EditText
        val tipAmountView = findViewById(R.id.text_tip) as TextView
        val totalAmountView = findViewById(R.id.text_total) as TextView

        val subTotal = subTotalEdit.text.toString().toFloat()
        val tipPercent = percentEdit.text.toString().toFloat()

        val tipAmount = subTotal * (tipPercent / 100)
        val totalAmount = subTotal + tipAmount

        tipAmountView.text = tipAmount.toString()
        totalAmountView.text = totalAmount.toString()
    }
}
