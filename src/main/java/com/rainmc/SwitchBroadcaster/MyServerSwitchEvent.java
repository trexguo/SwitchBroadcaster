package com.rainmc.SwitchBroadcaster;

import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Event;

/**
 * SwitchBroadcaster
 * Created by Rex on 2016/3/18.
 * Updated on 2016/3/18
 */
public class MyServerSwitchEvent extends Event{
    private String toServer;
    private String fromServer;
    private ProxiedPlayer player;

    public MyServerSwitchEvent(ProxiedPlayer player){
        this.player = player;
    }


    public String getToServerName(){
        return toServer;
    }

    public String getFromServerName(){
        return fromServer;
    }

}
