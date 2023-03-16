package com.uniandes.smartfeedmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }

    fun goToProductRegisterActivity(view: View?) {
        val intent = Intent(this, ProductRegisterActivity::class.java)
        startActivity(intent)
    }

    fun goToAlimentadorRegisterActivity(view: View?) {
        val intent_2 = Intent(this, AlimentadorRegisterActivity::class.java)
        startActivity(intent_2)
    }

    fun goToMainActivity(view: View?) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun goToRegisterActivity(view: View?) {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }



}
