package satisfy.bakery.world.feature;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import satisfy.bakery.util.BakeryIdentifier;


public class BakeryPlacedFeature {
    public static final ResourceKey<PlacedFeature> STRAWBERRY_JUNGLE_PATCH_CHANCE_KEY = registerKey("strawberry_jungle_chance");
    public static final ResourceKey<PlacedFeature> STRAWBERRY_TAIGA_PATCH_CHANCE_KEY = registerKey("strawberry_taiga_chance");


    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new BakeryIdentifier(name));
    }
}


