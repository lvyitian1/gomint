package io.gomint.plugin.listener;

import io.gomint.event.EventHandler;
import io.gomint.event.EventListener;
import io.gomint.event.player.PlayerJoinEvent;
import io.gomint.gui.CustomForm;
import io.gomint.gui.FormListener;
import io.gomint.gui.FormResponse;
import io.gomint.inventory.item.*;
import io.gomint.plugin.TestPlugin;
import lombok.RequiredArgsConstructor;

import java.awt.*;

/**
 * @author geNAZt
 * @version 1.0
 */
@RequiredArgsConstructor
public class PlayerJoinListener implements EventListener {

    private final TestPlugin plugin;

    @EventHandler
    public void onPlayerJoin( PlayerJoinEvent event ) {
        event.getPlayer().getInventory().setItem( 0, ItemCake.create( 1 ) );

        event.getPlayer().getInventory().setItem( 1, ItemCarrot.create( 64 ) );
        event.getPlayer().getInventory().setItem( 2, ItemGoldenCarrot.create( 64 ) );

        event.getPlayer().getInventory().setItem( 3, ItemDiamond.create( 64 ) );
        event.getPlayer().getInventory().setItem( 4, ItemStick.create( 1 ) );

        event.getPlayer().getInventory().setItem( 5, ItemLog.create( 5 ) );

        event.getPlayer().getInventory().setItem( 6, ItemElytra.create( 1 ) );

        // Create red leather armor
        ItemLeatherHelmet redHelmet = ItemLeatherHelmet.create( 1 );
        redHelmet.setColor( new Color( 193, 19, 25 ) );
        event.getPlayer().getInventory().setItem( 7, redHelmet );

        CustomForm settings = CustomForm.create( "GoMint" );
        settings.addLabel( "General" );
        settings.addToggle( "show-position", "Show current position", true );
        FormListener<FormResponse> response = event.getPlayer().addSettingsForm( settings );
        response.onResponse( formResponse -> plugin.getLogger().info( String.valueOf( formResponse.getToogle( "show-position" ) ) ) );

        this.plugin.getBossBarOrb().getBossBar().addPlayer( event.getPlayer() );
    }

}
