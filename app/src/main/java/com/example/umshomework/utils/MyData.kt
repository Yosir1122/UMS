package com.example.umshomework.utils

import com.example.umshomework.models.MyInfo

object MyData {
    val tarifList= listOf(
        MyInfo("UMS 10","Zor","*102*10#"),
        MyInfo("UMS 20","Zor","*102*20#"),
        MyInfo("UMS 30","Zor","*102*30#"),
        MyInfo("UMS 40","Zor","*102*40#")
    )
    val daqiqaList= listOf(
        MyInfo("UMS 100 daqiqa","100 daqiqa","*100*10#"),
        MyInfo("UMS 200 daqiqa","200 daqiqa","*100*20#"),
        MyInfo("UMS 300","300 daqiqa","*100*30#"),
        MyInfo("UMS 400","400 daqiqa","*100*40#")
    )
    val smsList= listOf(
        MyInfo("UMS 100 Sms","100 Sms","*101*10#"),
        MyInfo("UMS 200 Sms","200 Sms","*101*20#"),
        MyInfo("UMS 300 Sms","300 Sms","*101*30#"),
        MyInfo("UMS 400 Sms","400 Sms","*101*40#")
    )
    val internetList= listOf(
        MyInfo("UMS 10000 MB","10000 MB","*103*10#"),
        MyInfo("UMS 50000 MB","50000 MB","*103*50#"),
        MyInfo("UMS 75000 MB","75000 MB","*103*75#"),
        MyInfo("UMS 100000 MB","100000 MB","*103*100#")
    )
}