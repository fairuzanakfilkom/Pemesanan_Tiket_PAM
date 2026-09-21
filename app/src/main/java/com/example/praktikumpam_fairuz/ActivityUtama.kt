package com.example.praktikumpam_fairuz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.praktikumpam_fairuz.ui.theme.PraktikumPAM_FairuzTheme

class ActivityUtama : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            PraktikumPAM_FairuzTheme {

                val angka = 5

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Text(
                        text = "Tugas Praktikum Compose",
                        fontSize = 24.sp
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Gambar dari internet
                    AsyncImage(
                        model = "https://picsum.photos/800/600",
                        contentDescription = null,
                        placeholder = painterResource(
                            R.drawable.baseline_10mp_24
                        ),
                        error = painterResource(
                            R.drawable.baseline_10mp_24
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    val hasil = 100 / angka

                    Text(
                        text = "Hasil: $hasil"
                    )
                }
            }
        }
    }
}