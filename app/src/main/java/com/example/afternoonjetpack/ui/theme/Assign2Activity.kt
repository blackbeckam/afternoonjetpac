package com.example.afternoonjetpack.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.afternoonjetpack.R
import com.example.afternoonjetpack.ui.theme.ui.theme.AfternoonJetpackTheme

class Assign2Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mycards()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun mycards(){
    val scrollState= rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(all = 10.dp)
        ) {
        Icon(imageVector = Icons.Default.Menu, contentDescription = "MENU")
        Text(text = "Dubai, Media City", fontSize = 40.sp)

        Row(modifier = Modifier.horizontalScroll(scrollState)) {
            Card() {
                Image(painter = painterResource(id = R.drawable.food1), contentDescription = "food1",Modifier.size(200.dp))
            }
            Spacer(modifier = Modifier.width(10.dp))
            Card() {
                Image(painter = painterResource(id = R.drawable.food2), contentDescription = "food2",Modifier.size(200.dp))
            }
            Spacer(modifier = Modifier.width(10.dp))
            Card() {
                Image(painter = painterResource(id = R.drawable.food3), contentDescription = "food3",Modifier.size(200.dp))
            }
            Spacer(modifier = Modifier.width(10.dp))
            Card() {
                Image(painter = painterResource(id = R.drawable.food4), contentDescription = "food4",Modifier.size(200.dp))
            }
            Spacer(modifier = Modifier.width(10.dp))
            Card() {
                Image(painter = painterResource(id = R.drawable.food5), contentDescription = "food5",Modifier.size(200.dp))
            }
            Spacer(modifier = Modifier.width(10.dp))
            Card() {
                Image(painter = painterResource(id = R.drawable.food6), contentDescription = "food6",Modifier.size(200.dp))
            }
        }
        Text(text = "Your Usuals", fontSize = 20.sp, textDecoration = TextDecoration.Underline)
        Row(modifier = Modifier.horizontalScroll(scrollState)) {
            Card() {
                Column() {
                    Image(painter = painterResource(id = R.drawable.food1), contentDescription = "food",Modifier.size(200.dp) )
                    Text(text = "Currently available")
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            Card() {
                Column() {
                    Image(painter = painterResource(id = R.drawable.food2), contentDescription = "food",Modifier.size(200.dp) )
                    Text(text = "Currently available")
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            Card() {
                Column() {
                    Image(painter = painterResource(id = R.drawable.food3), contentDescription = "food",Modifier.size(200.dp) )
                    Text(text = "Currently available")
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            Card() {
                Column() {
                    Image(painter = painterResource(id = R.drawable.food4), contentDescription = "food",Modifier.size(200.dp) )
                    Text(text = "Currently available")
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            Card() {
                Column() {
                    Image(painter = painterResource(id = R.drawable.food5), contentDescription = "food", Modifier.size(200.dp) )
                    Text(text = "Currently available")
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            Card() {
                Column() {
                    Image(painter = painterResource(id = R.drawable.food6), contentDescription = "food",Modifier.size(200.dp) )
                    Text(text = "Currently available")
                }
            }
        }
        
    }

}


@Preview(showBackground = true)
@Composable
fun MycardsPreview(){
    mycards()
}