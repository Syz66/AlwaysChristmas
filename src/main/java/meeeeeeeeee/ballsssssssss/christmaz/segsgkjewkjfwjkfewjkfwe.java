package meeeeeeeeee.ballsssssssss.christmaz;

import net.minecraft.client.renderer.tileentity.TileEntityChestRenderer;
import net.minecraft.tileentity.TileEntityChest;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = TileEntityChestRenderer.class)
public class segsgkjewkjfwjkfewjkfwe {
    @Shadow public boolean isChristmas;

    @Inject(method = "renderTileEntityAt(Lnet/minecraft/tileentity/TileEntityChest;DDDFI)V", at = @At("HEAD"))
    public void fgrfpgblkergtergehrgjehrggggg(TileEntityChest ghrthehrtrtherthertherth, double bbfgrthrhtbfggfhdfgh, double kjbfgkjgshkgsjhgsda, double ddddgjdrdrtjjrdt, float drtjdrjtjdrtjtrdjdrtjdrt, int fgbgbbgfbfgbgf, CallbackInfo ci) {
        isChristmas = true;
    }
}
