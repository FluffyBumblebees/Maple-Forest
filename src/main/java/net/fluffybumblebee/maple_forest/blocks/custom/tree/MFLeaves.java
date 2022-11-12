package net.fluffybumblebee.maple_forest.blocks.custom.tree;

import net.fluffybumblebee.maple_forest.util.block.MFBlockUtil;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;

public class MFLeaves extends LeavesBlock {
    public MFLeaves() {
        super(Settings.copy(Blocks.OAK_LEAVES).nonOpaque().allowsSpawning(MFBlockUtil::canSpawnOnLeaves).suffocates(MFBlockUtil::never));
    }
}
