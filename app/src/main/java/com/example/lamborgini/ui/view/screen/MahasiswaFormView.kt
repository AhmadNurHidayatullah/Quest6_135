package com.example.lamborgini.ui.view.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun MahasiswaFormView(
    onSubmitButtonCliked: (MutableList<String>)-> Unit,
    onBackButtonCliked: () -> Unit
){

    var nim by remember { mutableStateOf("") }
    var nama by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    val listData: MutableList<String> = mutableListOf(nim,nama,email)
    }