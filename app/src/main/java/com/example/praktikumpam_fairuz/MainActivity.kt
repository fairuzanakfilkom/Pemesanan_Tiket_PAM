package com.example.praktikumpam_fairuz

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikumpam_fairuz.ui.theme.PraktikumPAM_FairuzTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("LifecycleFairuz", "onCreate")

        setContent {
            PraktikumPAM_FairuzTheme {
                PemesananTiket()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifecycleFairuz", "onResume - Resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifecycleFairuz", "onPause - Paused")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifecycleFairuz", "onStop - Stopped")
    }
}

@Composable
fun PemesananTiket() {

    val hargaTiket = 25000
    var jumlahTiket by remember { mutableStateOf(1) }

    val totalBayar = hargaTiket * jumlahTiket

    val blueColor = Color(0xFF2196F3)
    val greenColor = Color(0xFF168A4A)
    val redColor = Color(0xFFEF4444)
    val backgroundColor = Color(0xFFF3F7FC)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
    ) {

        // =========================
        // HEADER
        // =========================
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    blueColor,
                    RoundedCornerShape(
                        bottomStart = 30.dp,
                        bottomEnd = 30.dp
                    )
                )
                .padding(
                    top = 42.dp,
                    bottom = 34.dp,
                    start = 24.dp,
                    end = 24.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "🎟",
                fontSize = 44.sp
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Pemesanan Tiket",
                color = Color.White,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Pesan tiket dengan mudah!",
                color = Color.White.copy(alpha = 0.9f),
                fontSize = 14.sp
            )
        }

        // =========================
        // AREA KONTEN
        // =========================
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(
                    start = 18.dp,
                    end = 18.dp,
                    top = 18.dp,
                    bottom = 8.dp
                ),
            verticalArrangement = Arrangement.Center
        ) {

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(13.dp)
            ) {

                // =========================
                // HARGA TIKET
                // =========================
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(105.dp),
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 3.dp
                    )
                ) {

                    Column(
                        modifier = Modifier.padding(18.dp)
                    ) {

                        Text(
                            text = "Harga Tiket",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF374151)
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Rp25.000",
                            fontSize = 27.sp,
                            fontWeight = FontWeight.Bold,
                            color = blueColor
                        )

                        Text(
                            text = "Harga per tiket",
                            fontSize = 12.sp,
                            color = Color(0xFF9CA3AF)
                        )
                    }
                }

                // =========================
                // JUMLAH TIKET
                // =========================
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(115.dp),
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 3.dp
                    )
                ) {

                    Column(
                        modifier = Modifier.padding(18.dp)
                    ) {

                        Text(
                            text = "Jumlah Tiket",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF374151)
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Button(
                                onClick = {
                                    if (jumlahTiket > 1) {
                                        jumlahTiket--
                                    }
                                },
                                modifier = Modifier.size(48.dp),
                                shape = RoundedCornerShape(15.dp),
                                contentPadding = androidx.compose.foundation.layout.PaddingValues(0.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = blueColor
                                )
                            ) {
                                Text(
                                    text = "−",
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(horizontal = 12.dp)
                                    .background(
                                        Color(0xFFF1F5F9),
                                        RoundedCornerShape(13.dp)
                                    )
                                    .height(48.dp),
                                contentAlignment = Alignment.Center
                            ) {

                                Text(
                                    text = jumlahTiket.toString(),
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF1F2937)
                                )
                            }

                            Button(
                                onClick = {
                                    jumlahTiket++
                                },
                                modifier = Modifier.size(48.dp),
                                shape = RoundedCornerShape(15.dp),
                                contentPadding = androidx.compose.foundation.layout.PaddingValues(0.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = blueColor
                                )
                            ) {
                                Text(
                                    text = "+",
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }

                // =========================
                // TOTAL
                // =========================
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(105.dp),
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 3.dp
                    )
                ) {

                    Column(
                        modifier = Modifier.padding(18.dp)
                    ) {

                        Text(
                            text = "Total Pembayaran",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF374151)
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Rp${String.format("%,d", totalBayar).replace(',', '.')}",
                            fontSize = 27.sp,
                            fontWeight = FontWeight.Bold,
                            color = greenColor
                        )

                        Text(
                            text = "$jumlahTiket tiket × Rp25.000",
                            fontSize = 12.sp,
                            color = Color(0xFF9CA3AF)
                        )
                    }
                }

                // =========================
                // RINGKASAN
                // =========================
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(92.dp),
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 3.dp
                    )
                ) {

                    Column(
                        modifier = Modifier.padding(18.dp)
                    ) {

                        Text(
                            text = "Ringkasan Pesanan",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF374151)
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {

                            Text(
                                text = "Jumlah tiket",
                                fontSize = 12.sp,
                                color = Color(0xFF6B7280)
                            )

                            Text(
                                text = "$jumlahTiket tiket",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Color(0xFF1F2937)
                            )
                        }

                        Spacer(modifier = Modifier.height(5.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {

                            Text(
                                text = "Total",
                                fontSize = 12.sp,
                                color = Color(0xFF6B7280)
                            )

                            Text(
                                text = "Rp${String.format("%,d", totalBayar).replace(',', '.')}",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = greenColor
                            )
                        }
                    }
                }

                // =========================
                // RESET
                // =========================
                Button(
                    onClick = {
                        jumlahTiket = 1
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp),
                    shape = RoundedCornerShape(14.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = redColor
                    )
                ) {

                    Text(
                        text = "↻  RESET",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }
        }

        // =========================
        // FOOTER
        // =========================
        Text(
            text = "Pesan • Bayar • Mudah",
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp),
            textAlign = TextAlign.Center,
            fontSize = 12.sp,
            color = Color(0xFF9CA3AF)
        )
    }
}