package stratos.world.biome.surface;

import net.minecraft.block.Block;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import stratos.block.ModBlocks;
import stratos.world.biome.ModBiomes;

public class ModMaterialRules {
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(ModBlocks.STRATOS_STONE);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(ModBlocks.LICHEN_GROWTH);
    private static final MaterialRules.MaterialRule RUBY = makeStateRule(ModBlocks.RUBY_BLOCK);


    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.TEST_BIOME),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, RUBY)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, RUBY))

                // Default to a grass and dirt surface

        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}

