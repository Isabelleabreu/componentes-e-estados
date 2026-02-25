package com.aulasandroid.componenteestado

import android.R.attr.font
import android.R.attr.fontFamily
import android.R.attr.fontWeight
import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.componenteestado.ui.theme.ComponenteEstadoTheme
import com.aulasandroid.componenteestado.ui.theme.Schoolbell

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComponenteEstadoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    BasicComponentsScreen(modifier = Modifier.padding(innerPadding))

                    TesteComponentsScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun BasicComponentsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(101, 219, 255, 255))
    ){
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "Aulas android",
            fontSize = 32.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF052679),
            textAlign = TextAlign.End,
            letterSpacing = 4.sp
        )
        Text(
        modifier = Modifier.align(Alignment.CenterHorizontally),
        text = "Com Jetpack Compose",
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
        color = Color(123, 106, 210, 255),
        fontFamily = Schoolbell

        )

    }
}

@Composable
fun TesteComponentsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Red)
    ) {
        AndroidEnemy(
            modifier = Modifier
                .size(70.dp),
            color = Color.Cyan
        )

        AndroidEnemy(
            modifier = Modifier
                .size(70.dp),
            color = Color.Yellow
        )
    }
}

@Composable
fun AndroidEnemy(modifier: Modifier = Modifier, color: Color) {
    Image(
        contentDescription = "Android Enemy",
        painter = painterResource(R.drawable.ic_launcher_foreground),
        modifier = modifier,
        colorFilter = ColorFilter.tint(color)
    )
}
