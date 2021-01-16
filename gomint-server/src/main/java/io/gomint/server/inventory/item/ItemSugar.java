package io.gomint.server.inventory.item;
import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( sId = "minecraft:sugar", id = 353 )
 public class ItemSugar extends ItemStack< io.gomint.inventory.item.ItemSugar> implements io.gomint.inventory.item.ItemSugar {



    @Override
    public ItemType itemType() {
        return ItemType.SUGAR;
    }

}
