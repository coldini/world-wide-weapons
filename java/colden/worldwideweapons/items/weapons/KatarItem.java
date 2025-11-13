package colden.worldwideweapons.items.weapons;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class KatarItem extends SwordItem {
    public KatarItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public int getEnchantability() {
        return 22; // Higher enchantability for better enchantments
    }

    // Optional: Custom right-click logic for offhand use


}