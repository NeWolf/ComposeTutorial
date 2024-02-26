package com.newolf.composetutorial

import SampleData
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import com.newolf.composetutorial.ui.theme.ComposeTutorialTheme
import com.newolf.composetutorial.viewmodel.BasicLayoutViewModel
import com.newolf.composetutorial.widget.AlignYouBodyElement
import com.newolf.composetutorial.widget.FavoriteCard
import com.newolf.composetutorial.widget.SearchBar

class BasicLayoutActivity : ComponentActivity() {
    private val vm: BasicLayoutViewModel by lazy {
        ViewModelProvider(this)[BasicLayoutViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                BasicLayoutDemo()
            }
        }

        loadData()

    }

    private fun loadData() {
        vm.mockData()
    }

    @Composable
    fun BasicLayoutDemo(modifier: Modifier = Modifier) {
        Column(modifier.verticalScroll(rememberScrollState())) {
            Spacer(modifier = Modifier.height(16.dp))
            SearchBar()
            Text(
                text = stringResource(id = R.string.align_your_body),
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier
                    .paddingFromBaseline(top = 40.dp, bottom = 16.dp)
                    .padding(start = 16.dp)
            )

            vm.alignYouBodyList.value?.let {
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    contentPadding = PaddingValues(horizontal = 16.dp)
                ) {

                    items(it) { item ->
                        AlignYouBodyElement(item = item)
                    }
                }

            }

            Text(
                text = stringResource(id = R.string.favorite_collections),
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier
                    .paddingFromBaseline(top = 40.dp, bottom = 16.dp)
                    .padding(start = 16.dp)
            )

            vm.favoriteCardList.value?.let {
                Log.e("wolf", "BasicLayoutDemo: item = $it")
                LazyHorizontalGrid(
                    rows = GridCells.Fixed(2),
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = modifier.height(168.dp)
                ) {
                    items(it) { item ->
                        FavoriteCard(item = item)
                    }
                }
            }

            Text(
                text = stringResource(id = R.string.placeholder_search),
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier
                    .paddingFromBaseline(top = 40.dp, bottom = 16.dp)
                    .padding(start = 16.dp)
            )

           Surface (modifier = modifier.heightIn(500.dp) , color = Color.Red){

           }

        }
    }

    @Preview
    @Composable
    fun PreviewBasicLayoutDemo() {
        BasicLayoutDemo()
    }


}


