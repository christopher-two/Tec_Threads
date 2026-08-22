package org.christophertwo.tec.threads.feature.optimizer.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.christophertwo.tec.threads.core.ui.AppTheme

@Composable
fun OptimizerRoot(
    viewModel: OptimizerViewModel = OptimizerViewModel()
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    OptimizerScreen(
        state = state,
        onAction = viewModel::onAction
    )
}

@Composable
private fun OptimizerScreen(
    state: OptimizerState,
    onAction: (OptimizerAction) -> Unit,
) {

}

@Composable
@Preview
private fun Preview() {
    AppTheme {
        OptimizerScreen(
            onAction = {},
            state = OptimizerState(),
        )
    }
}
