package com.example.praktikumpam_fairuz

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun HalamanUtama() {

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // Menampilkan profil mahasiswa
        ProfilMahasiswa()

        Spacer(
            modifier = Modifier.height(24.dp)
        )

        // Tombol untuk membuka WhatsApp
        Button(
            onClick = {
                val intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("whatsapp://send?text=Halo%20Fairuz")
                )

                intent.setPackage("com.whatsapp")

                context.startActivity(intent)
            }
        ) {
            Text(
                text = "Hubungi via WhatsApp"
            )
        }
    }
}