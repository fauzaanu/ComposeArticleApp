package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TheArticle()
                }
            }
        }
    }
}


@Composable
fun TheArticle(){
    val theHeaderImage = R.drawable.bg_compose_background   // this returns an int -- not a painter resource

    Column {
        Image(
            painter = painterResource(id = theHeaderImage),
            contentDescription = null,
            modifier = Modifier
                .wrapContentWidth(align = Alignment.Start),
//                .wrapContentWidth(align = Alignment.Start),
            contentScale = ContentScale.FillWidth
        )

        Box(
            Modifier
                .padding(20.dp)
                .fillMaxWidth()
                .border(1.dp, Color.Black, RoundedCornerShape(20))
                .background(color = Color.White, RoundedCornerShape(20))
        ) {
            Text(
                stringResource(R.string.headline_placeholder),

                modifier = Modifier
                    .align(alignment = Alignment.Center)
                    .padding(10.dp)
            )
        }

        Text(
            stringResource(R.string.paragraph_text_placeholder),
            lineHeight = 50.sp,
            modifier = Modifier.padding(20.dp)
        )


    }
}

@Preview(showBackground = true)
@Composable
fun TheArticlePreview() {
    ComposeArticleTheme {
        TheArticle()
    }
}