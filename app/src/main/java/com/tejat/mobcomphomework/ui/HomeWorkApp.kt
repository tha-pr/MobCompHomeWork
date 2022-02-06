package com.tejat.mobcomphomework.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.tejat.mobcomphomework.HomeWorkAppState
import com.tejat.mobcomphomework.rememberHomeWorkAppState
import com.tejat.mobcomphomework.ui.home.Home
import com.tejat.mobcomphomework.ui.login.Login
import com.tejat.mobcomphomework.ui.message.Message_Add
import com.tejat.mobcomphomework.ui.message.ViewProfile


@Composable
fun HomeWorkApp(
    appstate: HomeWorkAppState = rememberHomeWorkAppState()
) {
    NavHost(
        navController = appstate.navController,
        startDestination = "login"
    ) {
        composable(route= "login") {
            Login(navController = appstate.navController)
        }
        composable(route = "home") {
            Home(navController = appstate.navController)
        }
        composable(route = "message_add") {
            Message_Add(onBackPress = appstate::navigateBack)
        }
        composable(route = "profileview" +
                "") {
            ViewProfile(onBackPress = appstate::navigateBack)
        }
    }
}

