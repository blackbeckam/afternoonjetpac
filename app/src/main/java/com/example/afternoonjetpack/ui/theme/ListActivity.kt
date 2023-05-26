package com.example.afternoonjetpack.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.afternoonjetpack.ui.theme.ui.theme.AfternoonJetpackTheme

class ListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mynumber()

        }
    }
}

@Composable
fun mynumber(){
    var scrollState= rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Black)
        .padding(10.dp).verticalScroll(scrollState)) {
        for (item in 1..5000){
            Text(text = "Item is $item", color = Color.Yellow, fontStyle = FontStyle.Normal, fontSize = 20.sp, modifier = Modifier.padding(vertical = 5.dp))
        }
    }

}


@Preview(showBackground = true)
@Composable
fun mynumbersPreview(){
    mynumber()

}