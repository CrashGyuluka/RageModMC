// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltoxic_helper_1_17<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "toxic_helper_1_17"), "main");
	private final ModelPart bb_main;

	public Modeltoxic_helper_1_17(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(77, 5)
						.addBox(2.0F, -7.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 70)
						.addBox(1.5F, -14.0F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(74, 21)
						.addBox(2.5F, -19.0F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 53)
						.addBox(-5.5F, -19.0F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-7.5F, -23.0F, -3.5F, 15.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(36, 46)
						.addBox(-6.5F, -24.0F, -2.5F, 13.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(39, 0)
						.addBox(-6.5F, -25.0F, -3.5F, 13.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(68, 46)
						.addBox(-5.5F, -26.0F, -1.5F, 11.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 35)
						.addBox(-7.5F, -29.0F, -3.5F, 15.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-7.5F, -33.0F, -4.5F, 15.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.5F, -45.0F, -4.375F, 15.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(66, 70)
						.addBox(-4.5F, -43.0F, 3.225F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 66)
						.addBox(-2.5F, -38.0F, -1.375F, 5.0F, 17.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(41, 24)
						.addBox(-6.5F, -45.25F, -3.375F, 13.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-12.0F, -26.5F, -14.75F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(9.0F, -26.5F, -14.75F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 70)
						.addBox(-6.5F, -14.0F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(77, 5)
						.addBox(-6.0F, -7.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 66)
						.addBox(8.0F, -29.0F, -11.0F, 5.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 66)
						.addBox(-13.0F, -29.0F, -11.0F, 5.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(30, 53)
						.addBox(-13.5F, -29.0F, 3.0F, 6.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(30, 53)
						.addBox(7.5F, -29.0F, 3.0F, 6.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 31).addBox(22.075F, -5.65F, 33.75F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, -0.5236F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 33).addBox(-21.725F, -5.65F, 35.725F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.4363F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(2.5F, -5.5F, 39.125F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-4.5F, -5.5F, 39.125F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 11)
						.addBox(-6.5F, -5.0F, 37.125F, 13.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bb_main
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(0, 43).addBox(-5.5F, -34.0F, 13.625F, 11.0F, 3.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}