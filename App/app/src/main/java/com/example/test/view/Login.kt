package com.example.test.view


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test.R
import com.example.test.ui.theme.Green
import com.example.test.ui.theme.Grey
import com.example.test.ui.theme.PurpleBackground
import com.example.test.ui.theme.interFont


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPage(){
    Box(
        modifier = Modifier
            .background(PurpleBackground)
            .fillMaxSize()
    ){
        Column {
            Box(
                modifier = Modifier
                    .background(PurpleBackground)
                    .fillMaxWidth()
                    .fillMaxHeight(0.3f),
                contentAlignment = Alignment.Center

            ){
                Column(horizontalAlignment = Alignment.CenterHorizontally){
                    Text(
                        text = "WELCOME TO",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = interFont,
                            fontWeight = FontWeight(700),
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                    )
                    Text(
                        text = "FILOZZ",
                        style = TextStyle(
                            fontSize = 70.sp,
                            fontFamily = interFont,
                            fontWeight = FontWeight(800),
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(
                        color = Grey,
                        shape = RoundedCornerShape(size = 88.dp)
                    )
            ){
                Box(
                    contentAlignment = Alignment.TopCenter,
                    modifier = Modifier
                        .offset(x = 0.dp, y = 150.dp)
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .background(
                            color = Grey
                        )
                ){
                    Column(horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(23.dp, Alignment.Top)){

                        var name by remember {
                            mutableStateOf("")
                        }
                        var password by remember{
                            mutableStateOf("")
                        }
                        TextField(
                            value = name,
                            onValueChange = { text -> name = text },
                            modifier = Modifier
                                .border(
                                    width = 1.dp,
                                    color = Color.Black,
                                    shape = RoundedCornerShape(size = 20.dp)
                                )
                                .width(320.dp)
                                .height(73.dp)
                                .background(
                                    color = Color.White,
                                    shape = RoundedCornerShape(size = 20.dp)
                                )
                                .padding(
                                    start = 22.dp,
                                    top = 14.dp,
                                    end = 22.dp,
                                    bottom = 14.dp
                                )
                        )
                        TextField(
                            value = password,
                            onValueChange = {value -> password = value},
                            modifier = Modifier
                                .border(
                                    width = 1.dp,
                                    color = Color.Black,
                                    shape = RoundedCornerShape(size = 20.dp))
                                .width(320.dp)
                                .height(73.dp)
                                .background(
                                    color = Color.White,
                                    shape = RoundedCornerShape(size = 20.dp))
                                .padding(
                                    start = 22.dp,
                                    top = 14.dp,
                                    end = 22.dp,
                                    bottom = 14.dp))

                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .height(56.dp)
                                    .width(150.dp)
                                    .background(
                                        color = Green,
                                        shape = RoundedCornerShape(size = 8.dp))
                                    .clickable { println("Name : $name, password : $password") }
                            ) {
                                Text(
                                    text = "Login",
                                    fontSize = 16.sp,
                                    fontFamily = interFont,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Black,
                                    textAlign = TextAlign.Center

                                )
                            }

                        Row(){
                            Text(
                                text = "Not register yet? Click",
                                fontSize = 16.sp,
                                fontFamily = interFont,
                                fontWeight = FontWeight.Thin,
                                color = Color.Black,
                                textAlign = TextAlign.Center

                            )
                            Text(
                                text = " here",
                                fontSize = 16.sp,
                                fontFamily = interFont,
                                fontWeight = FontWeight.Thin,
                                color = Color.Blue,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.clickable { println("Register") }
                            )
                        }
                    }
                }
            }
        }
    }
}