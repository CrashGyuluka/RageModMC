// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelalien_mob<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "alien_mob"), "main");
	private final ModelPart head;
	private final ModelPart legj;
	private final ModelPart legb;
	private final ModelPart bone;

	public Modelalien_mob(ModelPart root) {
		this.head = root.getChild("head");
		this.legj = root.getChild("legj");
		this.legb = root.getChild("legb");
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 17)
						.addBox(-3.0F, -29.5F, -2.0F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(19, 9)
						.addBox(-2.0F, -29.075F, 6.525F, 4.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(17, 22)
						.addBox(-1.0F, -28.075F, 4.375F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(30, 25)
						.addBox(-3.75F, -28.5F, -0.75F, 1.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.75F, -28.5F, -0.75F, 1.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.25F, -3.0F));

		PartDefinition cube_r1 = head
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(14, 10).addBox(9.775F, -26.0F, -2.25F, 2.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r2 = head
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(14, 8).addBox(-11.725F, -26.0F, -2.25F, 2.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition legj = partdefinition.addOrReplaceChild("legj",
				CubeListBuilder.create().texOffs(2, 33)
						.addBox(-5.25F, -11.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 6)
						.addBox(-5.75F, -3.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition legb = partdefinition.addOrReplaceChild("legb",
				CubeListBuilder.create().texOffs(2, 32)
						.addBox(3.25F, -11.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 9)
						.addBox(2.75F, -3.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(41, 23)
						.addBox(-2.0F, -20.5F, -1.5F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 14)
						.addBox(-4.0F, -18.5F, -1.575F, 8.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(35, 4)
						.addBox(-1.5F, -19.5F, -2.1F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(2, 37)
						.addBox(-5.25F, -10.5F, 0.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 18)
						.addBox(-8.75F, -21.5F, -0.75F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(2, 40)
						.addBox(3.25F, -10.5F, 0.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 18)
						.addBox(3.75F, -21.5F, -0.75F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r5 = bone
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(0, 0).addBox(4.25F, -24.0F, 1.75F, 5.0F, 11.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r6 = bone
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(0, 0).addBox(-9.25F, -24.0F, 1.75F, 5.0F, 11.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r7 = bone
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(0, 30).addBox(3.0F, -22.5F, 0.0F, 4.0F, 13.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r8 = bone
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(0, 31).addBox(-7.0F, -22.5F, 0.0F, 4.0F, 13.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
		legj.render(poseStack, buffer, packedLight, packedOverlay);
		legb.render(poseStack, buffer, packedLight, packedOverlay);
		bone.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.legb.zRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.legj.zRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}