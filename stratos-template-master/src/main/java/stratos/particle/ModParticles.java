package stratos.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import stratos.mod.ExampleMod;


public class ModParticles {


    public static final DefaultParticleType AIR_SHROOM_PARTICLE = registerParticle("air_shroom_particle", FabricParticleTypes.simple());

    public static final DefaultParticleType AIR_LICHEN_DROP = registerParticle("air_lichen_drop.json", FabricParticleTypes.simple());



    private static DefaultParticleType registerParticle(String name, DefaultParticleType particleType) {
        return Registry.register(Registries.PARTICLE_TYPE, new Identifier(ExampleMod.MOD_ID, name), particleType);
    }

    public static void registerParticles() {
        ExampleMod.LOGGER.info("Registering Mod Particles for " + ExampleMod.MOD_ID);
    }
}
