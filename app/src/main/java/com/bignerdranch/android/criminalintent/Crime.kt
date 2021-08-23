package com.bignerdranch.android.criminalintent

import android.provider.ContactsContract
import java.util.*

data class Crime(val id:UUID = UUID.randomUUID(),
                 var title:String = "",
                 var date: Date = Date(),
                 var isSolved:Boolean = false,
                ) {
    companion object {
        const val TYPE_1 = 0
        const val TYPE_2 = 1
    }
}