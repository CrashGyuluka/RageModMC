// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

public static class Modeltoxic_helper_16 extends EntityModel<Entity> {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public Modeltoxic_helper_16() {
		texWidth = 128;
		texHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setPos(0.0F, 24.0F, 0.0F);
		bb_main.texOffs(77, 5).addBox(2.0F, -7.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		bb_main.texOffs(46, 70).addBox(1.5F, -14.0F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		bb_main.texOffs(74, 21).addBox(2.5F, -19.0F, -1.0F, 3.0F, 5.0F, 2.0F, 0.0F, false);
		bb_main.texOffs(21, 53).addBox(-5.5F, -19.0F, -1.0F, 3.0F, 5.0F, 2.0F, 0.0F, false);
		bb_main.texOffs(0, 31).addBox(-7.5F, -23.0F, -3.5F, 15.0F, 4.0F, 8.0F, 0.0F, false);
		bb_main.texOffs(36, 46).addBox(-6.5F, -24.0F, -2.5F, 13.0F, 1.0F, 6.0F, 0.0F, false);
		bb_main.texOffs(39, 0).addBox(-6.5F, -25.0F, -3.5F, 13.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.texOffs(68, 46).addBox(-5.5F, -26.0F, -1.5F, 11.0F, 1.0F, 4.0F, 0.0F, false);
		bb_main.texOffs(38, 35).addBox(-7.5F, -29.0F, -3.5F, 15.0F, 3.0F, 8.0F, 0.0F, false);
		bb_main.texOffs(0, 18).addBox(-7.5F, -33.0F, -4.5F, 15.0F, 4.0F, 9.0F, 0.0F, false);
		bb_main.texOffs(0, 0).addBox(-7.5F, -45.0F, -4.375F, 15.0F, 9.0F, 9.0F, 0.0F, false);
		bb_main.texOffs(66, 70).addBox(-4.5F, -43.0F, 3.225F, 9.0F, 5.0F, 2.0F, 0.0F, false);
		bb_main.texOffs(28, 66).addBox(-2.5F, -38.0F, -1.375F, 5.0F, 17.0F, 4.0F, 0.0F, false);
		bb_main.texOffs(41, 24).addBox(-6.5F, -45.25F, -3.375F, 13.0F, 1.0F, 7.0F, 0.0F, false);
		bb_main.texOffs(0, 23).addBox(-12.0F, -26.5F, -14.75F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(0, 5).addBox(9.0F, -26.5F, -14.75F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(46, 70).addBox(-6.5F, -14.0F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		bb_main.texOffs(77, 5).addBox(-6.0F, -7.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
		cube_r1.texOffs(0, 66).addBox(8.0F, -29.0F, -11.0F, 5.0F, 4.0F, 9.0F, 0.0F, false);
		cube_r1.texOffs(0, 66).addBox(-13.0F, -29.0F, -11.0F, 5.0F, 4.0F, 9.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3491F, 0.0F, 0.0F);
		cube_r2.texOffs(30, 53).addBox(-13.5F, -29.0F, 3.0F, 6.0F, 4.0F, 9.0F, 0.0F, false);
		cube_r2.texOffs(30, 53).addBox(7.5F, -29.0F, 3.0F, 6.0F, 4.0F, 9.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.5708F, 0.0F, -0.5236F);
		cube_r3.texOffs(0, 31).addBox(22.075F, -5.65F, 33.75F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, 1.5708F, 0.0F, 0.4363F);
		cube_r4.texOffs(0, 33).addBox(-21.725F, -5.65F, 35.725F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r5);
		setRotationAngle(cube_r5, 1.5708F, 0.0F, 0.0F);
		cube_r5.texOffs(0, 0).addBox(2.5F, -5.5F, 39.125F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r5.texOffs(0, 18).addBox(-4.5F, -5.5F, 39.125F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r5.texOffs(41, 11).addBox(-6.5F, -5.0F, 37.125F, 13.0F, 3.0F, 7.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.5672F, 0.0F, 0.0F);
		cube_r6.texOffs(0, 43).addBox(-5.5F, -34.0F, 13.625F, 11.0F, 3.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}