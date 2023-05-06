package com.example.gmailclone.Components

import android.content.ClipData.Item
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun GmailDrawer(scrollState: ScrollState){
    val menulist= listOf(
        DrawerMenu.AllInboxes,
        DrawerMenu.Divider,
        DrawerMenu.Primaryi,
        DrawerMenu.Promotionsi,
        DrawerMenu.Socials,
        DrawerMenu.HeaderOne,
        DrawerMenu.Starrtede,
        DrawerMenu.Snoozeded,
        DrawerMenu.Importants,
        DrawerMenu.Sents,
        DrawerMenu.Scheduledd,
        DrawerMenu.Outboxes,
        DrawerMenu.Draftss,
        DrawerMenu.AllMails,
        DrawerMenu.Spams,
        DrawerMenu.Bins,
        DrawerMenu.HeaderTwo,
        DrawerMenu.Calendars,
        DrawerMenu.Contactss,
        DrawerMenu.Divider,
        DrawerMenu.Settingss,
        DrawerMenu.HelpFeedback


    )
    Column(Modifier.verticalScroll(scrollState)) {
        Text(text = "Gmail", color = Color.Red,
            modifier = Modifier.padding(start = 20.dp, top = 20.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp

        )
        menulist.forEach {
            item->

            when{
                item.isDivider->{
                    Divider(modifier = Modifier.padding(bottom = 20.dp, top = 20.dp))
                }
                item.isHeader->{
                    Text(text = item.title!!, fontWeight = FontWeight.Light,
                        modifier = Modifier.padding(start = 20.dp,top=20.dp, bottom = 20.dp)
                    )
                }
                else->{
                    MailDrawerMenu(item = item)
                }

            }

        }
    }
}
@Composable
fun MailDrawerMenu(item: DrawerMenu){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(top = 16.dp)
    ) {
       Image(imageVector = item.icon!!, contentDescription =item.title!!,
           modifier = Modifier.weight(0.5f)

           )
        Text(text = item.title, modifier = Modifier.weight(2.0f))
    }

}


