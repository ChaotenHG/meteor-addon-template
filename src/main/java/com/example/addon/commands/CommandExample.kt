package com.example.addon.commands

import com.mojang.brigadier.Command.SINGLE_SUCCESS
import com.mojang.brigadier.builder.LiteralArgumentBuilder
import meteordevelopment.meteorclient.systems.commands.Command
import net.minecraft.command.CommandSource

object CommandExample : Command("example", "Sends a message.") {

    override fun build(builder: LiteralArgumentBuilder<CommandSource>) {
        builder.executes {

            info("hi")

            SINGLE_SUCCESS
        }
    }
}
