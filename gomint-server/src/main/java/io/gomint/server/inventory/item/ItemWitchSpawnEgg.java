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
@RegisterInfo( sId = "minecraft:witch_spawn_egg", id = 450 )
public class ItemWitchSpawnEgg extends ItemStack< io.gomint.inventory.item.ItemWitchSpawnEgg> implements io.gomint.inventory.item.ItemWitchSpawnEgg {

    @Override
    public ItemType itemType() {
        return ItemType.WITCH_SPAWN_EGG;
    }

}
