package jp.soramame.sugarlands.gui;

import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.ColorHelper;
import net.minecraft.util.text.TranslationTextComponent;

public class SLConfigGui extends Screen {

    Screen screen;

    public SLConfigGui(Screen screen) {
        super(new TranslationTextComponent("gui.sugards.configuration"));
        this.screen = screen;
    }

    @Override
    protected void init() {
        super.init();
        this.addButton(new Button(width/2-50, height-40, 100, 20, DialogTexts.GUI_DONE, done->minecraft.setScreen(screen)));
    }
    //public void render(MatrixStack matrices, int mouseX, int mouseY, float delta)ファブリックより
    @Override
    public void render(MatrixStack matrixstack, int p_230430_2_, int p_230430_3_, float p_230430_4_) {
        int color1 = ColorHelper.PackedColor.color(0, 0xc4, 0xe4, 0xe2);
        int color2 = ColorHelper.PackedColor.color(20, 209, 0xff, 0xff);
        //背景
        this.fillGradient(matrixstack, 0, 0, this.width, this.height,color1 , color2);
        super.render(matrixstack, p_230430_2_, p_230430_3_, p_230430_4_);
    }

}
