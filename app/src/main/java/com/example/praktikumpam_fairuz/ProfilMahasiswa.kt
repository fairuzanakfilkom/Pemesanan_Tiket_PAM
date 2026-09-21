package com.example.praktikumpam_fairuz

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfilMahasiswa() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // Foto profil berbentuk lingkaran
        Image(
            painter = painterResource(id = R.drawable.foto_fairuz),
            contentDescription = "Foto Profil Fairuz",
            modifier = Modifier
                .size(90.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(
            modifier = Modifier.size(12.dp)
        )

        Text(
            text = "Nama: Fairuz El Fauzy",
            fontSize = 16.sp
        )

        Text(
            text = "NIM: 245150407111032",
            fontSize = 16.sp
        )
    }
}