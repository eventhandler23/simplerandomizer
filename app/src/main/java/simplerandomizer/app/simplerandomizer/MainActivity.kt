package simplerandomizer.app.simplerandomizer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import simplerandomizer.app.simplerandomizer.extensions.random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupActionButton()
    }

    private fun setupActionButton() {
        btnGenerate.setOnClickListener { generateRandomNumber() }
    }

    private fun generateRandomNumber() {
        val generatedResult = (0..100).random()
        result.text = generatedResult.toString()
    }
}
