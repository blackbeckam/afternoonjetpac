package com.example.afternoonjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.afternoonjetpack.ui.theme.AfternoonJetpackTheme

class TextfieldActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            form()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun form(){
   Column(modifier = Modifier
       .fillMaxSize()
       .background(color = Color.Black)
       .padding(50.dp)) {
       Text(text = "PERSONAL DETAILS", fontSize = 30.sp, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold, textDecoration = TextDecoration.Underline, color = Color.Yellow)

       //firstname
       var text by remember { mutableStateOf("") }
       TextField(
           value = text,
           onValueChange ={text=it},
           label = { Text(text = "Firstname:")},
           modifier = Modifier.padding(10.dp),

           placeholder = { Text(text = "Enter firstname")},
           leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "icon")},
           trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
           textStyle = TextStyle(color = Color.Black, fontStyle = FontStyle.Normal),
           keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

       )

       //middlename
       var mname by remember { mutableStateOf("") }
       TextField(
           value = mname,
           onValueChange ={mname=it},
           label = { Text(text = "Middlename:")},
           modifier = Modifier.padding(10.dp),

           placeholder = { Text(text = "Enter firstname")},
           leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "icon")},
           trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
           textStyle = TextStyle(color = Color.Black, fontStyle = FontStyle.Normal),
           keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

       )
       //surname
       var sname by remember { mutableStateOf("") }
       TextField(
           value = sname,
           onValueChange ={sname=it},
           label = { Text(text = "Surname:")},
           modifier = Modifier.padding(10.dp),

           placeholder = { Text(text = "Enter surname")},
           leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "icon")},
           trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
           textStyle = TextStyle(color = Color.Black, fontStyle = FontStyle.Normal),
           keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

       )
       //email
       var myemail by remember { mutableStateOf("") }
       TextField(
           value = myemail,
           onValueChange ={myemail=it},
           label = { Text(text = "Email:")},
           modifier = Modifier.padding(10.dp),

           placeholder = { Text(text = "Enter email")},
           leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "icon")},
           trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
           textStyle = TextStyle(color = Color.Black, fontStyle = FontStyle.Normal),
           keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

       )
       //password
       var pass by remember { mutableStateOf("") }
       TextField(
           value = pass,
           onValueChange ={pass=it},
           label = { Text(text = "Password:")},
           modifier = Modifier.padding(10.dp),

           placeholder = { Text(text = "Enter password")},
           leadingIcon = { Icon(imageVector = Icons.Default.Menu, contentDescription = "icon")},
           trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
           textStyle = TextStyle(color = Color.Black, fontStyle = FontStyle.Normal),
           keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
           visualTransformation = PasswordVisualTransformation()

       )
       //phonenumber
       var pnum by remember { mutableStateOf("") }
       TextField(
           value = pnum,
           onValueChange ={pnum=it},
           label = { Text(text = "Phone number:")},
           modifier = Modifier.padding(10.dp),

           placeholder = { Text(text = "Enter phone number")},
           leadingIcon = { Icon(imageVector = Icons.Default.Phone, contentDescription = "icon")},
           trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
           textStyle = TextStyle(color = Color.Black, fontStyle = FontStyle.Normal),
           keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)

       )

   } 
}


@Preview(showBackground = true)
@Composable
fun formPreview(){
    form()
}
