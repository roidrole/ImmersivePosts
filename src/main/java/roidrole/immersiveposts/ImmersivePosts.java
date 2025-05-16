package roidrole.immersiveposts;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import roidrole.immersiveposts.proxy.CommonProxy;

@Mod(modid = Tags.MOD_ID, name = Tags.MOD_NAME, version = Tags.VERSION)
public class ImmersivePosts {
    @SidedProxy(clientSide = Tags.ROOT_PACKAGE+".proxy.ClientProxy", serverSide = Tags.ROOT_PACKAGE+".proxy.CommonProxy")
    public static CommonProxy PROXY;
}
