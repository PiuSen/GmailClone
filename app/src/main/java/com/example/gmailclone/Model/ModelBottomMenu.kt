package com.example.gmailclone.Model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.MeetingRoom
import androidx.compose.material.icons.outlined.VideoCall
import androidx.compose.ui.graphics.vector.ImageVector

sealed class ModelBottomMenu (
    val icon:ImageVector,
    val title:String
)
{
    object Mail:ModelBottomMenu(icon = Icons.Outlined.Mail,"Mail")
     object Meet:ModelBottomMenu(icon = Icons.Outlined.VideoCall,"Meet")

}