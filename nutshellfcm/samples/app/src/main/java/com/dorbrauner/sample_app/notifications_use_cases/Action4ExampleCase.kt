package com.dorbrauner.sample_app.notifications_use_cases

import com.dorbrauner.nutshellfcm.NutshellFCMContract
import com.dorbrauner.nutshellfcm.model.NotificationMessage


class Action4ExampleCase : NutshellFCMContract.NotificationsHandling.Case {

    override val actionIds: List<String> = listOf("Action 4")

    override fun consume(caseMessages: List<NotificationMessage>) {
        //Do something
    }
}