package dev.jiskelo.kmmnotes.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi

@ExperimentalGlideComposeApi
class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyApplicationTheme {
                ProductsScreen(viewModel = viewModel)
            }
        }
    }
}

