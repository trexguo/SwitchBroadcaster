package com.rainmc.SwitchBroadcaster;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.api.event.ServerSwitchEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class SwitchBroadcasterListener implements Listener {
    private String fromSever_Str;
    private String toSever_Str;
    @EventHandler
//    public void onServerConnected(final ServerConnectedEvent event) {
//        event.getPlayer().sendMessage(new ComponentBuilder("Welcome to " + event.getServer().getInfo().getName() + "!").color(ChatColor.GREEN).create());
//    }
    public void onServerSwitched(final ServerSwitchEvent event) {
        fromSever_Str = event.getPlayer().getServer().getInfo().getName();
    }

    public void onServerConnect(final ServerConnectEvent event) {
        toSever_Str = event.getTarget().getName();
        event.getPlayer().sendMessage(new ComponentBuilder(event.getPlayer().getName() + " switched from" + fromSever_Str + " to " + toSever_Str).color(ChatColor.GREEN).create());
    }

}