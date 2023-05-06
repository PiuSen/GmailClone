package com.example.gmailclone.Components

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.PersonAddAlt
import androidx.compose.material.icons.outlined.ManageAccounts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.gmailclone.Model.Account
import  com.example.gmailclone.R
import java.util.Properties

@Composable
fun AccountDialog(openDialog: MutableState<Boolean>) {


   Dialog(
      onDismissRequest = { openDialog.value = false },
      properties = DialogProperties(dismissOnClickOutside = false)
   )


   {
      AccountDialogUi(openDialog = openDialog)
   }
}
@Composable
fun AccountDialogUi(modifier:Modifier=Modifier,openDialog: MutableState<Boolean>){
   Card {
      Column(
         modifier
            .background(Color.White)
            .padding(bottom = .16.dp)) {
         Row(modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            IconButton(onClick = {openDialog.value=false }) {
               Icon(imageVector = Icons.Default.Close, contentDescription ="" )
               
            }
           Image(painter =  painterResource(id = R.drawable.img),"",
              modifier
                 .size(30.dp)
                 .weight(2.0f)
           )
            
         }
        AccountItem(account = accountList[0])
         Row(modifier.fillMaxWidth(),
            Arrangement.SpaceEvenly) {
            Card(modifier.requiredWidth(150.dp),
               shape = RoundedCornerShape(50.dp),
               border = BorderStroke(1.dp, color = Color.Gray)
            ) {
               Text(text = "Goggle Account",
                  modifier.padding(8.dp),
                  textAlign = TextAlign.Center
               )
               
            }
            Spacer(modifier = Modifier.width(10.dp))
            
         }
         Divider(modifier.padding(top = 16.dp))
         Column {
            AccountItem(accountList[1])
            AccountItem(accountList[2])
            
         }
         AddAccount(icon = Icons.Default.PersonAddAlt, title ="Add Another Account" )
         AddAccount(icon = Icons.Outlined.ManageAccounts, title = "Manage Account Of This Device")
         Divider(modifier=Modifier.padding(top = 16.dp, bottom = 16.dp))
         Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Privacy Policy")
            Card(modifier = Modifier
               .padding(top = 16.dp, bottom = 16.dp)
               .size(3.dp),
               shape = CircleShape,
               backgroundColor = Color.Black
               ) {

            }
            Text(text = "Terms Of Services")

         }
         
      }
      
   }

}
@Composable
fun AccountItem(account: Account) {
   Row(modifier= Modifier
      .fillMaxWidth()
      .padding(start = 16.dp, top = 16.dp)
   ) {
      if(account.icon!=null){
         Image(
            painter = painterResource(id =account.icon), contentDescription = "Profile",
            modifier = Modifier
               .size(30.dp)
               .clip(CircleShape)
               .background(color = Color.Transparent)
               .border(width = 1.dp, color = Color.Black, shape = CircleShape)
         )

      }
      else{
         Card(
            modifier = Modifier
               .padding(end = 8.dp)
               .size(40.dp)
               .clip(CircleShape),
            backgroundColor = Color.Transparent
         ) {
            Text(text = account.username[0].toString(),
               textAlign = TextAlign.Center,
               modifier = Modifier.padding(8.dp)
            )

         }

      }

      Column(modifier= Modifier
         .weight(2.0f)
         .padding(start = 16.dp, bottom = 16.dp)
      ) {
         Text(text = account.username, fontWeight = FontWeight.SemiBold)
         Text(text = account.email)

      }
      Text(text = "${account.unreadEmails}+", modifier = Modifier.padding(end = 16.dp))

   }
}
@Composable
fun AddAccount(icon:ImageVector,title:String){
   Row(modifier = Modifier
      .fillMaxWidth()
      .padding(start = 16.dp)
   
   ) 
   {
      IconButton(onClick = { /*TODO*/ }) {
         Icon(
            imageVector = icon,
            contentDescription ="",
            modifier=Modifier.padding(bottom=8.dp)
         )
         
      }
      Text(text = title, fontWeight = FontWeight.SemiBold,
         modifier = Modifier.padding(top = 8.dp, start = 8.dp)
      )


   }

}

@SuppressLint("UnrememberedMutableState")
@Preview
@Composable
fun ComposeDialogPreview(){
  AccountDialogUi(openDialog = mutableStateOf(false))

}