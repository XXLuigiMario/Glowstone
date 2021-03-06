package net.glowstone.io.structure;

import net.glowstone.generator.structures.GlowDesertTemple;
import net.glowstone.util.nbt.CompoundTag;

public class DesertTempleStore extends TemplePieceStore<GlowDesertTemple> {

    public DesertTempleStore() {
        super(GlowDesertTemple.class, "TeDP");
    }

    @Override
    public GlowDesertTemple createStructurePiece() {
        return new GlowDesertTemple();
    }

    @Override
    public void load(GlowDesertTemple structurePiece, CompoundTag compound) {
        super.load(structurePiece, compound);

        if (compound.isByte("hasPlacedChest0")) {
            structurePiece.setHasPlacedChest0(compound.getByte("hasPlacedChest0") != 0);
        }
        if (compound.isByte("hasPlacedChest1")) {
            structurePiece.setHasPlacedChest1(compound.getByte("hasPlacedChest1") != 0);
        }
        if (compound.isByte("hasPlacedChest2")) {
            structurePiece.setHasPlacedChest2(compound.getByte("hasPlacedChest2") != 0);
        }
        if (compound.isByte("hasPlacedChest3")) {
            structurePiece.setHasPlacedChest3(compound.getByte("hasPlacedChest3") != 0);
        }
    }

    @Override
    public void save(GlowDesertTemple structurePiece, CompoundTag compound) {
        super.save(structurePiece, compound);

        compound.putByte("hasPlacedChest0", structurePiece.getHasPlacedChest0() ? 1 : 0);
        compound.putByte("hasPlacedChest1", structurePiece.getHasPlacedChest1() ? 1 : 0);
        compound.putByte("hasPlacedChest2", structurePiece.getHasPlacedChest2() ? 1 : 0);
        compound.putByte("hasPlacedChest3", structurePiece.getHasPlacedChest3() ? 1 : 0);
    }
}
