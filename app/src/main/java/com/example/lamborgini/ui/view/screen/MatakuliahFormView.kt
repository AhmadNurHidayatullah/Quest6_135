package com.example.lamborgini.ui.view.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.lamborgini.ui.model.Mahasiswa

@Composable
fun MatakuliahView(
    uiState: Mahasiswa,
    onSimpanButtonClicked: (MutableList<String>) -> Unit
) {
    var mataKuliah by remember { mutableStateOf("") }
    var selectedKelas by remember { mutableStateOf("") }
    val listData: MutableList<String> = mutableListOf()
}