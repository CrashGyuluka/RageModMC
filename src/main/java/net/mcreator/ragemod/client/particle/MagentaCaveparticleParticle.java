
package net.mcreator.ragemod.client.particle;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.multiplayer.ClientLevel;

@OnlyIn(Dist.CLIENT)
public class MagentaCaveparticleParticle extends TextureSheetParticle {
	public static MagentaCaveparticleParticleProvider provider(SpriteSet spriteSet) {
		return new MagentaCaveparticleParticleProvider(spriteSet);
	}

	public static class MagentaCaveparticleParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public MagentaCaveparticleParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed,
				double zSpeed) {
			return new MagentaCaveparticleParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	private float angularVelocity;
	private float angularAcceleration;

	protected MagentaCaveparticleParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.2f, 0.2f);

		this.lifetime = (int) Math.max(1, 3 + (this.random.nextInt(18) - 9));
		this.gravity = 0.1f;
		this.hasPhysics = false;
		this.xd = vx * 0.9;
		this.yd = vy * 0.9;
		this.zd = vz * 0.9;
		this.angularVelocity = -0.2f;
		this.angularAcceleration = 0.03f;
		this.pickSprite(spriteSet);
	}

	@Override
	public int getLightColor(float partialTick) {
		return 15728880;
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_LIT;
	}

	@Override
	public void tick() {
		super.tick();
		this.oRoll = this.roll;
		this.roll += this.angularVelocity;
		this.angularVelocity += this.angularAcceleration;
	}
}
