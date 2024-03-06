package com.example.testcasesbychzcode.utils.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview



@Composable()
fun ComposeDesing(name: String) {
Column(
    modifier = Modifier
        .background(Color.Red)
        .wrapContentWidth()

) {
Text(text = name)

}
}

@Composable
fun RenderItem(){
    val list = mutableListOf<DemoData>()
    list.add(DemoData("first"))
    list.add(DemoData("second"))
    list.add(DemoData("third"))
    list.add(DemoData("fourth"))

    LazyColumn() {
        items(items = list) { data ->
            ComposeDesing(data.name)
        }
    }


}


data class DemoData(
    var name:String
)