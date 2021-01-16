package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemReduceBreaktime;
import io.gomint.server.inventory.item.annotation.CanBeDamaged;

/**
 * @author geNAZt
 * @version 1.0
 */
@CanBeDamaged
public abstract class ItemReduceTierStone<I extends io.gomint.inventory.item.ItemStack<I>> extends ItemStack<I> implements ItemReduceBreaktime<I> {

    @Override
    public byte maximumAmount() {
        return 1;
    }

    @Override
    public float divisor() {
        return 4;
    }

    @Override
    public short maxDamage() {
        return 131;
    }

    @Override
    public int enchantAbility() {
        return 5;
    }

}
