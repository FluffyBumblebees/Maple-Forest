package net.fluffybumblebee.maple_forest.world.biome;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationConfiguredFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

public class MFVegetationPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> PUMPKINS;

    static {
        PUMPKINS = PlacedFeatures.register(
                "pumpkins",
                VegetationConfiguredFeatures.PATCH_PUMPKIN,
                RarityFilterPlacementModifier.of(4),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of());
    }

}
