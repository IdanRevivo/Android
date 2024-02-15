package com.example.savingsapp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.savingsapp.ui.theme.SavingsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SavingsAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Idan Revivo")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column (modifier = Modifier
        .background(color = Color.Black)
        .fillMaxSize()){
        Text(
            text = "Hello $name!",
            fontSize = 30.sp,
            color = Color.Cyan,
            modifier = modifier



        )
        Text(
            text = "I enjoy this too much",
            fontSize = 30.sp,
            color = Color.Red

        )
    }

}

@Preview
@Composable
fun GreetingPreview() {
    SavingsAppTheme {
        Greeting("Idan Revivo")
    }
}

