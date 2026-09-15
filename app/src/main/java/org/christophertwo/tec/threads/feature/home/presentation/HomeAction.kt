package org.christophertwo.tec.threads.feature.home.presentation

sealed class HomeAction {
    data class OnSearchTextChange(val text: String) : HomeAction()
}