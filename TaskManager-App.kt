package com.example.taskmanager

import android.graphics.fonts.FontStyle
import android.graphics.fonts.FontStyle.FONT_WEIGHT_BOLD
import android.os.Bundle
import android.webkit.WebSettings.TextSize
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskComplete(
                        message = stringResource(R.string.complete_text),
                        comment = stringResource(R.string.comment_text)
                    )
                }
            }
        }
    }
}

@Composable
fun TaskComplete(message: String, comment: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center ,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = modifier
                .padding(
                    top = 24.dp,
                    bottom = 8.dp
                )
        )
        Text(
            text = comment,
            textAlign = TextAlign.Center,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerTheme {
        TaskComplete(
            message = stringResource(R.string.complete_text),
            comment = stringResource(R.string.comment_text)
        )
    }
}