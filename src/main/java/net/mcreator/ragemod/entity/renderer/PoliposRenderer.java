package net.mcreator.ragemod.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.ragemod.entity.PoliposEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PoliposRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PoliposEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelpolipos(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ragemod:textures/polipos.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelpolipos extends EntityModel<Entity> {
		private final ModelRenderer csp;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer csp2;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer csp3;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer csp4;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer cube_r12;
		private final ModelRenderer lbjobb;
		private final ModelRenderer lbbal;
		private final ModelRenderer kezb;
		private final ModelRenderer bone;
		private final ModelRenderer bb_main;
		private final ModelRenderer cube_r13;
		private final ModelRenderer cube_r14;
		public Modelpolipos() {
			textureWidth = 256;
			textureHeight = 256;
			csp = new ModelRenderer(this);
			csp.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			csp.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.5236F, 0.0F, 0.3491F);
			cube_r1.setTextureOffset(138, 78).addBox(-23.0F, -99.0F, -38.0F, 5.0F, 23.0F, 5.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			csp.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.1309F, 0.0F, 0.5236F);
			cube_r2.setTextureOffset(142, 106).addBox(-40.0F, -116.0F, 29.3F, 4.0F, 23.0F, 4.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			csp.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.6109F, 0.0F, 0.7854F);
			cube_r3.setTextureOffset(153, 34).addBox(-69.0F, -99.0F, 72.0F, 3.0F, 23.0F, 3.0F, 0.0F, false);
			csp2 = new ModelRenderer(this);
			csp2.setRotationPoint(21.0F, 24.0F, 0.0F);
			setRotationAngle(csp2, 0.0F, 0.0F, -0.3054F);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			csp2.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.5236F, 0.0F, 0.3491F);
			cube_r4.setTextureOffset(122, 107).addBox(-23.0F, -107.0F, -38.0F, 5.0F, 31.0F, 5.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			csp2.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.1309F, 0.0F, 0.5236F);
			cube_r5.setTextureOffset(138, 139).addBox(-40.0F, -124.0F, 29.3F, 4.0F, 31.0F, 4.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			csp2.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.6109F, 0.0F, 0.7854F);
			cube_r6.setTextureOffset(150, 0).addBox(-69.0F, -107.0F, 72.0F, 3.0F, 31.0F, 3.0F, 0.0F, false);
			csp3 = new ModelRenderer(this);
			csp3.setRotationPoint(56.0F, -4.0F, 0.0F);
			setRotationAngle(csp3, 0.0F, 0.0F, -0.9599F);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
			csp3.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.5236F, 0.0F, 0.3491F);
			cube_r7.setTextureOffset(122, 0).addBox(-23.0F, -107.0F, -38.0F, 5.0F, 31.0F, 5.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
			csp3.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.1309F, 0.0F, 0.5236F);
			cube_r8.setTextureOffset(48, 136).addBox(-40.0F, -124.0F, 29.3F, 4.0F, 31.0F, 4.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
			csp3.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.6109F, 0.0F, 0.7854F);
			cube_r9.setTextureOffset(122, 143).addBox(-69.0F, -107.0F, 72.0F, 3.0F, 31.0F, 3.0F, 0.0F, false);
			csp4 = new ModelRenderer(this);
			csp4.setRotationPoint(52.0F, 6.0F, 0.0F);
			setRotationAngle(csp4, 0.0F, 0.0F, -0.7854F);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
			csp4.addChild(cube_r10);
			setRotationAngle(cube_r10, -0.5236F, 0.0F, 0.3491F);
			cube_r10.setTextureOffset(121, 47).addBox(-23.0F, -107.0F, -38.0F, 5.0F, 31.0F, 5.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
			csp4.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.1309F, 0.0F, 0.5236F);
			cube_r11.setTextureOffset(32, 136).addBox(-40.0F, -124.0F, 29.3F, 4.0F, 31.0F, 4.0F, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
			csp4.addChild(cube_r12);
			setRotationAngle(cube_r12, 0.6109F, 0.0F, 0.7854F);
			cube_r12.setTextureOffset(141, 33).addBox(-69.0F, -107.0F, 72.0F, 3.0F, 31.0F, 3.0F, 0.0F, false);
			lbjobb = new ModelRenderer(this);
			lbjobb.setRotationPoint(0.0F, 24.0F, 0.0F);
			lbjobb.setTextureOffset(16, 109).addBox(-6.0F, -45.0F, 2.0F, 4.0F, 45.0F, 4.0F, 0.0F, false);
			lbjobb.setTextureOffset(90, 107).addBox(-6.0F, -45.0F, -6.0F, 4.0F, 45.0F, 4.0F, 0.0F, false);
			lbbal = new ModelRenderer(this);
			lbbal.setRotationPoint(0.0F, 24.0F, 0.0F);
			lbbal.setTextureOffset(0, 109).addBox(2.0F, -45.0F, 2.0F, 4.0F, 45.0F, 4.0F, 0.0F, false);
			lbbal.setTextureOffset(106, 107).addBox(2.0F, -45.0F, -6.0F, 4.0F, 45.0F, 4.0F, 0.0F, false);
			kezb = new ModelRenderer(this);
			kezb.setRotationPoint(0.0F, 24.0F, 0.0F);
			kezb.setTextureOffset(64, 107).addBox(14.0F, -95.0F, -3.0F, 7.0F, 46.0F, 6.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(0, 0).addBox(-14.0F, -98.0F, -9.2F, 28.0F, 53.0F, 20.0F, 0.0F, false);
			bb_main.setTextureOffset(96, 0).addBox(-21.0F, -95.0F, -3.0F, 7.0F, 46.0F, 6.0F, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(cube_r13);
			setRotationAngle(cube_r13, 0.0F, 0.0873F, -1.5708F);
			cube_r13.setTextureOffset(32, 109).addBox(101.15F, -12.0F, -2.6F, 12.0F, 24.0F, 3.0F, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.0F, 0.0F, -1.5708F);
			cube_r14.setTextureOffset(0, 73).addBox(98.15F, -9.0F, -11.0F, 18.0F, 19.0F, 17.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			csp.render(matrixStack, buffer, packedLight, packedOverlay);
			csp2.render(matrixStack, buffer, packedLight, packedOverlay);
			csp3.render(matrixStack, buffer, packedLight, packedOverlay);
			csp4.render(matrixStack, buffer, packedLight, packedOverlay);
			lbjobb.render(matrixStack, buffer, packedLight, packedOverlay);
			lbbal.render(matrixStack, buffer, packedLight, packedOverlay);
			kezb.render(matrixStack, buffer, packedLight, packedOverlay);
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
