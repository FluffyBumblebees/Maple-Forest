package net.fluffybumblebee.maple_forest.world.gen.surfacerules;

import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.minecraft.world.gen.surfacebuilder.MaterialRules.MaterialRule;
import net.minecraft.world.gen.surfacebuilder.VanillaSurfaceRules;

import static net.minecraft.world.gen.surfacebuilder.MaterialRules.*;


public class MFSurfaceRules {
    public static MaterialRule createRules() {
        MaterialRule defaultGrass = VanillaSurfaceRules.createDefaultRule(true, false, true);

        return sequence(condition(MaterialRules.surface(), sequence(defaultGrass)), defaultGrass);
    }

}
