package com.flooss.demoformavenrepo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flooss.testlibmaven.MainEntryPoint

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainEntryPoint.startingPoint()
    }
}