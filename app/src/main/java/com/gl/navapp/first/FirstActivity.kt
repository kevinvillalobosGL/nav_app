package com.gl.navapp.first

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.postDelayed
import com.gl.navapp.R
import com.gl.navapp.main.MainActivity
import kotlinx.android.synthetic.main.activity_splash.*


class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Delay
        img_splash.postDelayed(500) {
            val context = this
            val newIntent = if (intent.data != null) {
                // Clone Intent to send Deeplink Data
                Intent(intent).apply {
                    setClass(context, MainActivity::class.java)
                }
            } else {
                Intent(context, MainActivity::class.java)
            }
            startActivity(newIntent)
            finish()
        }
    }
}
