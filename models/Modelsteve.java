// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsteve extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftArmLayer_r1;
	private final ModelRenderer Body;
	private final ModelRenderer armor;
	private final ModelRenderer armor_front;
	private final ModelRenderer armor_left;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer armor_right;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer armor_back;
	private final ModelRenderer farok;

	public Modelsteve() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(32, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(44, 12).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(16, 40).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		LeftArmLayer_r1 = new ModelRenderer(this);
		LeftArmLayer_r1.setRotationPoint(-5.0F, 22.0F, 0.0F);
		LeftArm.addChild(LeftArmLayer_r1);
		setRotationAngle(LeftArmLayer_r1, -0.1309F, 0.0F, 0.0F);
		LeftArmLayer_r1.setTextureOffset(48, 48).addBox(4.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(28, 28).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		armor = new ModelRenderer(this);
		armor.setRotationPoint(0.0F, 24.0F, 0.0F);
		armor.setTextureOffset(0, 0).addBox(3.0F, -24.25F, -2.425F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		armor_front = new ModelRenderer(this);
		armor_front.setRotationPoint(0.0F, 0.0F, 0.0F);
		armor.addChild(armor_front);
		armor_front.setTextureOffset(0, 0).addBox(-4.5F, -21.25F, -2.5F, 9.0F, 10.0F, 0.0F, 0.0F, false);
		armor_front.setTextureOffset(0, 0).addBox(-1.0F, -20.75F, -2.55F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		armor_front.setTextureOffset(0, 0).addBox(-5.0F, -24.25F, -2.425F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		armor_front.setTextureOffset(0, 0).addBox(-4.5F, -22.75F, -2.45F, 3.0F, 2.0F, 0.0F, 0.0F, false);
		armor_front.setTextureOffset(0, 0).addBox(1.5F, -22.75F, -2.45F, 3.0F, 2.0F, 0.0F, 0.0F, false);

		armor_left = new ModelRenderer(this);
		armor_left.setRotationPoint(0.0F, 0.0F, 0.0F);
		armor.addChild(armor_left);
		armor_left.setTextureOffset(0, 0).addBox(8.5F, -24.25F, -2.5F, 0.0F, 4.0F, 5.0F, 0.0F, false);
		armor_left.setTextureOffset(0, 0).addBox(4.5F, -24.25F, -2.5F, 0.0F, 4.0F, 5.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(13.0F, 0.0F, 0.0F);
		armor_left.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-2.5F, -24.25F, 4.5F, 0.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(2.5F, -24.25F, 4.5F, 0.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(13.0F, 0.0F, 0.0F);
		armor_left.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
		cube_r2.setTextureOffset(0, 0).addBox(-24.25F, 4.5F, -2.5F, 0.0F, 4.0F, 5.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		armor_left.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-2.5F, -23.25F, -4.5F, 5.0F, 12.0F, 0.0F, 0.0F, false);

		armor_right = new ModelRenderer(this);
		armor_right.setRotationPoint(0.0F, 0.0F, 0.0F);
		armor.addChild(armor_right);
		armor_right.setTextureOffset(0, 0).addBox(-8.5F, -24.25F, -2.5F, 0.0F, 4.0F, 5.0F, 0.0F, false);
		armor_right.setTextureOffset(0, 0).addBox(-4.5F, -24.25F, -2.5F, 0.0F, 4.0F, 5.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		armor_right.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -1.5708F, 0.0F);
		cube_r4.setTextureOffset(0, 0).addBox(2.5F, -24.25F, 4.5F, 0.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r4.setTextureOffset(0, 0).addBox(-2.525F, -23.75F, 5.5F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r4.setTextureOffset(0, 0).addBox(-2.525F, -23.75F, -7.5F, 0.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r4.setTextureOffset(0, 0).addBox(-2.5F, -24.25F, 4.5F, 0.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		armor_right.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 1.5708F);
		cube_r5.setTextureOffset(0, 0).addBox(-24.25F, 4.5F, -2.5F, 0.0F, 4.0F, 5.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		armor_right.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -1.5708F, 0.0F);
		cube_r6.setTextureOffset(0, 0).addBox(-2.5F, -23.25F, 4.5F, 5.0F, 12.0F, 0.0F, 0.0F, false);

		armor_back = new ModelRenderer(this);
		armor_back.setRotationPoint(0.0F, 0.0F, 0.0F);
		armor.addChild(armor_back);
		armor_back.setTextureOffset(0, 0).addBox(-4.475F, -24.25F, 2.5F, 9.0F, 13.0F, 0.0F, 0.0F, false);

		farok = new ModelRenderer(this);
		farok.setRotationPoint(0.0F, 0.0F, 0.0F);
		armor_back.addChild(farok);
		farok.setTextureOffset(0, 0).addBox(-0.25F, -15.0F, 2.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		farok.setTextureOffset(0, 0).addBox(-0.25F, -16.0F, 3.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		farok.setTextureOffset(0, 0).addBox(-0.25F, -16.0F, 4.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		farok.setTextureOffset(0, 0).addBox(-0.25F, -17.0F, 5.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		farok.setTextureOffset(0, 0).addBox(-0.25F, -17.0F, 6.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		farok.setTextureOffset(0, 0).addBox(-0.25F, -17.0F, 7.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		farok.setTextureOffset(0, 0).addBox(-0.25F, -18.0F, 8.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		farok.setTextureOffset(0, 0).addBox(-0.25F, -19.0F, 8.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		farok.setTextureOffset(0, 0).addBox(-0.25F, -20.0F, 9.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		farok.setTextureOffset(0, 0).addBox(-0.25F, -20.0F, 10.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		farok.setTextureOffset(0, 0).addBox(-0.25F, -21.0F, 11.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		farok.setTextureOffset(0, 0).addBox(-0.25F, -21.0F, 12.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		farok.setTextureOffset(0, 0).addBox(-0.25F, -21.0F, 13.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		farok.setTextureOffset(0, 0).addBox(-0.25F, -22.0F, 14.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		farok.setTextureOffset(0, 0).addBox(-0.25F, -23.0F, 14.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		farok.setTextureOffset(0, 0).addBox(-0.25F, -24.0F, 13.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		farok.setTextureOffset(0, 0).addBox(-0.25F, -25.0F, 12.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		farok.setTextureOffset(0, 0).addBox(-0.25F, -25.0F, 11.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		farok.setTextureOffset(0, 0).addBox(-0.25F, -26.0F, 10.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		armor.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}