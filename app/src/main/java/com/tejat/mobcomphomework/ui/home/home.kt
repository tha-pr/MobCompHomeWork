package com.tejat.mobcomphomework.ui.home

import android.location.Location
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.accompanist.insets.systemBarsPadding
import java.sql.Timestamp
import kotlin.system.exitProcess

data class TempList(
    val timestamp: Int,
    val reminder: String,
    val location: String
)

val TempItems = listOf(
    TempList(
        1,
        "Item1",
        "location1"
    ),
    TempList(
        2,
        "Item2",
        "location2"
    )
)

@Composable
fun Home(
    navController: NavController
) {
    Scaffold(
        modifier = Modifier.padding(bottom = 24.dp),
        floatingActionButton = {
            FloatingActionButton(
                onClick = {navController.navigate("message_add") },
                contentColor = Color.Blue,
                modifier = Modifier.padding(all = 20.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null
                )
            }
        }
    )  {
        Column(
            modifier = Modifier
                .systemBarsPadding()
                .fillMaxWidth()
        ) {
            val appBarColor = MaterialTheme.colors.secondary.copy(alpha = 0.87f)

            HomeAppBar(
                navController = navController,
                backgroundColor = appBarColor
            )
            NotificationList(
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

@Composable
private fun HomeAppBar(
    backgroundColor: Color,
    navController: NavController
) {
    TopAppBar(
        title = {
            Text(
                text = "Notifications",
                color = MaterialTheme.colors.primary,
                modifier = Modifier
                    .padding(start = 4.dp)
                    .heightIn(max = 24.dp)
            )
        },
        backgroundColor = backgroundColor,
        actions = {
            IconButton( onClick = { navController.navigate("profileview") } ) {
                Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "")//stringResource(R.string.account)
            }
            IconButton( onClick = { exitProcess(0) } ) {
                Icon(imageVector = Icons.Filled.Close, contentDescription = "")//stringResource(R.string.account)
            }
        }
    )
}

@Composable
private fun NotificationList(
    modifier: Modifier = Modifier
) {
    LazyColumn(
        contentPadding = PaddingValues(0.dp),
        verticalArrangement = Arrangement.Center
    ) {
        items(TempItems) {
                Text("Item: $it")
        }
    }
}