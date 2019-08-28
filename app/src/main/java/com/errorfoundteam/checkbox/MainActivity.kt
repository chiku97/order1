package com.errorfoundteam.checkbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var total = 500


            java_500.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked){
                    total = total + 500
            }
                else if (isChangingConfigurations == false)
                {
                    total = total - 500
                }
            }

            html_500.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    total = total + 500
                }
                else if (isChangingConfigurations == false)
                {
                    total = total - 500
                }
            }

            webtech_500.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    total = total + 500
                }
                else if (isChangingConfigurations == false)
                {
                    total = total - 500
                }
            }

            android_500.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    total = total + 500
                }
                else if (isChangingConfigurations == false)
                {
                    total = total - 500
                }
            }


        button.setOnClickListener {

            totttal.text = "Total Fees = ${total}"
        }



    }
}
