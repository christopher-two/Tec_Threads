package org.christophertwo.tec.threads

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import org.christophertwo.tec.threads.core.ui.AppTheme
import org.christophertwo.tec.threads.feature.home.presentation.HomeRoot

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                HomeRoot()
            }
        }
    }
}