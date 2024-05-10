package com.example.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.login.ui.theme.LoginTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


class Instagram : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginTheme {
                MainScreen()
            }
        }
    }

    @Composable
    fun MainScreen() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .border(width = 7.dp, color = Color.Black, shape = RoundedCornerShape(15.dp))
                .padding(2.dp)
                .fillMaxHeight()
        ) {
            Text(
                text = "English",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 30.dp),
                textAlign = TextAlign.Center,
                color = Color.LightGray
            )
            Image(
                painter = painterResource(id = R.drawable.instagram),
                contentDescription = "instagram",
                modifier = Modifier
                    .size(200.dp, 100.dp)
                    .padding(0.dp, 0.dp, 0.dp, 10.dp),
            )
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue
                )
            ) {
                Text(
                    text = "Continue with Facebook",
                    modifier = Modifier.padding(60.dp, 0.dp)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                Divider(
                    thickness = 2.dp, color = Color.LightGray,
                    modifier = Modifier
                        .width(115.dp)
                        .padding(0.dp, 30.dp),


                    )
                Text(
                    text = "OR",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(30.dp),
                    color = Color.LightGray
                )
                Divider(
                    thickness = 2.dp, color = Color.LightGray, modifier = Modifier
                        .width(115.dp)
                        .padding(0.dp, 30.dp)
                )
            }
            var text by remember { (mutableStateOf("")) }
            TextField(
                value = text,
                onValueChange = { text = it },
                label = {
                    Text(
                        text = "phone number, username, or email",
                        fontSize = 10.sp,
                        color = Color.Gray
                    )
                },
                modifier = Modifier
                    .padding(0.dp, 0.dp, 0.dp, 20.dp)
                    .width(300.dp)
                    .height(20.dp)

            )
            TextField(
                value = text,
                onValueChange = { text = it },
                label = {
                    Text(
                        text = "password",
                        fontSize = 10.sp,
                        color = Color.Gray
                    )
                },
                modifier = Modifier
                    .padding(0.dp, 20.dp, 0.dp, 20.dp)
                    .width(300.dp)
                    .height(20.dp)

            )
            Text(
                text = "Forgot Password?",
                color = Color.Blue,
                fontSize = 12.sp,
                modifier = Modifier.padding(200.dp, 0.dp, 0.dp, 10.dp)
            )
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue
                ),
                modifier = Modifier
                    .alpha(0.5f)
                    .padding(10.dp)
            ) {
                Text(
                    text = "Log In",
                    modifier = Modifier.padding(110.dp, 0.dp)
                )
            }
            Row {
                Text(
                    text = "Don't have an account?", color = Color.LightGray, modifier =
                    Modifier.padding(10.dp, 10.dp)
                )
                Text(text = "sign up", color = Color.Blue, modifier = Modifier.padding(0.dp, 9.dp))
            }
            Spacer(modifier = Modifier.height(200.dp))
            Text(text = "from", fontSize = 10.sp, color = Color.Gray)
            Text(text = "FACEBOOK")
            Divider(
                thickness = 8.dp,
                color = Color.Black,
                modifier = Modifier
                    .padding(20.dp)
                    .width(100.dp)
            )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun MainScreenPreview() {
        LoginTheme {
            MainScreen()
        }
    }
}

