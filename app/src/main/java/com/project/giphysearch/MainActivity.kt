package com.project.giphysearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dushane.giphysearch.R
import com.project.giphysearch.ui.FragmentMain
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, FragmentMain())
            .commit()
    }
}