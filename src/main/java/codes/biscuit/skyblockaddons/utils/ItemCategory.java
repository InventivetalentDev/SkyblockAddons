package codes.biscuit.skyblockaddons.utils;

import net.minecraft.util.IntHashMap;

public enum ItemCategory {
	WEAPON(1),
	ARMOR(11),
	ACCESSORY(13),
	CONSUMABLE(14),
	BLOCK(12),
	MISC(10);

	private static final IntHashMap<ItemCategory> BY_COLOR = new IntHashMap<>();

	static{
		for (ItemCategory category : values()) {
			BY_COLOR.addKey(category.colorDamage, category);
		}
	}

	public final short colorDamage;

	ItemCategory(int colorDamage) {
		this.colorDamage = (short) colorDamage;
	}

	public static ItemCategory byColor(int damage) {
		return BY_COLOR.lookup(damage);
	}
}
