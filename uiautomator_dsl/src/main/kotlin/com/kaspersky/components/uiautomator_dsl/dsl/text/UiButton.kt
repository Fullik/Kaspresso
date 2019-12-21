package com.kaspersky.components.uiautomator_dsl.dsl.text

import com.kaspersky.components.uiautomator_dsl.dsl.common.builders.UiViewBuilder
import com.kaspersky.components.uiautomator_dsl.dsl.common.views.UiBaseView

class UiButton : UiBaseView<UiButton>, UiTextViewAssertions {
    constructor(builder: UiViewBuilder.() -> Unit) : super(builder)
}