package com.example.articleapp

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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articleapp.ui.theme.ArticleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticleAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleImage(
                        title = stringResource(R.string.article_title),
                        about = stringResource(R.string.article_about),
                        body = stringResource(R.string.article_body)
                    )
                }
            }
        }
    }
}

@Composable
fun ArticleText(title: String, about: String, body: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = modifier
    ) {
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = modifier
                .padding(16.dp)
        )
        Text(
            text = about,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp
                )
        )
        Text(
            text = body,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(16.dp)
        )
    }
}

@Composable
fun ArticleImage(title: String, about: String, body:String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)

    Column {
        Box {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.FillWidth
            )
        }
        Box {
            ArticleText(
                title = title,
                about = about,
                body = body,
                modifier = modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ArticleAppTheme {
        ArticleImage(
            title = stringResource(R.string.article_title),
            about = stringResource(R.string.article_about),
            body = stringResource(R.string.article_body)
        )
    }
}