package com.example.afternoonjetpack.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.afternoonjetpack.R
import com.example.afternoonjetpack.ui.theme.ui.theme.AfternoonJetpackTheme

class CardActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mycard()

        }
    }
}

@Composable
fun mycard(){
    var scrollState= rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scrollState), horizontalAlignment = Alignment.CenterHorizontally) {
        Card() {
            Column(modifier = Modifier.background(color = Color.DarkGray)) {
                Image(painter = painterResource(id = R.drawable.salad1), contentDescription = "salad1", modifier = Modifier
                    .size(200.dp)
                    .clip(shape = RectangleShape))
                
            }
            
        }
        Spacer(modifier = Modifier.height(10.dp))
        Card(modifier = Modifier.padding(all = 50.dp)) {
            Column(modifier = Modifier.background(color = Color.DarkGray)) {
                Image(painter = painterResource(id = R.drawable.salad2), contentDescription = "salad2", modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape))

            }

        }
        Spacer(modifier = Modifier.height(10.dp))
        Card() {
            Column(modifier = Modifier.background(color = Color.DarkGray)) {
                Image(painter = painterResource(id = R.drawable.salad3), contentDescription = "salad3", modifier = Modifier
                    .size(200.dp)
                    .clip(shape = RectangleShape))

            }

        }
        
    }


}


@Preview(showBackground = true)
@Composable
fun mycardPreview(){
    mycard()
}
