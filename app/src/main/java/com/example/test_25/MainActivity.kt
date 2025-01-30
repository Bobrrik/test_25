package com.example.test_25

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.test_25.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val tag = "fragment_1"
        supportFragmentManager
            .beginTransaction()
            .add(binding.fragmentContainer.id,BlankFragment(),tag)
            .addToBackStack(null)
            .commit()

    }
    fun passData(editext : String) {
        val bundle= Bundle()
        bundle.putString("imput",editext)

        val frag2 =BlankFragment2()
        frag2.arguments = bundle

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, frag2)
            .addToBackStack(null)
            .commit()
    }
}