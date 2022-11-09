package com.example.addon

import com.example.addon.commands.CommandExample
import com.example.addon.hud.HudExample
import com.example.addon.modules.ModuleExample
import com.mojang.logging.LogUtils
import meteordevelopment.meteorclient.addons.MeteorAddon
import meteordevelopment.meteorclient.systems.commands.Commands
import meteordevelopment.meteorclient.systems.hud.Hud
import meteordevelopment.meteorclient.systems.hud.HudGroup
import meteordevelopment.meteorclient.systems.modules.Category
import meteordevelopment.meteorclient.systems.modules.Modules
import org.slf4j.Logger

class Addon : MeteorAddon() {

    override fun onInitialize() {
        LOG.info("Initializing Meteor Addon Template")

        // Modules
        Modules.get().add(ModuleExample)

        // Commands
        Commands.get().add(CommandExample)

        // HUD
        Hud.get().register(HudExample.info)
    }

    override fun onRegisterCategories() {
        Modules.registerCategory(CATEGORY)
    }

    override fun getPackage() = "com.example.addon"

    companion object {
        val LOG: Logger = LogUtils.getLogger()
        val CATEGORY: Category = Category("Example")
        val HUD_GROUP: HudGroup = HudGroup("Example")
    }
}

