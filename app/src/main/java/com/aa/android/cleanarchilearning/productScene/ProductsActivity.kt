package com.aa.android.cleanarchilearning.productScene

import android.os.Bundle
import com.aa.android.cleanarchilearning.BaseActivity
import com.aa.android.cleanarchilearning.R
import kotlinx.android.synthetic.main.activity_main.*

class ProductsActivity : BaseActivity(), ProductsViewInput {

    var presenter: ProductsViewOutput? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_click_me.setOnClickListener { presenter?.productButtonPressed() }
    }

    override fun updateProductName(name: String) {
        tv_content.text = name
    }

    override fun makeScene() {
        super.makeScene()
        ProductSceneConfigurator.makeScene(this)
    }
}
