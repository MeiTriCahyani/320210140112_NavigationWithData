package com.example.pamlayout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp


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
        OutlinedTextField(value = namaTxt, onValueChange = { namaTxt = it }, label = {
            Text(text = stringResource(id = R.string.name))
        })
        OutlinedTextField(value = tlpnTxt, onValueChange = { tlpnTxt = it }, label = {
            Text(text = stringResource(id = R.string.nohp))
        })
        OutlinedTextField(value = almtTxt, onValueChange = { almtTxt = it }, label = {
            Text(text = stringResource(id = R.string.almt))

            Text(text = stringResource(id = R.string.almt))

        })
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = {onSubmitButtonClicked(listData)}) {
            Text(text = stringResource(id = R.string.confrim))
        }

    }

}