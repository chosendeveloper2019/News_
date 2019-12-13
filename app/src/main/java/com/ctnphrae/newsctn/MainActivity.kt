package com.ctnphrae.newsctn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        supportActionBar?.hide()
//
//        web_show.webViewClient =  WebViewClient()
//        web_show.settings.javaScriptEnabled = true
//
//        web_show.loadUrl("file:///android_asset/showList.html")

        supportActionBar?.hide()
        wb_result.webViewClient = WebViewClient()
        wb_result.settings.javaScriptEnabled = true

        var url = "file:///android_asset/showList.html"
        wb_result.loadUrl(url)

    }
}
