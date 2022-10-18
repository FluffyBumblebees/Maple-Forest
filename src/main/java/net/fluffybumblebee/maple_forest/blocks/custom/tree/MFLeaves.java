package net.fluffybumblebee.maple_forest.blocks.custom.tree;

import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;

public class MFLeaves extends LeavesBlock {
    public MFLeaves() {
        super(Settings.copy(Blocks.OAK_LEAVES).nonOpaque());
    }
}
