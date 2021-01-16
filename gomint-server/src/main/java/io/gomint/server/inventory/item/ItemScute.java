/*
 * Copyright (c) 2020, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;
import io.gomint.server.registry.RegisterInfo;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( sId = "minecraft:scute", id = 562 )
public class ItemScute extends ItemStack< io.gomint.inventory.item.ItemScute> implements io.gomint.inventory.item.ItemScute {

    @Override
    public ItemType itemType() {
        return ItemType.SCUTE;
    }

}
