package com.example.afternoonjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.afternoonjetpack.ui.theme.AfternoonJetpackTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            image()
            }
        }
    }

@Composable
fun image(){
   Column(modifier = Modifier
       .fillMaxSize()
       .background(color = Color.Black)) {
       Text(text = "Cars", fontSize = 30.sp, textDecoration = TextDecoration.Underline, color = Color.White)
       Image(painter = painterResource(id = R.drawable.car), contentDescription = "Car")

       Row() {
           Text(text = "Rema", color = Color.White)
           Image(painterResource(id = R.drawable.rema), contentDescription = "REMA")

       }
   }
}

@Preview(showBackground = true)
@Composable
fun imagePreview(){
    image()
}
