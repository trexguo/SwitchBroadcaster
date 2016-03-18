package com.rainmc.SwitchBroadcaster;

import net.md_5.bungee.api.plugin.Plugin;

public class SwitchBroadcaster extends Plugin {

    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerListener(this, new SwitchBroadcasterListener());
    }

}