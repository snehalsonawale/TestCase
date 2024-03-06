package com.example.testcasesbychzcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.testcasesbychzcode.utils.ui.theme.ComposeDesing
import com.example.testcasesbychzcode.utils.ui.theme.RenderItem

class MainActivity22 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      setContent {
          ComposeDesingShow()
      }
    }

@Preview
    @Composable
    private fun ComposeDesingShow() {
    RenderItem()
    }
}