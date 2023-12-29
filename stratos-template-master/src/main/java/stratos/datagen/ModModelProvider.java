package stratos.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.BlockStateVariant;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;
import stratos.Items.ModItems;
import stratos.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool rubyPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FRAME);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STRATOS_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLED_STRATOS_STONE);

        blockStateModelGenerator.registerLog(ModBlocks.AIR_MAHOE_LOG).log(ModBlocks.AIR_MAHOE_LOG).wood(ModBlocks.AIR_MAHOE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_AIR_MAHOE_LOG).log(ModBlocks.STRIPPED_AIR_MAHOE_LOG).wood(ModBlocks.STRIPPED_AIR_MAHOE_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AIR_MAHOE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AIR_MAHOE_LICHEN);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LICHEN_GROWTH);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LICHEN_GRASS, ModBlocks.LICHEN_POT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.AIR_SHROOM, ModBlocks.SHROOM_POT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.AIR_KELP, ModBlocks.AIR_KELP_POT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerWallPlant(ModBlocks.SHROOM_MYOZYT);

        rubyPool.stairs(ModBlocks.AIR_MAHOE_STAIRS);
        rubyPool.slab(ModBlocks.AIR_MAHOE_SLAB);
        rubyPool.button(ModBlocks.AIR_MAHOE_BUTTON);
        rubyPool.pressurePlate(ModBlocks.AIR_MAHOE_PRESSURE_PLATE);
        rubyPool.fence(ModBlocks.AIR_MAHOE_FENCE);
        rubyPool.fenceGate(ModBlocks.AIR_MAHOE_FENCE_GATE);
        rubyPool.wall(ModBlocks.STRATOS_STONE_WALL);


        blockStateModelGenerator.registerDoor(ModBlocks.AIR_MAHOE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.AIR_MAHOE_TRAPDOOR);

    }

    @Override
    public void generateItemModels (ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);

    }
}

