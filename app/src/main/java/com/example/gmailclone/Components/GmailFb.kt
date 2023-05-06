package com.example.gmailclone.Components

import androidx.compose.foundation.ScrollState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp


@Composable
fun GmailFb(scrollState: ScrollState) {
    if(scrollState.value>100){
        ExtendedFloatingActionButton(
            text = {
                   Text(text ="Compose", fontSize = 16.sp )
                   },
            onClick = { /*TODO*/ },
            icon={
                Icon(imageVector =Icons.Default.Edit,"" )
            },
            backgroundColor = MaterialTheme.colors.primaryVariant
        )
    }
    else{

        FloatingActionButton(
            onClick = {},
            backgroundColor = MaterialTheme.colors.primaryVariant,


        ) {
            Icon(imageVector = Icons.Default.Edit, "")

        }
    }



}






