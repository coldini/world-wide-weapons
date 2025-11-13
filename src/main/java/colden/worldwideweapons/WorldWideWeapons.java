package colden.worldwideweapons;

import colden.worldwideweapons.effect.ModEffects;
import colden.worldwideweapons.items.itemGroupInit;
import colden.worldwideweapons.items.itemInitializer;
import colden.worldwideweapons.items.weapons.KatarItem;
import colden.worldwideweapons.items.weapons.LanceItem;
import colden.worldwideweapons.items.weapons.PadaoItem;
import colden.worldwideweapons.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorldWideWeapons implements ModInitializer {
	public static final String MOD_ID = "world-wide-weapons";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		itemInitializer.load();
		itemGroupInit.load();
		ModEffects.registerEffects();

		ModLootTableModifiers.modifyLootTables();
		ServerTickEvents.END_SERVER_TICK.register(this::onServerTick);


		LOGGER.info("Hello Fabric world!");
	}

	private void onServerTick(MinecraftServer server) {
		for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
			onPlayerTick(player);
		}
	}

	public static void onPlayerTick(LivingEntity entity) {
		if (entity.getMainHandStack().getItem() instanceof LanceItem ) {
			entity.addStatusEffect(new StatusEffectInstance(ModEffects.REACH, 2, 0, true, false, true));
		}
		if(entity.getMainHandStack().getItem() instanceof KatarItem && entity.getOffHandStack().getItem() instanceof KatarItem){
			entity.addStatusEffect( new StatusEffectInstance(StatusEffects.RESISTANCE,2, 2, true, false, true));
		}

		if(entity.getMainHandStack().getItem() instanceof PadaoItem){
			entity.addStatusEffect(new StatusEffectInstance(ModEffects.POLEARM_REACH, 2, 0, true, false));
		}

		
	}
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}