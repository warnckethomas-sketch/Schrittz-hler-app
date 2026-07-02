package com.example.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import android.app.Activity
import androidx.core.view.WindowCompat

private val HighDensityLightColorScheme = lightColorScheme(
    primary = HighDensityPrimary,
    secondary = HighDensitySecondary,
    tertiary = HighDensityTertiary,
    background = HighDensityBackground,
    surface = HighDensitySurface,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = HighDensityOnSurface,
    onSurface = HighDensityOnSurface,
    surfaceVariant = HighDensitySurfaceVariant,
    onSurfaceVariant = HighDensityOnSurfaceVariant,
    primaryContainer = HighDensityPrimaryContainer,
    onPrimaryContainer = HighDensityOnPrimaryContainer,
    secondaryContainer = HighDensitySecondaryContainer,
    onSecondaryContainer = HighDensityOnSecondaryContainer,
    outline = HighDensityOutline,
    outlineVariant = HighDensityOutlineVariant
)

fun getColorScheme(vibe: String, isDark: Boolean, isOled: Boolean): androidx.compose.material3.ColorScheme {
    return when (vibe) {
        "minimalist" -> {
            if (isDark) {
                darkColorScheme(
                    primary = Color(0xFFF1F5F9), // Cool bright slate white
                    secondary = Color(0xFF94A3B8), // Slate gray
                    tertiary = Color(0xFFCBD5E1),
                    background = if (isOled) Color.Black else Color(0xFF1E293B), // Soft Slate Navy Dark
                    surface = if (isOled) Color.Black else Color(0xFF1E293B),
                    onPrimary = Color(0xFF0F172A),
                    onSecondary = Color(0xFF0F172A),
                    onTertiary = Color(0xFF0F172A),
                    onBackground = Color(0xFFF8FAFC),
                    onSurface = Color(0xFFF8FAFC),
                    surfaceVariant = Color(0xFF334155),
                    onSurfaceVariant = Color(0xFF94A3B8),
                    primaryContainer = Color(0xFF475569),
                    onPrimaryContainer = Color(0xFFF8FAFC),
                    secondaryContainer = Color(0xFF334155),
                    onSecondaryContainer = Color(0xFFF8FAFC),
                    outline = Color(0xFF475569),
                    outlineVariant = Color(0xFF334155)
                )
            } else {
                lightColorScheme(
                    primary = Color(0xFF0F172A), // Charcoal black
                    secondary = Color(0xFF475569), // Steel blue gray
                    tertiary = Color(0xFF64748B),
                    background = Color(0xFFF8FAFC), // Pure clean slate off-white
                    surface = Color(0xFFFFFFFF),
                    onPrimary = Color.White,
                    onSecondary = Color.White,
                    onTertiary = Color.White,
                    onBackground = Color(0xFF0F172A),
                    onSurface = Color(0xFF0F172A),
                    surfaceVariant = Color(0xFFF1F5F9),
                    onSurfaceVariant = Color(0xFF475569),
                    primaryContainer = Color(0xFFE2E8F0),
                    onPrimaryContainer = Color(0xFF0F172A),
                    secondaryContainer = Color(0xFFF1F5F9),
                    onSecondaryContainer = Color(0xFF0F172A),
                    outline = Color(0xFFCBD5E1),
                    outlineVariant = Color(0xFFE2E8F0)
                )
            }
        }
        "professional" -> {
            if (isDark) {
                darkColorScheme(
                    primary = Color(0xFF00ADB5), // Cyan accent
                    secondary = Color(0xFF5BC0BE), // Muted teal-blue
                    tertiary = Color(0xFF3A506B),
                    background = if (isOled) Color.Black else Color(0xFF0B132B), // Deep Space Navy
                    surface = if (isOled) Color.Black else Color(0xFF1C2541),
                    onPrimary = Color.Black,
                    onSecondary = Color.White,
                    onTertiary = Color.White,
                    onBackground = Color(0xFFEDF2F4),
                    onSurface = Color(0xFFEDF2F4),
                    surfaceVariant = Color(0xFF1C2541),
                    onSurfaceVariant = Color(0xFF5BC0BE),
                    primaryContainer = Color(0xFF00ADB5),
                    onPrimaryContainer = Color.White,
                    secondaryContainer = Color(0xFF1C2541),
                    onSecondaryContainer = Color(0xFF5BC0BE),
                    outline = Color(0xFF3A506B),
                    outlineVariant = Color(0xFF1C2541)
                )
            } else {
                lightColorScheme(
                    primary = Color(0xFF1A365D), // Deep rich corporate blue
                    secondary = Color(0xFF2B6CB0), // Bright corporate blue
                    tertiary = Color(0xFF319795), // Teal accent
                    background = Color(0xFFF7FAFC), // Ultra light gray-blue
                    surface = Color(0xFFFFFFFF),
                    onPrimary = Color.White,
                    onSecondary = Color.White,
                    onTertiary = Color.White,
                    onBackground = Color(0xFF1A202C),
                    onSurface = Color(0xFF1A202C),
                    surfaceVariant = Color(0xFFEDF2F7),
                    onSurfaceVariant = Color(0xFF2D3748),
                    primaryContainer = Color(0xFFEBF8FF),
                    onPrimaryContainer = Color(0xFF2B6CB0),
                    secondaryContainer = Color(0xFFE6FFFA),
                    onSecondaryContainer = Color(0xFF319795),
                    outline = Color(0xFFCBD5E0),
                    outlineVariant = Color(0xFFE2E8F0)
                )
            }
        }
        "playful" -> {
            if (isDark) {
                darkColorScheme(
                    primary = Color(0xFFF4A261), // Saffron Orange
                    secondary = Color(0xFFE76F51), // Coral
                    tertiary = Color(0xFF2A9D8F), // Friendly Turquoise
                    background = if (isOled) Color.Black else Color(0xFF264653), // Deep sea teal
                    surface = if (isOled) Color.Black else Color(0xFF1C343E),
                    onPrimary = Color(0xFF264653),
                    onSecondary = Color.White,
                    onTertiary = Color.White,
                    onBackground = Color(0xFFFFFDF9),
                    onSurface = Color(0xFFFFFDF9),
                    surfaceVariant = Color(0xFF2A9D8F).copy(alpha = 0.4f),
                    onSurfaceVariant = Color(0xFFF4A261),
                    primaryContainer = Color(0xFFE76F51),
                    onPrimaryContainer = Color.White,
                    secondaryContainer = Color(0xFF264653),
                    onSecondaryContainer = Color(0xFFF4A261),
                    outline = Color(0xFF2A9D8F),
                    outlineVariant = Color(0xFF264653)
                )
            } else {
                lightColorScheme(
                    primary = Color(0xFFE76F51), // Cheerful coral
                    secondary = Color(0xFFF4A261), // Friendly saffron
                    tertiary = Color(0xFF2A9D8F), // Bright turquoise
                    background = Color(0xFFFFFDF9), // Warm sunny cream background
                    surface = Color(0xFFFFFFFF),
                    onPrimary = Color.White,
                    onSecondary = Color.White,
                    onTertiary = Color.White,
                    onBackground = Color(0xFF264653),
                    onSurface = Color(0xFF264653),
                    surfaceVariant = Color(0xFFFFE8D6),
                    onSurfaceVariant = Color(0xFFE76F51),
                    primaryContainer = Color(0xFFFFE8D6),
                    onPrimaryContainer = Color(0xFFE76F51),
                    secondaryContainer = Color(0xFFE8F5E9),
                    onSecondaryContainer = Color(0xFF2D6A4F),
                    outline = Color(0xFFF4A261),
                    outlineVariant = Color(0xFFFFE8D6)
                )
            }
        }
        "calm" -> {
            if (isDark) {
                darkColorScheme(
                    primary = Color(0xFF74C69D), // Warm soft green
                    secondary = Color(0xFF95D5B2), // Very soft green
                    tertiary = Color(0xFFD8E2DC), // Lavender cream
                    background = if (isOled) Color.Black else Color(0xFF1B2E24), // Calm forest dark
                    surface = if (isOled) Color.Black else Color(0xFF243B2E),
                    onPrimary = Color(0xFF1B2E24),
                    onSecondary = Color(0xFF1B2E24),
                    onTertiary = Color(0xFF1B2E24),
                    onBackground = Color(0xFFF4F9F4),
                    onSurface = Color(0xFFF4F9F4),
                    surfaceVariant = Color(0xFF2D4A3E),
                    onSurfaceVariant = Color(0xFF95D5B2),
                    primaryContainer = Color(0xFF40916C),
                    onPrimaryContainer = Color.White,
                    secondaryContainer = Color(0xFF2D4A3E),
                    onSecondaryContainer = Color(0xFF74C69D),
                    outline = Color(0xFF40916C),
                    outlineVariant = Color(0xFF2D4A3E)
                )
            } else {
                lightColorScheme(
                    primary = Color(0xFF2D6A4F), // Elegant deep forest green
                    secondary = Color(0xFF40916C), // Soft leafy green
                    tertiary = Color(0xFF74C69D), // Fresh mint
                    background = Color(0xFFF4F9F4), // Restorative soft green background
                    surface = Color(0xFFFFFFFF),
                    onPrimary = Color.White,
                    onSecondary = Color.White,
                    onTertiary = Color.White,
                    onBackground = Color(0xFF1B2E24),
                    onSurface = Color(0xFF1B2E24),
                    surfaceVariant = Color(0xFFE8F5E9),
                    onSurfaceVariant = Color(0xFF2D6A4F),
                    primaryContainer = Color(0xFFD8F3DC),
                    onPrimaryContainer = Color(0xFF1B2E24),
                    secondaryContainer = Color(0xFFE8F5E9),
                    onSecondaryContainer = Color(0xFF2D6A4F),
                    outline = Color(0xFF95D5B2),
                    outlineVariant = Color(0xFFD8F3DC)
                )
            }
        }
        else -> { // standard violet
            if (isDark) {
                darkColorScheme(
                    primary = Color(0xFFD0BCFF),
                    secondary = Color(0xFFCCC2DC),
                    tertiary = Color(0xFFEFB8C8),
                    background = if (isOled) Color.Black else Color(0xFF141218), // Pure black vs Very Dark Purple-Gray
                    surface = if (isOled) Color.Black else Color(0xFF1D1B20),
                    onPrimary = Color(0xFF381E72),
                    onSecondary = Color(0xFF332D41),
                    onTertiary = Color(0xFF492532),
                    onBackground = Color(0xFFE6E1E5),
                    onSurface = Color(0xFFE6E1E5),
                    surfaceVariant = Color(0xFF49454F),
                    onSurfaceVariant = Color(0xFFCAC4D0),
                    primaryContainer = Color(0xFF4F378B),
                    onPrimaryContainer = Color(0xFFEADDFF),
                    secondaryContainer = Color(0xFF4A4458),
                    onSecondaryContainer = Color(0xFFE8DEF8),
                    outline = Color(0xFF938F99),
                    outlineVariant = Color(0xFF49454F)
                )
            } else {
                lightColorScheme(
                    primary = Color(0xFF6750A4),
                    secondary = Color(0xFF625B71),
                    tertiary = Color(0xFF7D5260),
                    background = Color(0xFFFEF7FF),
                    surface = Color(0xFFFFFFFF),
                    onPrimary = Color.White,
                    onSecondary = Color.White,
                    onTertiary = Color.White,
                    onBackground = Color(0xFF1D1B20),
                    onSurface = Color(0xFF1D1B20),
                    surfaceVariant = Color(0xFFF3EDF7),
                    onSurfaceVariant = Color(0xFF49454F),
                    primaryContainer = Color(0xFFE8DEF8),
                    onPrimaryContainer = Color(0xFF1D192B),
                    secondaryContainer = Color(0xFFEADDFF),
                    onSecondaryContainer = Color(0xFF21005D),
                    outline = Color(0xFFCAC4D0),
                    outlineVariant = Color(0xFFE7E0EC)
                )
            }
        }
    }
}

@Composable
fun MyApplicationTheme(
    themeVibe: String = "standard",
    themeMode: String = "auto",
    content: @Composable () -> Unit,
) {
    val systemInDark = isSystemInDarkTheme()
    val isDark = when (themeMode) {
        "light" -> false
        "half_dark" -> true
        "dark" -> true
        "auto" -> systemInDark
        else -> systemInDark
    }
    val isOled = themeMode == "dark"

    val colorScheme = getColorScheme(themeVibe, isDark, isOled)

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as? Activity)?.window
            if (window != null) {
                window.statusBarColor = android.graphics.Color.TRANSPARENT
                window.navigationBarColor = android.graphics.Color.TRANSPARENT
                
                val insetsController = WindowCompat.getInsetsController(window, view)
                insetsController.isAppearanceLightStatusBars = !isDark
                insetsController.isAppearanceLightNavigationBars = !isDark
            }
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
