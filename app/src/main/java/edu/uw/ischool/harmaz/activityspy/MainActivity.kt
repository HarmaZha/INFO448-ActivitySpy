package edu.uw.ischool.harmaz.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "onStart event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "onResume event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag, "onPause event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag, "onStop event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "onDestroy event fired")
        Log.e(tag, "'They won't fear it until they understand it, and they won't understand it" +
                "until they've used it' - J. Robert Oppenheimer - Oppenheimer")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(tag, "onRestart event fired")
    }
}