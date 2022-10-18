package net.fluffybumblebee.maple_forest.world.feature;

import net.fluffybumblebee.maple_forest.util.registration.world.feature.MFPlacedFeatureRegistration;
import net.fluffybumblebee.maple_forest.util.type.wood.MFWoodTypes;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;


public class MFPlacedFeatures {
    public static void initClass() {}
    public static RegistryEntry<PlacedFeature> registerMaplePlacer(RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> spawner, String colour) {
        return MFPlacedFeatureRegistration.register(
                colour + "_"  + MFWoodTypes.MAPLE + "_placer",
                spawner,
                2,
                0.5f,
                1
        );
    }
    public static final RegistryEntry<PlacedFeature> RED_MAPLE_PLACED = registerMaplePlacer(MFConfiguredFeatures.RED_MAPLE_SPAWN, "red");
    public static final RegistryEntry<PlacedFeature> GREEN_MAPLE_PLACED = registerMaplePlacer(MFConfiguredFeatures.GREEN_MAPLE_SPAWN, "green");
    public static final RegistryEntry<PlacedFeature> YELLOW_MAPLE_PLACED = registerMaplePlacer(MFConfiguredFeatures.YELLOW_MAPLE_SPAWN, "yellow");
    public static final RegistryEntry<PlacedFeature> ORANGE_MAPLE_PLACED = registerMaplePlacer(MFConfiguredFeatures.ORANGE_MAPLE_SPAWN, "orange");
    public static final RegistryEntry<PlacedFeature> MAPLE_TRUNK = MFPlacedFeatureRegistration.BiasedRegistration.registryEntryOfPF("maple", MFConfiguredFeatures.FALLEN_MAPLE_TREE_CONFIG, 0.005F, 2);

}
