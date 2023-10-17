package com.example.filozz.view


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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.filozz.Screen
import com.example.filozz.ui.theme.Green
import com.example.filozz.ui.theme.Grey
import com.example.filozz.ui.theme.PurpleBackground
import com.example.filozz.ui.theme.*
import com.example.filozz.ui.theme.interFont



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterPage(navController: NavController){
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
                contentAlignment = Alignment.TopCenter,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(
                        color = Grey,
                        shape = RoundedCornerShape(88.dp, 88.dp, 0.dp, 0.dp)
                    )
            ){
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(23.dp, Alignment.Top),
                    modifier = Modifier.offset(x = 0.dp, y = 80.dp)){

                    var name by remember {
                        mutableStateOf("Name")
                    }
                    var surname by remember {
                        mutableStateOf("Surname")
                    }
                    var email by remember {
                        mutableStateOf("Email")
                    }
                    var password by remember{
                        mutableStateOf("Password")
                    }

                    TextField(
                    value = name,
                    onValueChange = { text -> name = text },
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color.Black,
                            shape = RoundedCornerShape(size = TEXT_FIELD_ROUNDING_CORNER)
                        )
                        .width(320.dp)
                        .height(73.dp)
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(size = TEXT_FIELD_ROUNDING_CORNER)
                        )
                        .padding(
                            start = TEXT_FIELD_ROUNDING_CORNER,
                            top = TEXT_FIELD_PADDING_VERTICAL,
                            end = TEXT_FIELD_PADDING_HORIZONTAL,
                            bottom = TEXT_FIELD_PADDING_VERTICAL
                        )
                )
                    TextField(
                        value = surname,
                        onValueChange = {value -> surname = value},
                        modifier = Modifier
                            .border(
                                width = 1.dp,
                                color = Color.Black,
                                shape = RoundedCornerShape(size = TEXT_FIELD_ROUNDING_CORNER))
                            .width(320.dp)
                            .height(73.dp)
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(size = TEXT_FIELD_ROUNDING_CORNER))
                            .padding(
                                start = TEXT_FIELD_PADDING_HORIZONTAL,
                                top = TEXT_FIELD_PADDING_VERTICAL,
                                end = TEXT_FIELD_PADDING_HORIZONTAL,
                                bottom = TEXT_FIELD_PADDING_VERTICAL))

                    TextField(
                        value = email,
                        onValueChange = { text -> email = text },
                        modifier = Modifier
                            .border(
                                width = 1.dp,
                                color = Color.Black,
                                shape = RoundedCornerShape(size = TEXT_FIELD_ROUNDING_CORNER)
                            )
                            .width(320.dp)
                            .height(73.dp)
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(size = TEXT_FIELD_ROUNDING_CORNER)
                            )
                            .padding(
                                start = TEXT_FIELD_PADDING_HORIZONTAL,
                                top = TEXT_FIELD_PADDING_VERTICAL,
                                end = TEXT_FIELD_PADDING_HORIZONTAL,
                                bottom = TEXT_FIELD_PADDING_VERTICAL
                            )
                    )
                    TextField(
                        value = password,
                        onValueChange = {value -> password = value},
                        modifier = Modifier
                            .border(
                                width = 1.dp,
                                color = Color.Black,
                                shape = RoundedCornerShape(size = TEXT_FIELD_ROUNDING_CORNER))
                            .width(320.dp)
                            .height(73.dp)
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(size = TEXT_FIELD_ROUNDING_CORNER))
                            .padding(
                                start = TEXT_FIELD_PADDING_HORIZONTAL,
                                top = TEXT_FIELD_PADDING_VERTICAL,
                                end = TEXT_FIELD_PADDING_HORIZONTAL,
                                bottom = TEXT_FIELD_PADDING_VERTICAL))


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
                            text = "Register",
                            fontSize = 16.sp,
                            fontFamily = interFont,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            textAlign = TextAlign.Center

                        )
                    }
                    Row(){
                        Text(
                            text = "Already an account?",
                            fontSize = 16.sp,
                            fontFamily = interFont,
                            fontWeight = FontWeight.Thin,
                            color = Color.Black,
                            textAlign = TextAlign.Center

                        )
                        Text(
                            text = " Log In",
                            fontSize = 16.sp,
                            fontFamily = interFont,
                            fontWeight = FontWeight.Thin,
                            color = Color.Blue,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.clickable { navController.navigate(
                                Screen
                                .LoginScreen.route) }
                        )
                    }

                }
            }
        }
    }
}