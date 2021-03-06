package net.glowstone.io.entity;

import net.glowstone.entity.monster.GlowShulker;
import net.glowstone.util.nbt.CompoundTag;
import org.bukkit.entity.EntityType;

public class ShulkerStore extends MonsterStore<GlowShulker> {
    public ShulkerStore() {
        super(GlowShulker.class, EntityType.SHULKER);
    }

    @Override
    public void load(GlowShulker entity, CompoundTag tag) {
        super.load(entity, tag);
        if (tag.isByte("Peek")) {
            entity.setShieldHeight(tag.getByte("Peek"));
        }
        if (tag.isByte("AttachFace")) {
            entity.setDirection(GlowShulker.Facing.values()[tag.getByte("AttachFace")]);
        }
    }

    @Override
    public void save(GlowShulker entity, CompoundTag tag) {
        super.save(entity, tag);
        tag.putByte("Peek", entity.getShieldHeight());
        tag.putByte("AttachFace", entity.getFacingDirection().ordinal());
        tag.putInt("APX", entity.getLocation().getBlockX());
        tag.putInt("APY", entity.getLocation().getBlockY());
        tag.putInt("APZ", entity.getLocation().getBlockZ());
    }
}
