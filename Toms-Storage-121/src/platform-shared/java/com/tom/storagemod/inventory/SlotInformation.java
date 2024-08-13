package com.tom.storagemod.inventory;

import net.minecraft.world.item.ItemStack;

public record SlotInformation(StoredItemStack content, long capacity) {
}
