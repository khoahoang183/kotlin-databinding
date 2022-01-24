package com.example.demo_kotlin_databinding.util

import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("showIf10Likes")
fun showIf10Likes(view: View, likes: Int) {
    view.visibility = if (likes >= 10)
        View.VISIBLE
    else
        View.INVISIBLE
}

