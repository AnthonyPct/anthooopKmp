@file:OptIn(ExperimentalResourceApi::class)

package com.anthooop.paletpro.core.ui.component

import Spacing
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.anthooop.paletpro.core.ui.theme.ButtonIconSize
import com.anthooop.paletpro.core.ui.theme.PrimaryButtonHeight
import com.anthooop.paletpro.core.ui.theme.PrimaryMediumButtonHeight
import com.anthooop.paletpro.core.ui.theme.PrimarySmallButtonHeight
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean = true,
    leadingIconResId: String? = null,
    trailingIconResId: String? = null,
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    onClick: () -> Unit = {},
) {
    Button(
        modifier = modifier.height(PrimaryButtonHeight),
        colors = ButtonDefaults.buttonColors(),
        contentPadding = contentPadding,
        shape = MaterialTheme.shapes.small,
        enabled = enabled,
        onClick = onClick,
    ) {
        leadingIconResId?.let {
            Icon(
                modifier = Modifier.padding(horizontal = Spacing.medium.dp),
                painter = painterResource(res = it),
                contentDescription = it,
            )
        }
        Text(text = text, style = MaterialTheme.typography.labelLarge)
        trailingIconResId?.let {
            Icon(
                modifier = Modifier.padding(horizontal = Spacing.medium.dp),
                painter = painterResource(res = it),
                contentDescription = it,
            )
        }
    }
}

@Composable
fun PrimaryMediumButton(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean = true,
    leadingIconResId: String? = null,
    trailingIconResId: String? = null,
    onClick: () -> Unit = {},
) {
    Button(
        modifier = modifier.height(PrimaryMediumButtonHeight),
        colors = ButtonDefaults.buttonColors(),
        contentPadding = PaddingValues(horizontal = Spacing.xLarge.dp),
        shape = MaterialTheme.shapes.small,
        enabled = enabled,
        onClick = onClick,
    ) {
        leadingIconResId?.let {
            Icon(
                modifier = Modifier.padding(horizontal = Spacing.medium.dp),
                painter = painterResource(res = it),
                contentDescription = it,
            )
        }
        Text(text = text, style = MaterialTheme.typography.labelMedium)
        trailingIconResId?.let {
            Icon(
                modifier = Modifier.padding(horizontal = Spacing.medium.dp),
                painter = painterResource(res = it),
                contentDescription = it,
            )
        }
    }
}

@Composable
fun PrimarySmallButton(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean = true,
    leadingIconResIcon: String? = null,
    trailingIconResId: String? = null,
    onClick: () -> Unit = {},
) {
    Button(
        modifier = modifier.height(PrimarySmallButtonHeight),
        colors = ButtonDefaults.buttonColors(),
        contentPadding = PaddingValues(Spacing.small.dp),
        shape = MaterialTheme.shapes.extraSmall,
        enabled = enabled,
        onClick = onClick,
    ) {
        leadingIconResIcon?.let {
            Icon(
                modifier = Modifier.padding(horizontal = Spacing.large.dp),
                painter = painterResource(res = it),
                contentDescription = it,
            )
        }
        Text(text = text, style = MaterialTheme.typography.labelSmall)
        trailingIconResId?.let {
            Icon(
                modifier = Modifier.padding(horizontal = Spacing.medium.dp),
                painter = painterResource(res = it),
                contentDescription = it,
            )
        }
    }
}

@Composable
fun LoadingButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
) {
    Button(
        modifier = modifier,
        shape = MaterialTheme.shapes.small,
        colors = ButtonDefaults.buttonColors(
            disabledContainerColor = MaterialTheme.colorScheme.primaryContainer,
        ),
        contentPadding = PaddingValues(Spacing.medium.dp),
        enabled = false,
        onClick = onClick,
    ) {
//        CaptureCircularProgressInfiniteBar()
    }
}

@Composable
fun OutlinePrimaryButton(
    modifier: Modifier = Modifier,
    text: String? = null,
    icon: String? = null,
    enabled: Boolean = true,
    onClick: () -> Unit = {},
) {
    OutlinedButton(
        modifier = modifier.height(PrimaryButtonHeight),
        contentPadding = PaddingValues(Spacing.medium.dp),
        border = BorderStroke(
            width = 1.dp,
            color = MaterialTheme.colorScheme.primary,
        ),
        shape = MaterialTheme.shapes.small,
        enabled = enabled,
        onClick = onClick,
    ) {
        if (icon != null) {
            Icon(
                painterResource(res = icon),
                contentDescription = text,
                modifier = Modifier.size(ButtonIconSize),
            )
        }
        if (icon != null && text != null) {
            Spacer(modifier = Modifier.width(Spacing.medium.dp))
        }
        if (text != null) {
            Text(text, style = MaterialTheme.typography.labelLarge)
        }
    }
}

@Composable
fun LoadingButtonOutline(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
) {
    OutlinedButton(
        modifier = modifier,
        contentPadding = PaddingValues(Spacing.medium.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            disabledContainerColor = MaterialTheme.colorScheme.surfaceVariant,
            disabledContentColor = MaterialTheme.colorScheme.onSurfaceVariant,
        ),
        shape = MaterialTheme.shapes.small,
        onClick = onClick,
    ) {
//        CaptureCircularProgressInfiniteBar()
    }
}

@Composable
fun OutlineRedButton(
    modifier: Modifier = Modifier,
    text: String? = null,
    icon: String? = null,
    onClick: () -> Unit = {},
) {
    OutlinedButton(
        modifier = modifier,
        shape = MaterialTheme.shapes.small,
        colors = ButtonDefaults.outlinedButtonColors(
            disabledContainerColor = MaterialTheme.colorScheme.surfaceVariant,
            disabledContentColor = MaterialTheme.colorScheme.onSurfaceVariant,
            contentColor = MaterialTheme.colorScheme.error,
        ),
        contentPadding = PaddingValues(Spacing.medium.dp),
        border = BorderStroke(
            width = 1.dp,
            color = MaterialTheme.colorScheme.error,
        ),
        onClick = onClick,
    ) {
        if (icon != null) {
            Icon(
                painterResource(res = icon),
                contentDescription = text,
                modifier = Modifier.size(ButtonIconSize),
            )
        }
        if (icon != null && text != null) {
            Spacer(modifier = Modifier.width(Spacing.medium.dp))
        }
        if (text != null) {
            Text(text, style = MaterialTheme.typography.labelLarge)
        }
    }
}

@Composable
fun PrimaryFloatingActionButton(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    contentDescription: String = "",
    onClick: () -> Unit = {},
) {
    FloatingActionButton(
        modifier = modifier,
        onClick = onClick,
        shape = MaterialTheme.shapes.medium,
        containerColor = MaterialTheme.colorScheme.primary,
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
        )
    }
}