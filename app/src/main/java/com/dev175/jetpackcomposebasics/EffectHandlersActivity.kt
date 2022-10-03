package com.dev175.jetpackcomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import com.dev175.jetpackcomposebasics.ui.theme.JetPackComposeBasicsTheme
import kotlinx.coroutines.delay

class EffectHandlersActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var text by remember {
                mutableStateOf("")
            }

            JetPackComposeBasicsTheme {

                LaunchedEffect(key1 = text){
                    delay(1000L)
                    println("")
                }

            }
        }
    }
}

/**
 * 1. Launched Effect
 * 2. RememberCoroutineScope
 * 3. RememberUpdateState
 * 4. DisposableEffect
 * 5. SideEffect
 * */
