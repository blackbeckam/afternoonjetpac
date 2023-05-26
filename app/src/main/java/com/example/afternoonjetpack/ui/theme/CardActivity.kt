package com.example.afternoonjetpack.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.afternoonjetpack.R
import com.example.afternoonjetpack.ui.theme.ui.theme.AfternoonJetpackTheme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            cards()

        }
    }
}

@Composable
fun cards(){
    var scrollState= rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scrollState), horizontalAlignment = Alignment.CenterHorizontally) {
        Card(modifier = Modifier
            .background(color = Color.Black)
            .padding(all = 20.dp)) {
            Column(modifier = Modifier.padding(12.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Apples")
                Image(painter = painterResource(id = R.drawable.apples), contentDescription = "apples", modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape))
            }
            
        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier
            .background(color = Color.Black)
            .padding(all = 20.dp)) {
            Column(modifier = Modifier.padding(12.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Oranges")
                Image(painter = painterResource(id = R.drawable.oranges), contentDescription = "oranges", modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape))
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier
            .background(color = Color.Black)
            .padding(all = 20.dp)) {
            Column(modifier = Modifier.padding(12.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Kiwis")
                Image(painter = painterResource(id = R.drawable.kiwi), contentDescription = "kiwi", modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape))
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier
            .background(color = Color.Black)
            .padding(all = 20.dp)) {
            Column(modifier = Modifier.padding(12.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Mangoes")
                Image(painter = painterResource(id = R.drawable.mango), contentDescription = "mango", modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape))
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier
            .background(color = Color.Black)
            .padding(all = 20.dp)) {
            Column(modifier = Modifier.padding(12.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Grapes")
                Image(painter = painterResource(id = R.drawable.grapes), contentDescription = "grapes", modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape))
            }

        }
        
    }

}

@Preview(showBackground = true)
@Composable
fun cardPreview(){
    cards()
}