package net.fluffybumblebee.maple_forest.world.feature;

import net.fluffybumblebee.maple_forest.init.MFRegistry;
import net.fluffybumblebee.maple_forest.util.registration.world.feature.MFConfiguredFeatureRegistration;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;


@SuppressWarnings("unused")
public class MFConfiguredFeatures {

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> RED_MAPLE_TREE_BEES = MFConfiguredFeatureRegistration.BiasedRegistration.createMapleTree(MFRegistry.RED_MAPLE_LEAVES, "red");
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> RED_MAPLE_SPAWN_BEES = MFConfiguredFeatureRegistration.BiasedRegistration.registerMapleTreeSpawner(MFRegistry.RED_MAPLE_SAPLING, RED_MAPLE_TREE_BEES, "red");
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> GREEN_MAPLE_TREE_BEES = MFConfiguredFeatureRegistration.BiasedRegistration.createMapleTree(MFRegistry.GREEN_MAPLE_LEAVES, "green");
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> GREEN_MAPLE_SPAWN_BEES = MFConfiguredFeatureRegistration.BiasedRegistration.registerMapleTreeSpawner(MFRegistry.GREEN_MAPLE_SAPLING, GREEN_MAPLE_TREE_BEES, "green");
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> YELLOW_MAPLE_TREE_BEES = MFConfiguredFeatureRegistration.BiasedRegistration.createMapleTree(MFRegistry.YELLOW_MAPLE_LEAVES, "yellow");
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> YELLOW_MAPLE_SPAWN_BEES = MFConfiguredFeatureRegistration.BiasedRegistration.registerMapleTreeSpawner(MFRegistry.YELLOW_MAPLE_SAPLING, YELLOW_MAPLE_TREE_BEES, "yellow");
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> ORANGE_MAPLE_TREE_BEES = MFConfiguredFeatureRegistration.BiasedRegistration.createMapleTree(MFRegistry.ORANGE_MAPLE_LEAVES, "orange");
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> ORANGE_MAPLE_SPAWN_BEES = MFConfiguredFeatureRegistration.BiasedRegistration.registerMapleTreeSpawner(MFRegistry.ORANGE_MAPLE_SAPLING, ORANGE_MAPLE_TREE_BEES, "orange");

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> RED_MAPLE_TREE = MFConfiguredFeatureRegistration.BiasedRegistration.createMapleTreeNoBees(MFRegistry.RED_MAPLE_LEAVES, "red");
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> RED_MAPLE_SPAWN = MFConfiguredFeatureRegistration.BiasedRegistration.registerMapleTreeSpawnerNoBees(MFRegistry.RED_MAPLE_SAPLING, RED_MAPLE_TREE, "red");
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> GREEN_MAPLE_TREE = MFConfiguredFeatureRegistration.BiasedRegistration.createMapleTreeNoBees(MFRegistry.GREEN_MAPLE_LEAVES, "green");
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> GREEN_MAPLE_SPAWN = MFConfiguredFeatureRegistration.BiasedRegistration.registerMapleTreeSpawnerNoBees(MFRegistry.GREEN_MAPLE_SAPLING, GREEN_MAPLE_TREE, "green");
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> YELLOW_MAPLE_TREE = MFConfiguredFeatureRegistration.BiasedRegistration.createMapleTreeNoBees(MFRegistry.YELLOW_MAPLE_LEAVES, "yellow");
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> YELLOW_MAPLE_SPAWN = MFConfiguredFeatureRegistration.BiasedRegistration.registerMapleTreeSpawnerNoBees(MFRegistry.YELLOW_MAPLE_SAPLING, YELLOW_MAPLE_TREE, "yellow");
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> ORANGE_MAPLE_TREE = MFConfiguredFeatureRegistration.BiasedRegistration.createMapleTreeNoBees(MFRegistry.ORANGE_MAPLE_LEAVES, "orange");
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> ORANGE_MAPLE_SPAWN = MFConfiguredFeatureRegistration.BiasedRegistration.registerMapleTreeSpawnerNoBees(MFRegistry.ORANGE_MAPLE_SAPLING, ORANGE_MAPLE_TREE, "orange");

    public static final TreeFeatureConfig FALLEN_MAPLE_TREE_CONFIG = MFConfiguredFeatureRegistration.BiasedRegistration.registerFallenTrunkConfig(MFRegistry.MAPLE_LOG, MFRegistry.SAPPY_MAPLE_LOG);
}
