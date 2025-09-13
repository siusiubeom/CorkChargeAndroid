package com.ku.corkcharge.navigation

sealed class Route(val route: String) {

    // 맨 시작 로딩 화면
    data object StartScreen: Route(route = "StartScreen")
}