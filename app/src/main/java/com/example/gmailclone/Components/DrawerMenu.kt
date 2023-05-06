package com.example.gmailclone.Components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector


sealed class DrawerMenu(
    val icon:ImageVector?=null, val title:String?=null,
    val isDivider:Boolean=false, val isHeader:Boolean=false,
){
    object AllInboxes:DrawerMenu(
        icon = Icons.Outlined.AllInbox,
        title="All inboxes"
    )
    object Primaryi:DrawerMenu(
        icon =Icons.Outlined.Inbox,
        title = "Primary"

    )
    object Promotionsi:DrawerMenu(
        icon = Icons.Outlined.Tag,
        title = "Promotions"
    )
    object Socials:DrawerMenu(
        icon = Icons.Outlined.Person,
        title = "Social"
    )
    object Starrtede:DrawerMenu(
        icon = Icons.Outlined.StarOutline,
        title = "Started"
    )
    object Snoozeded:DrawerMenu(
        icon = Icons.Outlined.Snooze,
        title = "Snoozed"
    )
    object Importants:DrawerMenu(
        icon = Icons.Outlined.Label,
        title = "Important"
    )
    object Sents:DrawerMenu(
        icon = Icons.Outlined.Send,
        title = "Sent"
    )
    object Scheduledd:DrawerMenu(
        icon = Icons.Outlined.Schedule,
        title = "Scheduled"
    )
    object Outboxes:DrawerMenu(
        icon = Icons.Outlined.Outbox,
        title = "Outbox"
    )
    object Draftss:DrawerMenu(
        icon = Icons.Outlined.Drafts,
        title = "Drafts"
    )
    object AllMails:DrawerMenu(
        icon = Icons.Outlined.Mail,
        title = "All mails"
    )
    object Spams:DrawerMenu(
        icon = Icons.Outlined.Dangerous,
        title = "Spam"
    )

    object Bins:DrawerMenu(
        icon = Icons.Outlined.Delete,
        title = "Bin"
    )

    object Calendars:DrawerMenu(
        icon = Icons.Outlined.CalendarToday,
        title = "Calendar"
    )
    object Contactss:DrawerMenu(
        icon = Icons.Outlined.Contacts,
        title = "Contacts"
    )
    object Settingss:DrawerMenu(
        icon = Icons.Outlined.Settings,
        title = "Settings"
    )
    object HelpFeedback:DrawerMenu(
        icon = Icons.Outlined.Help,
        title = "Help and feedback"
    )
    object Divider:DrawerMenu(
        isDivider = true
    )
    object HeaderOne:DrawerMenu(
        isHeader = true,
        title = "All lables"

    )
    object HeaderTwo:DrawerMenu(
        isHeader = true,
        title = "Google apps"

    )
}

