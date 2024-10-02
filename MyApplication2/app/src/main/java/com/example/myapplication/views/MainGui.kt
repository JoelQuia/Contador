package com.example.myapplication.views

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observaAsState


@Composable
fun MainGui( meuviewModel : MainGuiViewModel){
    val x:  Int by meuviewModel.contador.observaAsState(0)
    var txtfieldValue by remember {
        mutableStateOf("")
    }


            Column {
                Text(text = "=========")
                Text(text = "=========")
                Text(text = "=========")
        TextField(
            value = x.toString(),
            onvaluechallenge = {})

        Button(onClick =  {
            meuviewModel.IncrementContador()
        }){
            Text(text = "Run Clicks ="+x.toString())
        }


        }

    }

fun TextField(value: String, onvaluechallenge: () -> Unit) {

}

    


