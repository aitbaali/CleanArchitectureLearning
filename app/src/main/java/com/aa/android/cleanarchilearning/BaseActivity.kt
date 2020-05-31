package com.aa.android.cleanarchilearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

interface ISceneCreator {
    fun makeScene()
}

abstract class BaseActivity : AppCompatActivity() , ISceneCreator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        makeScene()
    }

    override fun makeScene() {
    }
}