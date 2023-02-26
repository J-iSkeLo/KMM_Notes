package dev.jiskelo.kmmnotes.android

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.SubcomposeAsyncImage
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import dev.jiskelo.kmmnotes.shared.entity.Product


@ExperimentalGlideComposeApi
@Composable
fun ProductItem(
    product: Product,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
        .fillMaxWidth()
        .height(250.dp)
        .padding(3.dp)
        .background(Color.White, shape = RoundedCornerShape(12.dp)),
        verticalArrangement = Arrangement.Center
    ) {
        AsyncImage(
            model = "https://zoo-zoo-zoo.com.ua/" + product.smallImageUri,
            contentDescription = null,
            modifier = Modifier.height(120.dp).fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = product.title,
            style = TextStyle(
                color = Color.Black,
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            ),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(5.dp).fillMaxWidth(),
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "${product.price} ₴",
            style = TextStyle(
                color = Color.Black,
                fontSize = 14.sp
            ),
            color = Color.Red,
            modifier = Modifier.padding(5.dp)
        )
    }
}