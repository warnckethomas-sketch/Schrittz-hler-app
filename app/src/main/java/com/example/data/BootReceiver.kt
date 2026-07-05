package com.example.data

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val action = intent.action
        if (action == Intent.ACTION_BOOT_COMPLETED || 
            action == Intent.ACTION_MY_PACKAGE_REPLACED || 
            action == "android.intent.action.QUICKBOOT_POWERON"
        ) {
            val preferencesManager = PreferencesManager(context)
            if (preferencesManager.alarmEnabled) {
                AlarmHelper.scheduleAlarm(
                    context,
                    preferencesManager.alarmHour,
                    preferencesManager.alarmMinute
                )
                Log.d("BootReceiver", "Rescheduled alarm on action: $action")
            }
        }
    }
}
