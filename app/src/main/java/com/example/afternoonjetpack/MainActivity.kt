package com.example.afternoonjetpack

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.afternoonjetpack.ui.theme.AfternoonJetpackTheme
import com.example.afternoonjetpack.ui.theme.Assign2Activity
import com.example.afternoonjetpack.ui.theme.AssignActivity
import com.example.afternoonjetpack.ui.theme.CardActivity
import com.example.afternoonjetpack.ui.theme.CardActivity2
import com.example.afternoonjetpack.ui.theme.ListActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            text()

                }
            }
        }

@Composable
fun text(){
    val mContext= LocalContext.current
Column(modifier = Modifier
    .fillMaxSize()
    .background(color = Color.Black, shape = RectangleShape).padding(all = 20.dp), horizontalAlignment = Alignment.CenterHorizontally

) {
    //first button
    Button(onClick = {
        mContext.startActivity(Intent(mContext,layoutactivity::class.java)) }, shape = RectangleShape) {
        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "back")
        Text(text = "Layout") }
    //second button
    Button(onClick = {
        mContext.startActivity(Intent(mContext,ImageActivity::class.java))

    }) {
        Text(text = "Image")
    }
    //THIRD button
    Button(onClick = {
        mContext.startActivity(Intent(mContext,Pizzaactivity::class.java))

    }) {
        Text(text = "Pizza")
    }
    //fourth button
    Button(onClick = {
        mContext.startActivity(Intent(mContext,TextfieldActivity::class.java))

    }) {
        Text(text = "Details")
    }
    //fifth button
    Button(onClick = {
        mContext.startActivity(Intent(mContext,ListActivity::class.java))

    }) {
        Text(text = "List")
    }
    //sixth button
    Button(onClick = {
        mContext.startActivity(Intent(mContext,CardActivity::class.java))

    }) {
        Text(text = "Cards")
    }
    //seventh button
    Button(onClick = {
        mContext.startActivity(Intent(mContext,CardActivity2::class.java))

    }) {
        Text(text = "Cards2")
    }
    //eighth button
    Button(onClick = {
        mContext.startActivity(Intent(mContext,AssignActivity::class.java))

    }) {
        Text(text = "Assignment")
    }
    //ninth button
    Button(onClick = {
        mContext.startActivity(Intent(mContext,Assign2Activity::class.java))

    }) {
        Text(text = "Assignment2")
    }
}

}


@Preview(showBackground = true)
@Composable
fun textPreview(){
    text()
}