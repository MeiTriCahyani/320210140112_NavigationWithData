package com.example.pamlayout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanFrom(
    onSubmitButtonClicked: (MutableList<String>) -> Unit
){
    var namaTxt by remember { mutableStateOf("") }
    var almtTxt by remember { mutableStateOf("") }
    var tlpnTxt by remember { mutableStateOf("") }

    var listData: MutableList<String> = mutableListOf(namaTxt, almtTxt, tlpnTxt)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {

    }

}