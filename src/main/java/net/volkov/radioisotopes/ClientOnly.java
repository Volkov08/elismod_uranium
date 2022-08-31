package net.volkov.radioisotopes;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.volkov.radioisotopes.block.ModBlocks;

public class ClientOnly implements ClientModInitializer {
    @Override
    public void onInitializeClient()  {
        //TODO: remove shadows
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.URANIUM_GLASS, RenderLayer.getCutout());
    }
}
