package colden.worldwideweapons.mixin;

import net.minecraft.entity.LivingEntity;
import colden.worldwideweapons.effect.ModEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
    @Inject(method = "jump", at = @At("TAIL"))
    private void reduceJumpHeight(CallbackInfo ci) {
        LivingEntity self = (LivingEntity)(Object)this;
        if (self.hasStatusEffect(ModEffects.BROKEN_BONES)) {
            // Halves the jump height
            self.setVelocity(self.getVelocity().x, self.getVelocity().y * 0.75, self.getVelocity().z);
        }
    }

}