package net.fluffybumblebee.maple_forest.world.placer;

import com.terraformersmc.terraform.tree.placer.PlacerTypes;
import net.fluffybumblebee.maple_forest.init.MapleForest;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class TrunkPlacerType {
	public static final FoliagePlacerType<NoneFoliagePlacer> NONE_FOLIAGE_PLACER = PlacerTypes.registerFoliagePlacer( MapleForest.NAMESPACE + ":none", NoneFoliagePlacer.CODEC);
	public static final net.minecraft.world.gen.trunk.TrunkPlacerType<FallenTrunkPlacer> FALLEN_TRUNK_PLACER = PlacerTypes.registerTrunkPlacer(MapleForest.NAMESPACE + ":fallen", FallenTrunkPlacer.CODEC);

	public static void addToRegistry() {
	}
}
