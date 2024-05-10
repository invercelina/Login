package com.example.login

import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp


class SubActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                SubButton(name = "확인")
                SubButton(name = "수정")
                SubButton(name = "취소")
                SubButton(name = "삭제")
                SubButton(name = "저장")
            }
        }
    }

    @Composable
    fun SubButton(name: String) {
        var count by remember { mutableStateOf(0) }
        Button(onClick = {
            count++
            Toast.makeText(this@SubActivity, "hello", LENGTH_LONG).show()
        }) {
            Text(text = name, fontSize = 16.sp)
            Text(text = "$count")
        }
    }
}

