package com.example.afternoonjetpack.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.afternoonjetpack.R
import com.example.afternoonjetpack.ui.theme.ui.theme.AfternoonJetpackTheme

class AssignActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            assign()

        }
    }
}

@Composable
fun assign(){
    var scrollState= rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scrollState)
        .padding(all = 15.dp)) {
        Card(modifier = Modifier.fillMaxWidth()) {
            Row() {
                Image(painter = painterResource(id = R.drawable.cartoon1), contentDescription = "cartoon", Modifier.size(150.dp) )
                Column() {
                    Text(text = "Phineas", fontSize = 20.sp, textDecoration = TextDecoration.Underline)
                    Text(text = "Human", fontSize = 15.sp)
                    Text(text = "Alive", fontSize = 15.sp)

                }

                
            }
            
        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier.fillMaxWidth()) {
            Row() {
                Image(painter = painterResource(id = R.drawable.cartoon2), contentDescription = "cartoon", Modifier.size(150.dp) )
                Column() {
                    Text(text = "Jonny Bravo", fontSize = 20.sp, textDecoration = TextDecoration.Underline)
                    Text(text = "Human", fontSize = 15.sp)
                    Text(text = "Alive", fontSize = 15.sp)

                }


            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier.fillMaxWidth()) {
            Row() {
                Image(painter = painterResource(id = R.drawable.cartoon3), contentDescription = "cartoon", Modifier.size(150.dp) )
                Column() {
                    Text(text = "Baby legs", fontSize = 20.sp, textDecoration = TextDecoration.Underline)
                    Text(text = "Human", fontSize = 15.sp)
                    Text(text = "Alive", fontSize = 15.sp)

                }


            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier.fillMaxWidth()) {
            Row() {
                Image(painter = painterResource(id = R.drawable.cartoon4), contentDescription = "cartoon", Modifier.size(150.dp) )
                Column() {
                    Text(text = "Buttercup", fontSize = 20.sp, textDecoration = TextDecoration.Underline)
                    Text(text = "Human", fontSize = 15.sp)
                    Text(text = "Alive", fontSize = 15.sp)

                }


            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier.fillMaxWidth()) {
            Row() {
                Image(painter = painterResource(id = R.drawable.cartoon5), contentDescription = "cartoon", Modifier.size(150.dp) )
                Column() {
                    Text(text = "Mickey Mouse", fontSize = 20.sp, textDecoration = TextDecoration.Underline)
                    Text(text = "Human", fontSize = 15.sp)
                    Text(text = "Alive", fontSize = 15.sp)

                }


            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier.fillMaxWidth()) {
            Row() {
                Image(painter = painterResource(id = R.drawable.cartoon6), contentDescription = "cartoon", Modifier.size(150.dp) )
                Column() {
                    Text(text = "Dora the Explorer", fontSize = 20.sp, textDecoration = TextDecoration.Underline)
                    Text(text = "Human", fontSize = 15.sp)
                    Text(text = "Alive", fontSize = 15.sp)

                }


            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier.fillMaxWidth()) {
            Row() {
                Image(painter = painterResource(id = R.drawable.cartoon7), contentDescription = "cartoon", Modifier.size(150.dp) )
                Column() {
                    Text(text = "Spongebob", fontSize = 20.sp, textDecoration = TextDecoration.Underline)
                    Text(text = "Human", fontSize = 15.sp)
                    Text(text = "Alive", fontSize = 15.sp)

                }


            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        
    }

}


@Preview(showBackground = true)
@Composable
fun assignPreview(){
    assign()
}
