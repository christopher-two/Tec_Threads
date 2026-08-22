package org.christophertwo.tec.threads.feature.optimizer.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class OptimizerViewModel : ViewModel() {
    private val _state: MutableStateFlow<OptimizerState> = MutableStateFlow(OptimizerState())
    val state: StateFlow<OptimizerState> = _state.asStateFlow()

    init {

    }

    fun onAction(action: OptimizerAction) {
        when (action) {
            else -> {}
        }
    }
}
