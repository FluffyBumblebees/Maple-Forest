package net.fluffybumblebee.maple_forest.world.gen;

import net.fluffybumblebee.maple_forest.init.MapleForest;
import com.mojang.datafixers.util.Pair;
import net.fluffybumblebee.maple_forest.init.MFBiomes;
import net.fluffybumblebee.maple_forest.world.gen.surfacerules.MFSurfaceRules;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.*;

import java.util.function.Consumer;

public class MFBiomeGeneration extends Region implements Runnable, TerraBlenderApi {

    public MFBiomeGeneration() {
        super(new Identifier(MapleForest.NAMESPACE, "overworld"), RegionType.OVERWORLD, 5);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        this.addBiomeSimilar(mapper, BiomeKeys.FLOWER_FOREST, MFBiomes.BLOSSOMING_CANADIAN_MAPLE_FOREST);
        this.addBiomeSimilar(mapper, BiomeKeys.SAVANNA, MFBiomes.AUTUMNAL_CANADIAN_MAPLE_FOREST);

    }

    @Override
    public void onTerraBlenderInitialized() {
        // We can't do registration stuff until both Traverse and TerraBlender are ready.
        // The run() method below will be called when Traverse is done initializing.
        MapleForest.callbackWhenInitialized(this);
    }

    // Initialize TerraBlender as our biome placement provider.
    @Override
    public void run() {
        // Register the Traverse surface rules; this must happen before we call addSurfaceRules().
        // Add the Traverse Overworld surface rules via TerraBlender.
        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MapleForest.NAMESPACE, MFSurfaceRules.createRules());

        // Add the biomes to Overworld generation via TerraBlender.
        Regions.register(this);
    }
}
