package meteordevelopment.addons.template.modules

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
import meteordevelopment.meteorclient.systems.modules.Module

class AnotherExample : Module(Categories.Player, "example-2", "An example module in an existing category.")
