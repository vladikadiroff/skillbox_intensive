package ru.vladikadiroff.skillboxintensive.ui.activities

import androidx.navigation.findNavController
import dagger.android.support.DaggerAppCompatActivity
import ru.vladikadiroff.skillboxintensive.R

class MainActivity : DaggerAppCompatActivity(R.layout.activity_main) {

    override fun onSupportNavigateUp() = findNavController(R.id.navHost).navigateUp()

}