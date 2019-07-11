package com.gl.navapp.first

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.gl.navapp.R
import kotlinx.android.synthetic.main.activity_first.*


class FirstActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        // NOTE: This uses the Koltin Plugin instead the findViewById
        setSupportActionBar(toolbar_first)

        // Get NavHostFragment using the Support Fragment Manager
        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment_first) as NavHostFragment? ?: return

        // Get the Nav Controller
        navController = host.navController

        // Bind Action Bar with Nav Controller
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()
    }
}
