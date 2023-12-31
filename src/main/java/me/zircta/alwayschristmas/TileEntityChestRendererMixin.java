package me.zircta.alwayschristmas;

import net.minecraft.client.renderer.tileentity.TileEntityChestRenderer;
import net.minecraft.tileentity.TileEntityChest;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = TileEntityChestRenderer.class)
public class TileEntityChestRendererMixin {
    @Shadow public boolean isChristmas;

    @Inject(method = "renderTileEntityAt(Lnet/minecraft/tileentity/TileEntityChest;DDDFI)V", at = @At("HEAD"))
    public void onRenderTile(TileEntityChest te, double x, double y, double z, float partialTicks, int destroyStage, CallbackInfo ci) {
        isChristmas = true;
    }
}
