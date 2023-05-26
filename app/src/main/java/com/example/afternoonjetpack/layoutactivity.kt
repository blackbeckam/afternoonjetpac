package com.example.afternoonjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.afternoonjetpack.ui.theme.AfternoonJetpackTheme

class layoutactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mytext()
            }
        }
    }

@Composable
fun mytext(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Magenta)) {
        Text(text = "Hello there", fontSize = 50.sp, fontStyle = FontStyle.Italic, color = Color.Red)
        Text(text = "Interesting", fontSize = 30.sp, fontStyle = FontStyle.Italic)
        Text(text = "Drake is amazing", fontSize = 30.sp, fontStyle = FontStyle.Italic)
        Text(text = "Peaches & Eggplants", fontSize = 30.sp, fontStyle = FontStyle.Italic)

        Row(modifier = Modifier
            .background(color = Color.White)
            .fillMaxWidth()) {
            Text(text = "True ",fontSize = 30.sp, fontStyle = FontStyle.Italic)
            Text(text = "False", fontSize = 30.sp, fontStyle = FontStyle.Italic)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun mytextPreview(){
    mytext()
}
