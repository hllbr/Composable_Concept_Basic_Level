package com.example.composekotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composekotlin.ui.theme.ComposeKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
       /*     ComposeKotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }*/

        }
        //testFunction(5,::testFuctionLambda) altertatifi bulunuyor
        testFunction(5){
            testFuctionLambda()
        }
    }
    fun testFunction(int : Int,myFunction: ()->Unit){
        /*
        lambda fonksiyonun parametre olarak başka bir fonksiyonu alması olarak ifade edilebilir.

         */
        myFunction.invoke()
    }
    fun testFuctionLambda(){
        println("test")
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeKotlinTheme {
        Greeting("Hllbr")
    }
}
/*
Jetpack Compose =

Androidin ilerleyen yıllardaki geleceği oalrak adlandırılıyor.
özellikle kullanıcı arayüzleri yaparken kolaylıklar sağlaması planlanıyor.
2021 MART itibariyle Beta sürümüne geçildi ve kullanılır hale geldi
artık xlm yerine kotlin kodu kullanarak uygulamaları yazabilecek ve arayüz yapabilecek duruma gelmek olarak ifade edebiliriz.

 */