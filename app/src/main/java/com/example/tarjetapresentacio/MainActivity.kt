package com.example.tarjetapresentacio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import com.example.tarjetapresentacio.ui.theme.TarjetaPresentacioTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            TarjetaPresentacioTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ){
                    cardText(
                        "Gorka Sancho",
                        "Game Developer",
                        tnumber = "+11 111111111",
                        mail="gorka@alexsancho.name",
                        git="https://github.com/GorkaSancho",
                        modifier = Modifier.padding(2.dp)
                    )
                }

            }
        }
    }
}

@Composable
fun cardText(name: String, occupation: String, tnumber:String, mail: String,git:String, modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.hsv(120f,0.12f,0.98f))
            .padding(top=80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Box (
            modifier = Modifier
                .size(100.dp)
                .background(Color.Blue)
        ){
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = null,
                modifier = modifier.size(100.dp)
            )
        }
        Text(
            text = name,
            fontSize = 60.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = occupation,
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            color = Color.hsv(120f,0.85f,0.75f)
        )
        Row(
            modifier = modifier.padding(top=60.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.telephone_logo),
                contentDescription = null,
                modifier = modifier.size(20.dp)
            )
            Text(
                modifier = modifier.padding(top=1.dp),
                text = tnumber
            )
        }
        Row(

        ){
            Image(
                painter = painterResource(id = R.drawable.mail_icon),
                contentDescription = null,
                modifier = modifier.size(30.dp)
            )
            Text(
                modifier = modifier.padding(top = 4.dp),
                text = mail
            )
        }
        Row(

        ){
            Image(
                painter = painterResource(id = R.drawable.github_logo),
                contentDescription = null,
                modifier = modifier.size(30.dp)
            )
            Text(
                modifier = modifier.padding(top=4.dp),
                text = git
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaPresentacioTheme {

    }
}