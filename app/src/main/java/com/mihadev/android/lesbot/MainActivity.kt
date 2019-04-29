package com.mihadev.android.lesbot

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import com.mihadev.android.lesbot.Quotes.QUOTES

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getRandomQuote(view: View) {
        val quote = QUOTES.random()
        val mainTextView = findViewById<TextView>(R.id.quote)
        val bookView = findViewById<TextView>(R.id.book)
        val book = quote.book.bookName
        bookView.setText(book)
        val text = quote.text
        mainTextView.setText(text)
    }
}
