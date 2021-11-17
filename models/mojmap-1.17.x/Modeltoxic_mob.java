// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltoxic_mob<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "toxic_mob"), "main");
	private final ModelPart main;

	public Modeltoxic_mob(ModelPart root) {
		this.main = root.getChild("main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition frontchest = main.addOrReplaceChild("frontchest",
				CubeListBuilder.create().texOffs(0, 18)
						.addBox(-6.0F, -23.0F, -4.0F, 12.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(-2.9F, -21.0F, -2.5F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = main.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F,
				-32.0F, -8.0F, 14.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(38, 10)
						.addBox(-13.0F, -22.0F, 7.0F, 10.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 21)
						.addBox(-11.0F, -27.0F, 10.6F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 40)
						.addBox(-13.0F, -28.0F, 11.0F, 10.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, -9.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition arm = main.addOrReplaceChild("arm", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = arm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(27, 24)
						.addBox(-2.0F, -19.0F, -10.0F, 7.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(27, 24)
						.addBox(-21.0F, -19.0F, -10.0F, 7.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, -9.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leg = main.addOrReplaceChild("leg",
				CubeListBuilder.create().texOffs(26, 55)
						.addBox(10.0F, -4.0F, -10.0F, 5.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 55)
						.addBox(1.0F, -4.0F, -10.0F, 5.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.0F, -8.0F, 8.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}