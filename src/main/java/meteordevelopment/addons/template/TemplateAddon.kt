package meteordevelopment.addons.template

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
import meteordevelopment.meteorclient.systems.commands.Commands
import meteordevelopment.meteorclient.systems.modules.Category
import meteordevelopment.meteorclient.systems.modules.Modules
import org.apache.logging.log4j.LogManager
import java.lang.reflect.Method

class TemplateAddon : MeteorAddon() {
    override fun onInitialize() {
        LOG.info("Initializing Meteor Addon Template")

        // Required when using @EventHandler
        MeteorClient.EVENT_BUS.registerLambdaFactory("meteordevelopment.addons.template") { lookupInMethod: Method, klass: Class<*>? ->
            lookupInMethod.invoke(
                null,
                klass,
                MethodHandles.lookup()
            ) as MethodHandles.Lookup
        }

        // Modules
        Modules.get().add(Example())
        Modules.get().add(AnotherExample())

        // Commands
        Commands.get().add(ExampleCommand())

        // HUD
        val hud = Modules.get().get(HUD::class.java)
        hud.elements.add(HudExample(hud))
    }

    override fun onRegisterCategories() {
        Modules.registerCategory(CATEGORY)
    }

    companion object {
        val LOG = LogManager.getLogger()
        val CATEGORY = Category("Example")
    }
}
