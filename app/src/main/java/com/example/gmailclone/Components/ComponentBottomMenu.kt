package com.example.gmailclone.Components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.gmailclone.Model.ModelBottomMenu

@Composable
fun ComponentBottonMenu(){
    val items= listOf(
        ModelBottomMenu.Mail,
        ModelBottomMenu.Meet
    )
    BottomNavigation(backgroundColor = Color.White, contentColor = Color.Black) {
        items.forEach{
            BottomNavigationItem(
                label = { Text(text = it.title)},
                alwaysShowLabel = true,
                selected = false, onClick = { /*TODO*/ },
                icon = {Icon(imageVector=it.icon,contentDescription=it.title)}

                )

        }
        
    }
}
