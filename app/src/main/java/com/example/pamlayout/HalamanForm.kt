package com.example.pamlayout

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanFrom(
    onSubmitButtonClicked: (MutableList<String>) -> Unit
){
    var namaTxt by remember { mutableStateOf("") }
    var almtTxt by remember { mutableStateOf("") }
    var tlpnTxt by remember { mutableStateOf("") }

}