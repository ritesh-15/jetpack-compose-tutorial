 package com.example.jetpack_compose_tutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_tutorial.ui.theme.JETPACK_COMPOSE_TUTORIALTheme
import com.example.jetpack_compose_tutorial.ui.theme.Typography

 class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JETPACK_COMPOSE_TUTORIALTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {

                }
            }
        }
    }
}


@Composable
fun CustomBox(text:String ,color:Color = Color.Blue){
    Box(modifier = Modifier
        .background(color)
        )
    Text(text = text , fontSize = 40.sp)
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JETPACK_COMPOSE_TUTORIALTheme {
        
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
            contentAlignment =  Alignment.Center
            ) {
            CustomBox("Hello there")
        }
        
    }
}