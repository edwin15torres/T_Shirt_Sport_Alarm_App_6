package com.uniandes.smartfeedmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ProductRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_register)
    }



    fun goToDashboardActivity(view: View?) {
        val intent_3 = Intent(this, DashboardActivity::class.java)
        startActivity(intent_3)
    }
}