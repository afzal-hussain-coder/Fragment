package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var isFragmentLoaded=true
    val manager=supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showFragmentOne()
        btnSwichFragment.setOnClickListener {
        if (isFragmentLoaded)
            showFragmentTwo()
            else
            showFragmentOne()
        }
    }

    fun showFragmentOne(){
        val transition=manager.beginTransaction()
        val fragmentOne=FragmentOne()
        transition.replace(R.id.fragmentHolder,fragmentOne)
        transition.addToBackStack(null)
        transition.commit()
        isFragmentLoaded=true
    }
    fun showFragmentTwo(){
        val transition=manager.beginTransaction()
        val fragmentOne=FragmentTwo()
        transition.replace(R.id.fragmentHolder,fragmentOne)
        transition.addToBackStack(null)
        transition.commit()
        isFragmentLoaded=false
    }
}