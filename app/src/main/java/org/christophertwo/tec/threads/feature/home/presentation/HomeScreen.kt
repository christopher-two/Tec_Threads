package org.christophertwo.tec.threads.feature.home.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
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

@Composable
private fun HomeScreen(
    state: HomeState,
    onAction: (HomeAction) -> Unit,
) {

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