
package net.mcreator.ragemod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.ragemod.world.inventory.Book2Menu;
import net.mcreator.ragemod.network.Book2ButtonMessage;
import net.mcreator.ragemod.RagemodMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Book2Screen extends AbstractContainerScreen<Book2Menu> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Book2Screen(Book2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 216;
		this.imageHeight = 63;
	}

	private static final ResourceLocation texture = new ResourceLocation("ragemod:textures/book_2.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ragemod:textures/rageium.png"));
		this.blit(ms, this.leftPos + 4, this.topPos + 5, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ragemod:textures/rageium.png"));
		this.blit(ms, this.leftPos + 21, this.topPos + 5, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ragemod:textures/rageium.png"));
		this.blit(ms, this.leftPos + 38, this.topPos + 5, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ragemod:textures/rageium.png"));
		this.blit(ms, this.leftPos + 4, this.topPos + 41, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ragemod:textures/rageium.png"));
		this.blit(ms, this.leftPos + 21, this.topPos + 41, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ragemod:textures/rageium.png"));
		this.blit(ms, this.leftPos + 38, this.topPos + 41, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ragemod:textures/rageium.png"));
		this.blit(ms, this.leftPos + 4, this.topPos + 23, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ragemod:textures/rageium.png"));
		this.blit(ms, this.leftPos + 21, this.topPos + 23, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ragemod:textures/rageium.png"));
		this.blit(ms, this.leftPos + 38, this.topPos + 23, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ragemod:textures/zdfhsx.png"));
		this.blit(ms, this.leftPos + 45, this.topPos + 22, 0, 0, 64, 32, 64, 32);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ragemod:textures/rageium_block2.png"));
		this.blit(ms, this.leftPos + 101, this.topPos + 23, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		drawString(poseStack, this.font, "RECEPT K\u00D6NYV", 79, 4, -65536);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 140, this.topPos + 38, 70, 20, new TextComponent("KÖVETKEZÕ"), e -> {
			if (true) {
				RagemodMod.PACKET_HANDLER.sendToServer(new Book2ButtonMessage(0, x, y, z));
				Book2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 160, this.topPos + 5, 50, 20, new TextComponent("ELÕZÕ"), e -> {
			if (true) {
				RagemodMod.PACKET_HANDLER.sendToServer(new Book2ButtonMessage(1, x, y, z));
				Book2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
