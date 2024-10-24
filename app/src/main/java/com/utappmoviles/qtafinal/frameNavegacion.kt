package com.utappmoviles.qtafinal

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.utappmoviles.qtafinal.databinding.ActivityNavegacionBinding
class frameNavegacion : AppCompatActivity() {

    private lateinit var binding: ActivityNavegacionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityNavegacionBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        replaceFragment(Dos_palabras())
        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){
                R.id.dosmitades -> replaceFragment(Dos_mitades())
                R.id.dospalabras -> replaceFragment(Dos_palabras())
                R.id.quitar_fragmentos -> replaceFragment(Quitar_fragmentos())

                else ->{

                }
            }
            true
        }

    }
    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransition = fragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.frame_layout,fragment)
        fragmentTransition.commit()
    }
}