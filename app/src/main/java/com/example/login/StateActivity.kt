package com.example.login

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.sp

class StateActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row {
                StateButton()

            }

        }
    }

    @Composable
    fun StateButton() {
        var count by remember { mutableStateOf(0) }
        var visible by remember { mutableStateOf(true) }
        val modifierAlpha = if (visible) {
            Modifier.alpha(1f)
        } else {
            Modifier.alpha(0f)
        }
        Row {
            Column {
                Button(onClick = {           // 연산
                    count++
                }) {
                    Text(text = "저장", fontSize = 16.sp)
                }
                Column {     // 출력
                    for (i in 1..count) {
                        Text(text = "%02d".format(i) + " : 저장했어요", modifier = modifierAlpha)
                    }
                }
            }
            Button(onClick = { visible = !visible }) {
                Text(
                    text = if (visible) {
                        "리스트 숨김"
                    } else {
                        "리스트 보이기"
                    }
                )
            }
            Button(onClick = { count-- }) {
                Text(text = "삭제")
            }
            Button(onClick = { count = 0 }) {
                Text(text = "초기화")
            }
        }
    }
}

