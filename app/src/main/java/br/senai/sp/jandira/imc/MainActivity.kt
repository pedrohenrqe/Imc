package br.senai.sp.jandira.imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.imc.ui.theme.IMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color(0xFFED145B)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 24.dp)
            ) {
                Card(
                    modifier = Modifier
                        .size(
                            width = 60.dp,
                            height = 60.dp
                        )
                        .align(Alignment.CenterHorizontally),
                    shape = CircleShape,
                    border = BorderStroke(
                        width = 2.dp,
                        color = Color.Black
                    ),
                    elevation = CardDefaults.cardElevation(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.imc),
                        contentDescription = "Logo",
                        contentScale = ContentScale.Crop
                    )
                }
                Text(
                    text = "Calculadora IMC",
                    color = Color.White,
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 12.dp)
                )
            }
        }
        Card(
            colors = CardDefaults.cardColors(Color(0xffF9F6F6)),
            modifier = Modifier
                .padding(horizontal = 32.dp)
                .height(400.dp)
                .offset(x = 0.dp, y = (-40.dp)),
            elevation = CardDefaults.cardElevation(10.dp)
        ) {
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .padding(top = 24.dp)
                ) {
                    Text(
                        text = "Seus dados",
                        color = Color(0xFFED145B),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(horizontal = 24.dp, vertical = 24.dp)
                ) {
                    Text(
                        text = "Seu peso:",
                        color = Color(0xFFED145B),
                        fontSize = 14.sp
                    )
                    OutlinedTextField(
                        value = "Seu peso em Kg",
                        onValueChange = {},
                        modifier = Modifier
                            .padding(
                                bottom = 32.dp, top = 8.dp
                            ),
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = Color(
                                0xFFED145B
                            )
                        )
                    )
                    Text(
                        text = "Sua altura:",
                        color = Color(0xFFED145B),
                        fontSize = 14.sp
                    )
                    OutlinedTextField(
                        value = "Sua altura em cm",
                        onValueChange = {},
                        modifier = Modifier
                            .padding(
                                bottom = 32.dp, top = 8.dp
                            ),
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = Color(
                                0xFFED145B
                            )
                        )
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(horizontal = 24.dp)
                        .fillMaxWidth()
                        .height(60.dp),
                    colors = ButtonDefaults
                        .buttonColors(
                            containerColor = Color(0xFFED145B)
                        ),
                    shape = RoundedCornerShape(6.dp)
                ) {
                    Text(
                        text = "CALCULAR",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp, vertical = 4.dp)
                .height(120.dp),
            colors = CardDefaults.cardColors(Color(0xFF329F6B)),
            elevation = CardDefaults.cardElevation(6.dp),
            border = BorderStroke(
                width = 1.dp,
                color = Color(0xFFED145B),
            )
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = "Resultado",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Light
                    )
                    Text(
                        text = "Peso Ideal",
                        color = Color.White,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Normal
                    )
                }
                Column (

                ) {
                    Text(
                        text = "21.3",
                        color = Color.White,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IMCTheme {
        Greeting()
    }
}