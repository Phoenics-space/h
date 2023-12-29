package stratos.mod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.render.RenderLayer;
import stratos.block.ModBlocks;
import stratos.particle.AirShroomParticle;
import stratos.particle.ModParticles;

public class ExampleModClient implements ClientModInitializer {



    @Override
    public void onInitializeClient() {



        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AIR_MAHOE_LICHEN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AIR_SHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LICHEN_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AIR_MAHOE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AIR_MAHOE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AIR_KELP, RenderLayer.getCutout());

        ParticleFactoryRegistry.getInstance().register(ModParticles.AIR_SHROOM_PARTICLE, AirShroomParticle.Factory::new);
    }
}


