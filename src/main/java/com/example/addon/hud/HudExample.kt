package com.example.addon.hud

import com.example.addon.Addon
import meteordevelopment.meteorclient.systems.hud.HudElement
import meteordevelopment.meteorclient.systems.hud.HudElementInfo
import meteordevelopment.meteorclient.systems.hud.HudRenderer
import meteordevelopment.meteorclient.utils.render.color.Color


object HudExample : HudElement(HudElementInfo(Addon.HUD_GROUP, "example", "HUD element example.") { HudExample }) {

    override fun render(renderer: HudRenderer) {
        setSize(renderer.textWidth("Example element", true), renderer.textHeight(true))
        renderer.text("Example element", x.toDouble(), y.toDouble(), Color.WHITE, true)
    }
}
