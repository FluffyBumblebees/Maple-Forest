package net.fluffybumblebee.maple_forest.world.gen;

import com.mojang.datafixers.util.Pair;
import net.fluffybumblebee.maple_forest.init.MapleForest;
import net.fluffybumblebee.maple_forest.world.gen.surfacerules.MFSurfaceRules;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.*;

import java.util.function.Consumer;

import static net.fluffybumblebee.maple_forest.init.MFBiomes.MAPLE_BLOSSOM;
import static net.fluffybumblebee.maple_forest.init.MFBiomes.MAPLE_WOODLANDS;

public class MFBiomeGeneration extends Region implements Runnable, TerraBlenderApi {

    public MFBiomeGeneration() {
        super(new Identifier(MapleForest.NAMESPACE, "overworld"), RegionType.OVERWORLD, 1);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        this.addBiome(
                mapper,
                ParameterUtils.Temperature.WARM,
                ParameterUtils.Humidity.NEUTRAL,
                ParameterUtils.Continentalness.COAST,
                ParameterUtils.Erosion.EROSION_6,
                ParameterUtils.Weirdness.MID_SLICE_VARIANT_DESCENDING,
                ParameterUtils.Depth.SURFACE,
                0L,
                MAPLE_BLOSSOM
                );
        this.addBiome(
                mapper,
                ParameterUtils.Temperature.HOT,
                ParameterUtils.Humidity.ARID,
                ParameterUtils.Continentalness.MID_INLAND,
                ParameterUtils.Erosion.FULL_RANGE,
                ParameterUtils.Weirdness.HIGH_SLICE_NORMAL_ASCENDING,
                ParameterUtils.Depth.SURFACE,
                2L,
                MAPLE_WOODLANDS
        );
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
