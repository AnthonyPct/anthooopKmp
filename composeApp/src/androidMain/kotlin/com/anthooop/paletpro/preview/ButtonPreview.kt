package com.anthooop.paletpro.preview

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.anthooop.paletpro.core.ui.component.LoadingButton
import com.anthooop.paletpro.core.ui.component.LoadingButtonOutline
import com.anthooop.paletpro.core.ui.component.OutlinePrimaryButton
import com.anthooop.paletpro.core.ui.component.OutlineRedButton
import com.anthooop.paletpro.core.ui.component.PrimaryButton
import com.anthooop.paletpro.core.ui.component.PrimaryFloatingActionButton
import com.anthooop.paletpro.core.ui.component.PrimaryMediumButton
import com.anthooop.paletpro.core.ui.component.PrimarySmallButton
import com.anthooop.paletpro.core.ui.theme.PaletProTheme

// /////////////////////////////////////////////////////////////////////////
// PREVIEW
// /////////////////////////////////////////////////////////////////////////

@Preview
@Composable
private fun PrimaryButtonPreview() {
    PaletProTheme {
        PrimaryButton(text = "Enregistrer")
    }
}

@Preview
@Composable
private fun PrimaryMediumButtonPreview() {
    PaletProTheme {
        PrimaryMediumButton(text = "Valider")
    }
}

@Preview
@Composable
private fun PrimarySmallButtonPreview() {
    PaletProTheme {
        PrimarySmallButton(text = "Valider")
    }
}

@Preview
@Composable
private fun PrimaryButtonLeadingIconPreview() {
    PrimaryButton(
        text = "Créer un projet",
        leadingIconResId = null
    )
}

@Preview
@Composable
private fun PrimaryButtonTrailingIconPreview() {
    PrimaryButton(
        text = "Créer un projet",
        trailingIconResId = null
    )
}

@Preview
@Composable
private fun PrimaryButtonDisabledPreview() {
    PrimaryButton(
        text = "Valider",
        enabled = false,
    )
}

@Preview
@Composable
private fun LoadingButtonPreview() {
    LoadingButton()
}

@Preview
@Composable
private fun OutlineButtonPreview() {
    PaletProTheme {
        OutlinePrimaryButton(
            text = "Valider",
        )
    }
}

@Preview
@Composable
private fun LoadingOutlineButtonPreview() {
    PaletProTheme {
        LoadingButtonOutline()
    }
}

@Preview
@Composable
private fun BothButton() {
    PaletProTheme {
        Row {
            PrimaryButton(text = "primary")
            OutlinePrimaryButton(text = "outline")
        }
    }
}

@Preview
@Composable
private fun OutlineRedButtonPreview() {
    PaletProTheme {
        OutlineRedButton(
            text = "Se déconnecter",
            icon = null,
        )
    }
}

@Preview
@Composable
private fun FloatingActionButtonPreview() {
    PaletProTheme {
        PrimaryFloatingActionButton(
            icon = Icons.Filled.Add,
        )
    }
}
