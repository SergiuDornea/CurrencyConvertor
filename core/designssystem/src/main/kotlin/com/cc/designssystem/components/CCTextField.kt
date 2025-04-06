package com.cc.designssystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cc.designssystem.theme.CurrencyConvertorTheme

@Composable
fun CCTextField(
    modifier: Modifier = Modifier,
    value: String,
    singleLine: Boolean = false,
    onValueChange: (String) -> Unit,
    keyboardOptions: KeyboardOptions = KeyboardOptions(),
    keyboardActions: KeyboardActions = KeyboardActions(),
) {
    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier
            .clip(RoundedCornerShape(7.dp))
            .background(Color(0xFFEFEFEF))
            .fillMaxWidth()
            .padding(horizontal = 15.dp, vertical = 20.dp),
        textStyle = MaterialTheme.typography.labelLarge,
        keyboardActions = keyboardActions,
        keyboardOptions = keyboardOptions
    )
}

@Composable
@Preview
fun CCTextFieldPreview(
    value: String = "100",
    onValueChange: (String) -> Unit = {},
) {
    CurrencyConvertorTheme {
        CCTextField(value = value, onValueChange = onValueChange)
    }
}