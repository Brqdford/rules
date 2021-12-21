package com.brqdford.rules;

import com.google.inject.Inject;
import com.velocitypowered.api.command.Command;
import com.velocitypowered.api.command.SimpleCommand;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.event.ClickEvent;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;
import org.slf4j.Logger;

@Plugin(id = "rules", name = "Rules", version = "1.0", description = "rules", authors = {"Brqdford"})
public class rulesmain {
    private final ProxyServer server;

    @Inject
    public rulesmain(ProxyServer server, Logger logger) {
        this.server = server;
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        this.server.getCommandManager().register("rules", (Command) new SimpleCommand() {
            public void execute(Invocation invocation) {
                invocation.source().sendMessage(Component.text("        ---------- (Rules) ----------").color((TextColor) NamedTextColor.RED));
                invocation.source().sendMessage(Component.text("#1. Respect all players including their beliefs/religions/oreintation, etc.").color((TextColor) NamedTextColor.RED));
                invocation.source().sendMessage(Component.text("#2. No harassment or use of slurs of any kind.").color((TextColor) NamedTextColor.RED));
                invocation.source().sendMessage(Component.text("#3. No using hacked clients, no xray, no duping, and no abusing exploits.").color((TextColor) NamedTextColor.RED));
                invocation.source().sendMessage(Component.text("#4. No alternative accounts.").color((TextColor) NamedTextColor.RED));
                invocation.source().sendMessage(Component.text("#5. No griefing/stealing of any claims/nonclaims.").color((TextColor) NamedTextColor.RED));
                invocation.source().sendMessage(Component.text("#6. No random death matches. (Killing players for no reason.)").color((TextColor) NamedTextColor.RED));
                invocation.source().sendMessage(Component.text("#7. Use common sense.").color((TextColor) NamedTextColor.RED));
            }
        }, new String[]{"helpme"});
    }

}
