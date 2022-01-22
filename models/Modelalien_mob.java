// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelalien_mob extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer legj;
	private final ModelRenderer legb;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public Modelalien_mob() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 23.25F, -3.0F);
		head.setTextureOffset(0, 17).addBox(-3.0F, -29.5F, -2.0F, 6.0F, 7.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(19, 9).addBox(-2.0F, -29.075F, 6.525F, 4.0F, 5.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(17, 22).addBox(-1.0F, -28.075F, 4.375F, 2.0F, 3.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(30, 25).addBox(-3.75F, -28.5F, -0.75F, 1.0F, 5.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(2.75F, -28.5F, -0.75F, 1.0F, 5.0F, 12.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.3491F);
		cube_r1.setTextureOffset(14, 10).addBox(9.775F, -26.0F, -2.25F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3491F);
		cube_r2.setTextureOffset(14, 8).addBox(-11.725F, -26.0F, -2.25F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		legj = new ModelRenderer(this);
		legj.setRotationPoint(0.0F, 24.0F, 0.0F);
		legj.setTextureOffset(2, 33).addBox(-5.25F, -11.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		legj.setTextureOffset(36, 6).addBox(-5.75F, -3.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		legb = new ModelRenderer(this);
		legb.setRotationPoint(0.0F, 24.0F, 0.0F);
		legb.setTextureOffset(2, 32).addBox(3.25F, -11.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		legb.setTextureOffset(37, 9).addBox(2.75F, -3.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(41, 23).addBox(-2.0F, -20.5F, -1.5F, 4.0F, 9.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(8, 14).addBox(-4.0F, -18.5F, -1.575F, 8.0F, 5.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(35, 4).addBox(-1.5F, -19.5F, -2.1F, 3.0F, 7.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.4363F, 0.0F);
		cube_r3.setTextureOffset(2, 37).addBox(-5.25F, -10.5F, 0.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r3.setTextureOffset(39, 18).addBox(-8.75F, -21.5F, -0.75F, 5.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.4363F, 0.0F);
		cube_r4.setTextureOffset(2, 40).addBox(3.25F, -10.5F, 0.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r4.setTextureOffset(39, 18).addBox(3.75F, -21.5F, -0.75F, 5.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.4363F, 0.0F);
		cube_r5.setTextureOffset(0, 0).addBox(4.25F, -24.0F, 1.75F, 5.0F, 11.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.4363F, 0.0F);
		cube_r6.setTextureOffset(0, 0).addBox(-9.25F, -24.0F, 1.75F, 5.0F, 11.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.4363F, 0.0F);
		cube_r7.setTextureOffset(0, 30).addBox(3.0F, -22.5F, 0.0F, 4.0F, 13.0F, 3.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, -0.4363F, 0.0F);
		cube_r8.setTextureOffset(0, 31).addBox(-7.0F, -22.5F, 0.0F, 4.0F, 13.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		legj.render(matrixStack, buffer, packedLight, packedOverlay);
		legb.render(matrixStack, buffer, packedLight, packedOverlay);
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}