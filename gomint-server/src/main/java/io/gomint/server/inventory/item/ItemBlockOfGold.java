package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo(sId = "minecraft:gold_block", id = 41)
public class ItemBlockOfGold extends ItemStack< io.gomint.inventory.item.ItemBlockOfGold> implements io.gomint.inventory.item.ItemBlockOfGold {

    @Override
    public ItemType itemType() {
        return ItemType.BLOCK_OF_GOLD;
    }

}
