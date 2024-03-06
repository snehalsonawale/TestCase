package com.example.testcasesbychzcode.utils

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testcasesbychzcode.utils.ui.theme.TestCasesByChzCodeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestCasesByChzCodeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

        NumbersList()

}
@Composable
fun NumbersList() {
    LazyColumn {
        items(1000) { index ->
            Text(text = "Item $index")
        }
    }
}
@Composable
fun NumbersList2() {
    LazyColumn {
        items(1000) { index ->
            Text(
                text = "Item $index",
                modifier = Modifier.clickable {
                    println("Item $index clicked")
                }
            )
        }
    }
}

data class Person(val name: String, val age: Int)

@Composable
fun MyApp() {
    val people = listOf(
        Person("John Doe", 25),
        Person("Jane Smith", 30),
        Person("Alice Johnson", 20),
        Person("Bob Williams", 27)
    )

    PersonList(people)
}

@Composable
fun PersonList(people: List<Person>) {
    LazyColumn {
        items(people.size) {index ->
            val person = people[index]
            Text(text = "Name: ${person.name}, Age: ${person.age}")
        }
    }
}

private val countryList =
    mutableListOf("India", "Pakistan", "China", "United States")

data class FruitModel(val name:String, val image : Int)

private val fruitsList = mutableListOf<FruitModel>()
/*fruitsList.add(FruitModel("Apple", R.drawable.apple))
fruitsList.add(FruitModel("Orange", R.drawable.orange))
fruitsList.add(FruitModel("Banana", R.drawable.banana))
fruitsList.add(FruitModel("Strawberry", R.drawable.strawberry))
fruitsList.add(FruitModel("Mango", R.drawable.mango))*/

@Composable
fun ItemView(index: Int, selected: Boolean, onClick: (Int) -> Unit){
    Text(
        text = "Item $index",
        modifier = Modifier
            .clickable {
                onClick.invoke(index)
            }
            .background(Color.Transparent)
            .fillMaxWidth()
            .padding(12.dp)
    )
}

@Composable
fun LazyColumnWithSelection(){
    var selectedIndex by remember { mutableStateOf(0) }
    val onItemClick = { index: Int -> selectedIndex = index}
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
    ){
        items(100){ index ->
            ItemView(
                index = index,
                selected = selectedIndex == index,
                onClick = onItemClick
            )
        }
    }
}
