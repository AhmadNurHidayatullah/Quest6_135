package com.example.lamborgini.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lamborgini.ui.model.Mahasiswa
import com.example.lamborgini.ui.view.screen.*
import com.example.lamborgini.ui.view.viewmodel.MahasiswaViewModel

enum class Halaman {
    Splash,
    Mahasiswa,
    Matakuliah,
    Tampil
}

@Composable
fun MahasiswaApp(
    modifier: Modifier = Modifier,
    viewModel: MahasiswaViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    val uiState by viewModel.statusUI.collectAsState()
    NavHost(
        navController = navController,
        startDestination = Halaman.Splash.name,
        modifier = modifier.padding()
    ) {
        // Splash Screen
        composable(route = Halaman.Splash.name) {
            SplashView(onMulaiButton = {
                navController.navigate(Halaman.Mahasiswa.name)
            })
        }

        // Mahasiswa Form Screen
        composable(route = Halaman.Mahasiswa.name) {
            MahasiswaFormView(
                onSubmitButtonCliked = { data ->
                    viewModel.saveDataSiswa(data)
                    navController.navigate(Halaman.Matakuliah.name)
                },
                onBackButtonCliked = { navController.popBackStack() }
            )
        }

        // Matakuliah Screen
        composable(route = Halaman.Matakuliah.name) {
            MatakuliahView(
                uiState = uiState,
                onSimpanButtonClicked = { matakuliahData ->
                    viewModel.setMatakuliah(matakuliahData)
                    navController.navigate(Halaman.Tampil.name)
                }
            )
        }

        // Tampil Screen
        composable(route = Halaman.Tampil.name) {
            TampilView(
                uiState = uiState,
                onBackButtonClicked = { navController.popBackStack() },
                onResetButtonClicked = { navController.navigate(Halaman.Splash.name) }
            )
        }
    }
}
