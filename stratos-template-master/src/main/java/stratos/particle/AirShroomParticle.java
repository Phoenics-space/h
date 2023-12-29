package stratos.particle;

import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;

import java.util.Random;

public class AirShroomParticle extends SpriteBillboardParticle {
    private final Random random = new Random();
    private double motionX, motionY, motionZ;
    private float alpha = 1.0f;

    public AirShroomParticle(ClientWorld world, double xCoord, double yCoord, double zCoord,
                             SpriteProvider spriteSet, double xd, double yd, double zd) {
        super(world, xCoord, yCoord + 0.5, zCoord, xd, yd, zd);

        this.velocityMultiplier = 0.5f;
        this.velocityX = xd;
        this.velocityY = yd;
        this.velocityZ = zd;

        this.scale *= 0.9f;
        this.maxAge = 60; // Adjust maxAge as needed for particle lifespan
        this.setSpriteForAge(spriteSet);

        this.motionX = xd * 0.1; // Adjust the upward motion speed
        this.motionY = 0.01; // Change this to control the initial upward speed
        this.motionZ = zd * 0.1; // Adjust the forward motion speed

        this.red = 1f;
        this.green = 1f;
        this.blue = 1f;
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }

    @Override
    public void tick() {
        super.tick();

        if (this.age % 2 == 0) { // Change the frequency of direction changes
            // Apply a small random motion change
            this.motionX += (this.random.nextFloat() - 0.5) * 0.05;
            this.motionZ += (this.random.nextFloat() - 0.5) * 0.05;
        }

        // Update position with motion
        this.x += this.motionX;
        this.y += this.motionY;
        this.z += this.motionZ;

        // Gradually reduce alpha to make the particle fade away
        this.alpha -= 0.01f;
        if (this.alpha < 0) {
            this.alpha = 0;
        }
        this.setAlpha(this.alpha);
    }

    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider sprites;

        public Factory(SpriteProvider spriteProvider) {
            this.sprites = spriteProvider;
        }

        public Particle createParticle(DefaultParticleType particleType, ClientWorld clientWorld,
                                       double x, double y, double z, double xd, double yd, double zd) {
            return new AirShroomParticle(clientWorld, x, y, z, this.sprites, xd, yd, zd);
        }
    }
}
