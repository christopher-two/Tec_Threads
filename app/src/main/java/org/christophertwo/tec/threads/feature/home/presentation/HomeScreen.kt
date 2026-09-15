package org.christophertwo.tec.threads.feature.home.presentation

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ContainedLoadingIndicator
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Surface
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
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import org.christophertwo.tec.threads.core.ui.AppTheme

@Composable
fun HomeRoot(
    viewModel: HomeViewModel = HomeViewModel()
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    HomeScreen(
        state = state,
        onAction = viewModel::onAction
    )
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
private fun HomeScreen(
    state: HomeState,
    onAction: (HomeAction) -> Unit,
) {
    var isLoading by remember { mutableStateOf(false) }

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        AsyncImage(
            model = "https://images.unsplash.com/photo-1787478764770-ab0a0022a8f2?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Box {
            Text(
                text = "Viaja",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontSize = 60.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    drawStyle = Stroke(
                        miter = 10f,
                        width = 5f,
                        join = StrokeJoin.Round
                    )
                )
            )
            Text(
                text = "Viaja",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontSize = 60.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorScheme.primaryContainer
                )
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        TextField(
            value = state.searchText,
            onValueChange = { onAction(HomeAction.OnSearchTextChange(it)) },
            label = { Text("Correo") }
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Crossfade(isLoading) {
            if (!it) {
                Button(
                    onClick = {
                        isLoading = !isLoading
                    }
                ) {
                    Text("Log In")
                }
            } else {
                ContainedLoadingIndicator()
            }
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Composable
@Preview
private fun Preview() {
    AppTheme {
        HomeScreen(
            onAction = {},
            state = HomeState(),
        )
    }
}