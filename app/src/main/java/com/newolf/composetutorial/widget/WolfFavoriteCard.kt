package com.newolf.composetutorial.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.newolf.composetutorial.R
import com.newolf.composetutorial.data.AlignYouBody

/**
 * ======================================================================
 *
 *
 * @author : NeWolf
 * @version : 1.0
 * @since :  2024-02-21
 *
 * =======================================================================
 */

@Composable
fun FavoriteCard(item: AlignYouBody, modifier: Modifier = Modifier) {
    Surface(
        shape = MaterialTheme.shapes.medium,
        color = MaterialTheme.colorScheme.surfaceVariant,
        modifier = Modifier
            .width(255.dp)
            .clip(RoundedCornerShape(10.dp))

    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {

            Image(
                painter = painterResource(id = item.imageRes), contentDescription = stringResource(
                    id = item.desRes
                ), modifier = modifier.size(80.dp), contentScale = ContentScale.Crop
            )

            Text(
                text = stringResource(id = item.desRes),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
    }


}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun FavoriteCardPreview() {
    FavoriteCard(AlignYouBody(R.mipmap.girl, R.string.app_name))
}

