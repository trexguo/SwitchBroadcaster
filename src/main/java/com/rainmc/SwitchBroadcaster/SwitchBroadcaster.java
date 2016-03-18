package com.rainmc.SwitchBroadcaster;

import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class SwitchBroadcaster extends Plugin {

    @Override
    public void onEnable() {
        try {
            Configuration configuration = ConfigurationProvider.getProvider(YamlConfiguration.class).load(new File(getDataFolder(), "config.yml"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        getProxy().getPluginManager().registerListener(this, new SwitchBroadcasterListener());

    }

}