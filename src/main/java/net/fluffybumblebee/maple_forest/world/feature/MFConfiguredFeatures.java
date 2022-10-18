package net.fluffybumblebee.maple_forest.world.feature;

import net.fluffybumblebee.maple_forest.init.MFRegistry;
import net.fluffybumblebee.maple_forest.util.registration.world.feature.MFConfiguredFeatureRegistration;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;


public class MFConfiguredFeatures {

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> RED_MAPLE_TREE = MFConfiguredFeatureRegistration.BiasedRegistration.registerMapleTree(MFRegistry.RED_MAPLE_LEAVES, "red");
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> RED_MAPLE_SPAWN = MFConfiguredFeatureRegistration.BiasedRegistration.registerMapleTreeSpawner(MFRegistry.RED_MAPLE_SAPLING, RED_MAPLE_TREE, "red");
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> GREEN_MAPLE_TREE = MFConfiguredFeatureRegistration.BiasedRegistration.registerMapleTree(MFRegistry.GREEN_MAPLE_LEAVES, "green");
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> GREEN_MAPLE_SPAWN = MFConfiguredFeatureRegistration.BiasedRegistration.registerMapleTreeSpawner(MFRegistry.GREEN_MAPLE_SAPLING, GREEN_MAPLE_TREE, "green");
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> YELLOW_MAPLE_TREE = MFConfiguredFeatureRegistration.BiasedRegistration.registerMapleTree(MFRegistry.YELLOW_MAPLE_LEAVES, "yellow");
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> YELLOW_MAPLE_SPAWN = MFConfiguredFeatureRegistration.BiasedRegistration.registerMapleTreeSpawner(MFRegistry.YELLOW_MAPLE_SAPLING, YELLOW_MAPLE_TREE, "yellow");
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> ORANGE_MAPLE_TREE = MFConfiguredFeatureRegistration.BiasedRegistration.registerMapleTree(MFRegistry.ORANGE_MAPLE_LEAVES, "orange");
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> ORANGE_MAPLE_SPAWN = MFConfiguredFeatureRegistration.BiasedRegistration.registerMapleTreeSpawner(MFRegistry.ORANGE_MAPLE_SAPLING, ORANGE_MAPLE_TREE, "orange");
    public static final TreeFeatureConfig FALLEN_MAPLE_TREE_CONFIG = MFConfiguredFeatureRegistration.BiasedRegistration.registerFallenTrunkConfig(MFRegistry.MAPLE_LOG, MFRegistry.SAPPY_MAPLE_LOG);
}
