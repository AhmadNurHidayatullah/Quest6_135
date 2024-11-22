package com.example.lamborgini.ui.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lamborgini.R
import com.example.lamborgini.ui.model.Mahasiswa

@Composable
fun TampilView(
    uiState: Mahasiswa,
    onBackButtonClicked: () -> Unit = {},
    onResetButtonClicked: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.primary))
    ) {
        // Header Section
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.harvard),
                contentDescription = "Logo",
                modifier = Modifier.size(80.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = "HARVARD UNIVERSITY",
                    color = Color.Red,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Muda Mendunia UHUYYYYYY",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
        }
    }
}