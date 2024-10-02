package com.example.myapplication.views

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.views.MainGui
import com.example.myapplication.views.MainGui_ViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val meuviewModel : MainGuiViewModel
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold ( modifier = Modifier.fillMaxSize() ){innerPadding ->
                MainGui(meuviewModel)
                }

            }
        }
    }
}