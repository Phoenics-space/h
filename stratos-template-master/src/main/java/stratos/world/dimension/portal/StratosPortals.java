package stratos.world.dimension.portal;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import stratos.Items.ModItems;
import stratos.mod.ExampleMod;

public class StratosPortals {

    public static void registerStratosPortals() {
        createPortal();
    }

    private static void createPortal() {
        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.REINFORCED_DEEPSLATE)
                .lightWithItem(ModItems.RUBY)
                .destDimID(new Identifier(ExampleMod.MOD_ID,"stratosdim"))
                .tintColor(0xbe, 0x01, 0x3c)
                .registerPortal();
    }
}
