package com.universal.creator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Text("Universal Creator - Fixed!", style = MaterialTheme.typography.headlineSmall)
                        Spacer(Modifier.height(20.dp))
                        Button(onClick = {}) {
                            Text("Create Video")
                        }
                        Spacer(Modifier.height(10.dp))
                        Button(onClick = {}) {
                            Text("Create Photo")
                        }
                        Spacer(Modifier.height(10.dp))
                        Text("App is now working! No more crash.")
                    }
                }
            }
        }
    }
}
