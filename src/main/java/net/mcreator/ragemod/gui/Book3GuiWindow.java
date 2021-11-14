
package net.mcreator.ragemod.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.ragemod.RagemodMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class Book3GuiWindow extends ContainerScreen<Book3Gui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = Book3Gui.guistate;

	public Book3GuiWindow(Book3Gui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 216;
		this.ySize = 63;
	}

	private static final ResourceLocation texture = new ResourceLocation("ragemod:textures/book_3.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("ragemod:textures/nagynyil.png"));
		this.blit(ms, this.guiLeft + 16, this.guiTop + 21, 0, 0, 64, 32, 64, 32);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("ragemod:textures/rageium_block2.png"));
		this.blit(ms, this.guiLeft + 7, this.guiTop + 22, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("ragemod:textures/rageium.png"));
		this.blit(ms, this.guiLeft + 81, this.guiTop + 13, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("ragemod:textures/rageium.png"));
		this.blit(ms, this.guiLeft + 98, this.guiTop + 13, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("ragemod:textures/rageium.png"));
		this.blit(ms, this.guiLeft + 115, this.guiTop + 13, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("ragemod:textures/rageium.png"));
		this.blit(ms, this.guiLeft + 98, this.guiTop + 28, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("ragemod:textures/rageium.png"));
		this.blit(ms, this.guiLeft + 115, this.guiTop + 28, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("ragemod:textures/rageium.png"));
		this.blit(ms, this.guiLeft + 115, this.guiTop + 43, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("ragemod:textures/rageium.png"));
		this.blit(ms, this.guiLeft + 81, this.guiTop + 28, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("ragemod:textures/rageium.png"));
		this.blit(ms, this.guiLeft + 98, this.guiTop + 43, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("ragemod:textures/rageium.png"));
		this.blit(ms, this.guiLeft + 81, this.guiTop + 43, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "RECEPT K\u00D6NYV", 79, 4, -65536);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 159, this.guiTop + 5, 50, 20, new StringTextComponent("EL�Z�"), e -> {
			if (true) {
				RagemodMod.PACKET_HANDLER.sendToServer(new Book3Gui.ButtonPressedMessage(0, x, y, z));
				Book3Gui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 139, this.guiTop + 37, 70, 20, new StringTextComponent("K�VETKEZ�"), e -> {
			if (true) {
				RagemodMod.PACKET_HANDLER.sendToServer(new Book3Gui.ButtonPressedMessage(1, x, y, z));
				Book3Gui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
