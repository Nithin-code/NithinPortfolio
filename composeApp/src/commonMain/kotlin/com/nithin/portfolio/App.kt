package com.nithin.portfolio

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.nithin.portfolio.model.DisplayResult
import com.nithin.portfolio.model.HomeData
import com.nithin.portfolio.utils.SurfaceBackGround
import com.nithin.portfolio.utils.getDeviceType
import com.nithin.portfolio.view.ResponsiveLayout
import com.nithin.portfolio.view.components.ProgressBar
import com.nithin.portfolio.viewmodel.HomeViewModel
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import nithinportfolio.composeapp.generated.resources.Res
import nithinportfolio.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {

    val viewModel = remember {
        HomeViewModel()
    }

    MaterialTheme {
        Scaffold { paddingValues ->


            viewModel
                .uiState
                .DisplayResult(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(SurfaceBackGround)
                        .padding(paddingValues),
                    onError = {

                    },
                    onSuccess = {
                        BoxWithConstraints {

                            val deviceType = maxWidth.getDeviceType()

                            ResponsiveLayout(
                                homeData = HomeData(),
                                deviceType = deviceType
                            )

                        }
                    },
                    onLoading = {
                        ProgressBar()
                    }
                )

        }
    }
}

expect fun downloadFile(url: String, fileName: String)