package com.example.whatdoyouneed

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatdoyouneed.databinding.ActivityMainBinding
import com.example.whatdoyouneed.ui.services.Service
import com.example.whatdoyouneed.ui.services.ServicesAdapter
import com.example.whatdoyouneed.ui.services.ServicesFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    //lateinit var rv: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //setContentView(R.layout.activity_main)
        //val f1=ServicesFragment()
        //rv= findViewById(R.id.rec_view)
        //rv.layoutManager = LinearLayoutManager(this)
        //val service: ArrayList<Service> = Arraylist<Service>()
        //rv.adapter=ServicesAdapter()


        val navView: BottomNavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_home, R.id.navigation_services, R.id.navigation_settings))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}