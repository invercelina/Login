package com.example.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

class ForErase : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StateButton()
        }
    }
}

@Composable
fun StateButton() {
    var count by remember { mutableStateOf(0) }
    Column {
        Button(onClick = {count = count + 1}) {
            Text(text = "저장")
        }
        for (i in 1..count){
            Text(text = "$i : 저장되었습니다")
        }
    }
}