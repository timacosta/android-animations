package io.keepcoding.android_animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.keepcoding.android_animations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }

    }
}