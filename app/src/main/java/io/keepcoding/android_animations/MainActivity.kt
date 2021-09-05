package io.keepcoding.android_animations

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.keepcoding.android_animations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var animator: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }

        val playStopAnimationButton = binding.playStopButton.apply {
            setImageDrawable(getDrawable(R.drawable.play_stop));
            animator = drawable as AnimationDrawable
        }

        playStopAnimationButton.setOnClickListener{
            animator.start()
        }

    }

}