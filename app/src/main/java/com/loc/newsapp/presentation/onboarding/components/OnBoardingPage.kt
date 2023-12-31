package com.loc.newsapp.presentation.onboarding.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import com.loc.newsapp.R
import com.loc.newsapp.presentation.onboarding.Dimense.hightBtw1
import com.loc.newsapp.presentation.onboarding.Dimense.hightBtw2
import com.loc.newsapp.presentation.onboarding.Page

@Composable
fun OnBoardingPage(
    page: Page
) {
     Column(modifier = Modifier) {
         Image(
             modifier = Modifier
                 .fillMaxWidth()
                 .fillMaxWidth(0.6f),
             painter = painterResource(id = page.image),
             contentDescription = null,
             contentScale = ContentScale.Crop
         )
         Spacer(modifier = Modifier.height(hightBtw1))
         Text(
             modifier = Modifier.padding(horizontal = hightBtw2),
             text = page.title,
             style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
             color = colorResource(id = R.color.display_small)
         )

         Text(
             modifier = Modifier.padding(horizontal = hightBtw2),
             text = page.description,
             style = MaterialTheme.typography.bodyMedium,
             color = colorResource(id = R.color.text_medium)
         )

     }
}

