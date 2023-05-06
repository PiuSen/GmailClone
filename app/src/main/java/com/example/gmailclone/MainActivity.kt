package com.example.gmailclone

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gmailclone.Components.*
import com.example.gmailclone.ui.theme.GmailcloneTheme
import com.example.gmailclone.Components.MailList as MailList1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GmailcloneTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GmailApp()
                }
            }
        }
    }
}


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun GmailApp() {
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val scrollState = rememberScrollState()
    val openDialog=remember{
        mutableStateOf(false)

    }
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { HomeBar(scaffoldState, coroutineScope,openDialog) },
        drawerContent = {
            GmailDrawer(scrollState)
        },
        bottomBar = {
            ComponentBottonMenu()

        },
        floatingActionButton = { GmailFb(scrollState) }

    ) {

        MailList1(it,scrollState)
        }


    }



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GmailcloneTheme {
        GmailApp()
    }
}