package com.aulasandroid.componenteestado

import android.R.attr.contentDescription
import android.R.attr.font
import android.R.attr.fontFamily
import android.R.attr.fontWeight
import android.R.attr.text
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation.Companion.keyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
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

                    ComponentesEstadoScreen(modifier = Modifier.padding(innerPadding))
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

//@Composable
//fun TesteComponentsScreen(modifier: Modifier = Modifier) {
//    Column(
//        modifier = modifier
//            .fillMaxSize()
//            .background(Color.Red)
//    ) {
//        AndroidEnemy(
//            modifier = Modifier
//                .size(70.dp),
//            color = Color.Cyan
//        )
//
//        AndroidEnemy(
//            modifier = Modifier
//                .size(70.dp),
//            color = Color.Yellow
//        )
//    }
//}

@Composable
fun AndroidEnemy(modifier: Modifier = Modifier, color: Color) {
    Image(
        contentDescription = "Android Enemy",
        painter = painterResource(R.drawable.ic_launcher_foreground),
        modifier = modifier,
        colorFilter = ColorFilter.tint(color)
    )
}

@Composable
fun ComponentesEstadoScreen(modifier: Modifier = Modifier) {

    var corFundo by remember {
        mutableStateOf(Color(94, 147, 255, 255))
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(corFundo),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        var nome by remember {
            mutableStateOf("")
        }

        var idade by remember {
            mutableStateOf("")
        }

        var email by remember {
            mutableStateOf("")
        }

        var jCompose by remember {
            mutableStateOf(false)
        }

        var xml by remember {
            mutableStateOf(false)
        }

        var sOperacional by remember {
            mutableStateOf("ios")
        }

        var favoritado by remember {
            mutableStateOf(false)
        }


        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = nome,
            onValueChange = { novoValor ->
//                Log.i("Teste", novoValor)

                nome = novoValor
            },
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Words
            ),
            label = {
                Text(text = "Nome e sobrenome")
            },
            placeholder = {
                    Text(text = "Digite seu nome")
            },

            //leading: liderando, no inicio
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Icone pessoa",
                    tint = Color (42, 75, 255, 255)
                )
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = idade,
            onValueChange = { novoValor ->
//                Log.i("Teste", novoValor)

                idade = novoValor
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = {
                Text(text = "idade")
            },

            //trailing, final
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Face,
                    contentDescription = "Icone pessoa",
                    tint = Color(42, 75, 255, 255)
                )
            },
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Magenta,
                unfocusedTextColor = Color.Blue,
                focusedPlaceholderColor = Color.Red
            )
        )

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            singleLine = true,
            label = {
                Text(text = "Email")
            },
            placeholder = {
                Text(text = "Digite seu email")
            },
            shape = RoundedCornerShape(
                topStart = 20.dp,
                bottomEnd = 20.dp
            ),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Magenta,
                unfocusedTextColor = Color.Blue,
                focusedPlaceholderColor = Color.Red,
                focusedBorderColor = Color.Yellow,
                unfocusedBorderColor = Color.Green
            )
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = jCompose,
                onCheckedChange = { jCompose = it },
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Green,
                    uncheckedColor = Color.Red
                )
            )

            Text(text = "Jetpack Compose")

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = xml,
                onCheckedChange = { xml = it },
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Green,
                    uncheckedColor = Color.Red
                )
            )

            Text(text = "XML")

        }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = sOperacional == "ios",
                    onClick = {
                        sOperacional = "ios"
                    }
                )
                Text(text = "IOS")
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = sOperacional == "android",
                    onClick = {
                       sOperacional = "android"
                    }
                )
                Text(text = "Android")
            }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = sOperacional == "wPhone",
                onClick = {
                    sOperacional = "wPhone"
                }
            )
            Text(text = "Windows Phone")
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(
                onClick = {
                    corFundo = Color.Cyan
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black,
                    contentColor = Color.Blue
                ),
                border = BorderStroke(width = 4.dp, Color.Cyan),
                shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp)
            ) {
                Text(text = "Clique aqui!")

                Icon(
                    imageVector = Icons.Default.ThumbUp,
                    contentDescription = "ThumbUp icon"
                )
            }

            OutlinedButton(
                onClick = {
                    corFundo = Color.Magenta
                }
            ) {
                Text(text = "Não, clique aqui")
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            if (favoritado){
                Icon(
                    modifier = Modifier
                        .size(40.dp)
                    .clickable{
                        favoritado = false
                    },
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Favorite icon"
                )
            } else {
                Icon(
                    modifier = Modifier
                        .size(40.dp)
                        .clickable{
                            favoritado = true
                        },
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = "Favorite border icon"
                )
            }

        }

    }
}
