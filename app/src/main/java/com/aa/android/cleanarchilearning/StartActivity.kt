package com.aa.android.cleanarchilearning

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aa.android.cleanarchilearning.productScene.ProductsActivity

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        startActivity(Intent(this, ProductsActivity::class.java)).apply {
        }
    }
}
