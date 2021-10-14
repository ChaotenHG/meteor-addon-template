package meteordevelopment.addons.template.commands

import meteordevelopment.meteorclient.systems.modules.render.hud.HUD
import meteordevelopment.meteorclient.systems.modules.render.hud.modules.DoubleTextHudElement
import meteordevelopment.addons.template.TemplateAddon
import meteordevelopment.meteorclient.systems.modules.Categories
import com.mojang.brigadier.builder.LiteralArgumentBuilder
import net.minecraft.command.CommandSource
import com.mojang.brigadier.context.CommandContext
import meteordevelopment.meteorclient.utils.player.ChatUtils
import meteordevelopment.meteorclient.MeteorAddon
import meteordevelopment.meteorclient.MeteorClient
import meteordevelopment.orbit.listeners.LambdaListener
import java.lang.invoke.MethodHandles
import meteordevelopment.addons.template.modules.Example
import meteordevelopment.addons.template.modules.AnotherExample
import meteordevelopment.addons.template.commands.ExampleCommand
import meteordevelopment.addons.template.modules.hud.HudExample
import meteordevelopment.meteorclient.systems.commands.Command

class ExampleCommand : Command("example", "Sends a message.") {
    override fun build(builder: LiteralArgumentBuilder<CommandSource>) {
        builder.executes { context: CommandContext<CommandSource>? ->
            ChatUtils.info("hi")
            com.mojang.brigadier.Command.SINGLE_SUCCESS
        }
    }
}
