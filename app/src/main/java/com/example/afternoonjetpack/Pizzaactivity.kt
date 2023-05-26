package com.example.afternoonjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import com.example.afternoonjetpack.ui.theme.AfternoonJetpackTheme

class Pizzaactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            pizza()
        }
    }
}

@Composable
fun pizza(){
    Column(modifier = Modifier
        .background(color = Color.DarkGray)
        .fillMaxHeight()) {
        Image(painter = painterResource(id =R.drawable.pizza ), contentDescription = "Pizza", modifier = Modifier.fillMaxWidth())
        Text(text = "Homemade veg pizza", color = Color.White, textAlign = TextAlign.Center, textDecoration = TextDecoration.Underline)
        Text(text = "Italian food: delicious homemade pizza with mozzarella and cherry tomatoes shot from above on rustic wooden table. Some ingredients for preparing pizza like mozzarella, basil, fresh tomatoes, olive oil, salt and pepper, are all on the pizza.", color = Color.White)
    }
}

@Preview(showBackground = true)
@Composable
fun imagepreview(){
    pizza()
}
