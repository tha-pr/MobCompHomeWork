package com.tejat.mobcomphomework

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.tejat.mobcomphomework.ui.HomeWorkApp


class HomeWorkAppState(
    val navController: NavHostController
) {
    fun navigateBack() {
        navController.popBackStack()
    }

}

@Composable
fun rememberHomeWorkAppState(
    navController: NavHostController = rememberNavController()
) = remember(navController) {
    HomeWorkAppState(navController)
}