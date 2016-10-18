package com.ionaru.currency.common;

import com.ionaru.currency.item.Money;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Currency.modid, name = "Currency", version = Currency.version)
public class Currency {

    public static final String modid = "Currency";
    public static final String version = "1.7.10 - 1.1";

    @SidedProxy(clientSide = "com.ionaru.currency.client.ClientProxy", serverSide = "com.ionaru.currency.common.CommonProxy")
    public static CommonProxy proxy;
    public static Item Penny, DoublePenny, Nickel, Dime, Quarter, HalfCredit,
            Credit, DoubleCredit;
    public static Item CreditBill5, CreditBill10, CreditBill25, CreditBill50,
            CreditBill100, CreditBill200, CreditBill500;
    public static Item IronCard, SteelCard, BronzeCard, SilverCard, GoldCard,
            PlatinumCard, DiamondCard, OsmiumCard, TungstenCard, MithrilCard,
            AdamantiumCard, TartariteCard, IridiumCard;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        new ConfigurationLoader(event);

        Penny = new Money().setUnlocalizedName("Penny");
        DoublePenny = new Money().setUnlocalizedName("DoublePenny");
        Nickel = new Money().setUnlocalizedName("Nickel");
        Dime = new Money().setUnlocalizedName("Dime");
        Quarter = new Money().setUnlocalizedName("Quarter");
        HalfCredit = new Money().setUnlocalizedName("HalfCredit");
        Credit = new Money().setUnlocalizedName("Credit");
        DoubleCredit = new Money().setUnlocalizedName("DoubleCredit");
        CreditBill5 = new Money().setUnlocalizedName("CreditBill5");
        CreditBill10 = new Money().setUnlocalizedName("CreditBill10");
        CreditBill25 = new Money().setUnlocalizedName("CreditBill25");
        CreditBill50 = new Money().setUnlocalizedName("CreditBill50");
        CreditBill100 = new Money().setUnlocalizedName("CreditBill100");
        CreditBill200 = new Money().setUnlocalizedName("CreditBill200");
        CreditBill500 = new Money().setUnlocalizedName("CreditBill500");
        IronCard = new Money().setUnlocalizedName("IronCard");
        SteelCard = new Money().setUnlocalizedName("SteelCard");
        BronzeCard = new Money().setUnlocalizedName("BronzeCard");
        SilverCard = new Money().setUnlocalizedName("SilverCard");
        GoldCard = new Money().setUnlocalizedName("GoldCard");
        PlatinumCard = new Money().setUnlocalizedName("PlatinumCard");
        DiamondCard = new Money().setUnlocalizedName("DiamondCard");
        OsmiumCard = new Money().setUnlocalizedName("OsmiumCard");
        TungstenCard = new Money().setUnlocalizedName("TungstenCard");
        MithrilCard = new Money().setUnlocalizedName("MithrilCard");
        AdamantiumCard = new Money().setUnlocalizedName("AdamantiumCard");
        TartariteCard = new Money().setUnlocalizedName("TartariteCard");
        IridiumCard = new Money().setUnlocalizedName("IridiumCard");
    }

    public static CreativeTabs TabCurrency = new CreativeTabs("CurrencyTab") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Currency.Penny;
        }
    };

    @EventHandler
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderInformation();
        ItemRegistrator.register(Penny, "Penny", "Penny");
        ItemRegistrator.register(DoublePenny, "DoublePenny", "Double Penny");
        ItemRegistrator.register(Nickel, "Nickel", "Nickel");
        ItemRegistrator.register(Dime, "Dime", "Dime");
        ItemRegistrator.register(Quarter, "Quarter", "Quarter");
        ItemRegistrator.register(HalfCredit, "HalfCredit", "Half Credit");
        ItemRegistrator.register(Credit, "Credit", "Credit");
        ItemRegistrator.register(DoubleCredit, "DoubleCredit", "Double Credit");

        ItemRegistrator.register(CreditBill5, "CreditBill5", "5 Credit Bill");
        ItemRegistrator
                .register(CreditBill10, "CreditBill10", "10 Credit Bill");
        ItemRegistrator
                .register(CreditBill25, "CreditBill25", "25 Credit Bill");
        ItemRegistrator
                .register(CreditBill50, "CreditBill50", "50 Credit Bill");
        ItemRegistrator.register(CreditBill100, "CreditBill100",
                "100 Credit Bill");
        ItemRegistrator.register(CreditBill200, "CreditBill200",
                "200 Credit Bill");
        ItemRegistrator.register(CreditBill500, "CreditBill500",
                "500 Credit Bill");

        ItemRegistrator.register(IronCard, "IronCard", "Iron Card");
        ItemRegistrator.register(SteelCard, "SteelCard", "Steel Card");
        ItemRegistrator.register(BronzeCard, "BronzeCard", "Bronze Card");
        ItemRegistrator.register(SilverCard, "SilverCard", "Silver Card");
        ItemRegistrator.register(GoldCard, "GoldCard", "Gold Card");
        ItemRegistrator.register(PlatinumCard, "PlatinumCard", "Platinum Card");
        ItemRegistrator.register(DiamondCard, "DiamondCard", "Diamond Card");
        ItemRegistrator.register(OsmiumCard, "OsmiumCard", "Osmium Card");
        ItemRegistrator.register(TungstenCard, "TungstenCard", "Tungsten Card");
        ItemRegistrator.register(MithrilCard, "MithrilCard", "Mithril Card");
        ItemRegistrator.register(AdamantiumCard, "AdamantiumCard",
                "Adamantium Card");
        ItemRegistrator.register(TartariteCard, "TartariteCard",
                "Tartarite Card");
        ItemRegistrator.register(IridiumCard, "IridiumCard", "Iridium Card");

        if (ConfigurationLoader.enableAllRecipes) {
            ItemStack PennyStack = new ItemStack(Penny);
            ItemStack DoublePennyStack = new ItemStack(DoublePenny);
            ItemStack NickelStack = new ItemStack(Nickel);
            ItemStack DimeStack = new ItemStack(Dime);
            ItemStack QuarterStack = new ItemStack(Quarter);
            ItemStack HalfCreditStack = new ItemStack(HalfCredit);
            ItemStack CreditStack = new ItemStack(Credit);
            ItemStack DoubleCreditStack = new ItemStack(DoubleCredit);

            ItemStack BillStack5 = new ItemStack(CreditBill5);
            ItemStack BillStack10 = new ItemStack(CreditBill10);
            ItemStack BillStack25 = new ItemStack(CreditBill25);
            ItemStack BillStack50 = new ItemStack(CreditBill50);
            ItemStack BillStack100 = new ItemStack(CreditBill100);
            ItemStack BillStack200 = new ItemStack(CreditBill200);
            ItemStack BillStack500 = new ItemStack(CreditBill500);

            ItemStack CardStack1k = new ItemStack(IronCard);
            ItemStack CardStack5k = new ItemStack(SteelCard);
            ItemStack CardStack10k = new ItemStack(BronzeCard);
            ItemStack CardStack50k = new ItemStack(SilverCard);
            ItemStack CardStack100k = new ItemStack(GoldCard);
            ItemStack CardStack500k = new ItemStack(PlatinumCard);
            ItemStack CardStack1m = new ItemStack(DiamondCard);
            ItemStack CardStack5m = new ItemStack(OsmiumCard);
            ItemStack CardStack10m = new ItemStack(TungstenCard);
            ItemStack CardStack50m = new ItemStack(MithrilCard);
            ItemStack CardStack100m = new ItemStack(AdamantiumCard);
            ItemStack CardStack500m = new ItemStack(TartariteCard);
            ItemStack CardStack1b = new ItemStack(IridiumCard);

            // Recipes
            // Penny
            GameRegistry.addShapelessRecipe(new ItemStack(Penny, 2),
                    DoublePennyStack);
            GameRegistry.addShapelessRecipe(new ItemStack(Penny, 5), new ItemStack(
                    Nickel));

            // Double Penny
            // Up
            GameRegistry.addShapelessRecipe(new ItemStack(DoublePenny), PennyStack,
                    PennyStack);
            // NODown

            // Nickel
            // Up
            GameRegistry.addShapelessRecipe(NickelStack,
                    PennyStack, PennyStack, PennyStack, PennyStack, PennyStack);
            GameRegistry.addShapelessRecipe(NickelStack,
                    DoublePennyStack, DoublePennyStack, PennyStack);
            // Down
            GameRegistry.addShapelessRecipe(new ItemStack(Nickel, 5), QuarterStack);
            GameRegistry.addShapelessRecipe(new ItemStack(Nickel, 2), DimeStack);

            // Dime
            // Up
            GameRegistry.addShapelessRecipe(DimeStack, DoublePennyStack,
                    DoublePennyStack, DoublePennyStack, DoublePennyStack,
                    DoublePennyStack);
            GameRegistry.addShapelessRecipe(DimeStack, NickelStack, NickelStack);
            // NODOWN

            // Quarter
            // Up
            GameRegistry.addShapelessRecipe(QuarterStack, DimeStack, DimeStack,
                    NickelStack);
            GameRegistry.addShapelessRecipe(QuarterStack, NickelStack, NickelStack,
                    NickelStack, NickelStack, NickelStack);
            // Down
            GameRegistry.addShapelessRecipe(new ItemStack(Quarter, 2),
                    HalfCreditStack);

            // HalfCredit //Up
            GameRegistry.addShapelessRecipe(HalfCreditStack, DimeStack, DimeStack,
                    DimeStack, DimeStack, DimeStack);
            GameRegistry.addShapelessRecipe(HalfCreditStack, QuarterStack,
                    QuarterStack); // Down
            GameRegistry.addShapelessRecipe(new ItemStack(HalfCredit, 2),
                    CreditStack);

            // Credit //Up
            GameRegistry.addShapelessRecipe(CreditStack, QuarterStack,
                    QuarterStack, QuarterStack, QuarterStack);
            GameRegistry.addShapelessRecipe(CreditStack, HalfCreditStack,
                    HalfCreditStack); // Down
            GameRegistry.addShapelessRecipe(new ItemStack(Credit, 2),
                    DoubleCreditStack);
            GameRegistry.addShapelessRecipe(new ItemStack(Credit, 5), BillStack5);

            // DoubleCredit //Up
            GameRegistry.addShapelessRecipe(DoubleCreditStack, HalfCreditStack,
                    HalfCreditStack, HalfCreditStack, HalfCreditStack);
            GameRegistry.addShapelessRecipe(DoubleCreditStack, CreditStack,
                    CreditStack); // NODown

            // 5CreditBill //Up
            GameRegistry.addShapelessRecipe(BillStack5, CreditStack, CreditStack,
                    CreditStack, CreditStack, CreditStack);
            GameRegistry.addShapelessRecipe(BillStack5, DoubleCreditStack,
                    DoubleCreditStack, CreditStack); // Down
            GameRegistry.addShapelessRecipe(new ItemStack(CreditBill5, 5),
                    BillStack25);
            GameRegistry.addShapelessRecipe(new ItemStack(CreditBill5, 2),
                    BillStack10);

            // 10CreditBill //Up
            GameRegistry.addShapelessRecipe(BillStack10, DoubleCreditStack,
                    DoubleCreditStack, DoubleCreditStack, DoubleCreditStack,
                    DoubleCreditStack);
            GameRegistry.addShapelessRecipe(BillStack10, BillStack5, BillStack5);
            // NODown

            // 25CreditBill //Up
            GameRegistry.addShapelessRecipe(BillStack25, BillStack5, BillStack5,
                    BillStack5, BillStack5, BillStack5);
            GameRegistry.addShapelessRecipe(BillStack25, BillStack10, BillStack10,
                    BillStack5); // Down
            GameRegistry.addShapelessRecipe(new ItemStack(CreditBill25, 2),
                    BillStack50);

            // 50CreditBill //Up
            GameRegistry.addShapelessRecipe(BillStack50, BillStack25, BillStack25);
            GameRegistry.addShapelessRecipe(BillStack50, BillStack10, BillStack10,
                    BillStack10, BillStack10, BillStack10); // Down
            GameRegistry.addShapelessRecipe(new ItemStack(CreditBill50, 2),
                    BillStack100);

            // 100CreditBill //Up
            GameRegistry.addShapelessRecipe(BillStack100, BillStack50, BillStack50);
            GameRegistry.addShapelessRecipe(BillStack100, BillStack25, BillStack25,
                    BillStack25, BillStack25); // Down
            GameRegistry.addShapelessRecipe(new ItemStack(CreditBill100, 5),
                    BillStack500);
            GameRegistry.addShapelessRecipe(new ItemStack(CreditBill100, 2),
                    BillStack200);

            // 200CreditBill //Up
            GameRegistry.addShapelessRecipe(BillStack200, BillStack50, BillStack50,
                    BillStack50, BillStack50);
            GameRegistry.addShapelessRecipe(BillStack200, BillStack25, BillStack25,
                    BillStack25, BillStack25, BillStack25, BillStack25,
                    BillStack25, BillStack25);
            GameRegistry.addShapelessRecipe(BillStack200, BillStack100,
                    BillStack100); // NoDown

            // 500CreditBill //Up
            GameRegistry.addShapelessRecipe(BillStack500, BillStack200,
                    BillStack200, BillStack100);
            GameRegistry.addShapelessRecipe(BillStack500, BillStack100,
                    BillStack100, BillStack100, BillStack100, BillStack100); // Down
            GameRegistry.addShapelessRecipe(new ItemStack(CreditBill500, 2),
                    CardStack1k);

            // 1kCard //Up
            GameRegistry.addShapelessRecipe(CardStack1k, BillStack200,
                    BillStack200, BillStack200, BillStack200, BillStack200);
            GameRegistry
                    .addShapelessRecipe(CardStack1k, BillStack500, BillStack500); // Down
            GameRegistry
                    .addShapelessRecipe(new ItemStack(IronCard, 5), CardStack5k);

            // 5kCard //Up
            GameRegistry.addShapelessRecipe(CardStack5k, CardStack1k, CardStack1k,
                    CardStack1k, CardStack1k, CardStack1k);
            // Down
            GameRegistry.addShapelessRecipe(new ItemStack(SteelCard, 2),
                    CardStack10k);

            // 10kCard //Up
            GameRegistry.addShapelessRecipe(CardStack10k, CardStack5k, CardStack5k); // Down
            GameRegistry.addShapelessRecipe(new ItemStack(BronzeCard, 5),
                    CardStack50k);

            // 50kCard //Up
            GameRegistry.addShapelessRecipe(CardStack50k, CardStack10k,
                    CardStack10k, CardStack10k, CardStack10k, CardStack10k); // Down
            GameRegistry.addShapelessRecipe(new ItemStack(SilverCard, 2),
                    CardStack100k);

            // 100kCard //Up
            GameRegistry.addShapelessRecipe(CardStack100k, CardStack50k,
                    CardStack50k); // Down
            GameRegistry.addShapelessRecipe(new ItemStack(GoldCard, 5),
                    CardStack500k);

            // 500kCard //Up
            GameRegistry.addShapelessRecipe(CardStack500k, CardStack100k,
                    CardStack100k, CardStack100k, CardStack100k, CardStack100k); // Down
            GameRegistry.addShapelessRecipe(new ItemStack(PlatinumCard, 2),
                    CardStack1m);

            // 1mCard //Up
            GameRegistry.addShapelessRecipe(CardStack1m, CardStack500k,
                    CardStack500k); // Down
            GameRegistry.addShapelessRecipe(new ItemStack(DiamondCard, 5),
                    CardStack5m);

            // 5mCard //Up
            GameRegistry.addShapelessRecipe(CardStack5m, CardStack1m, CardStack1m,
                    CardStack1m, CardStack1m, CardStack1m);
            // Down
            GameRegistry.addShapelessRecipe(new ItemStack(OsmiumCard, 2),
                    CardStack10m);

            // 10mCard //Up
            GameRegistry.addShapelessRecipe(CardStack10m, CardStack5m, CardStack5m); // Down
            GameRegistry.addShapelessRecipe(new ItemStack(TungstenCard, 5),
                    CardStack50m);

            // 50mCard //Up
            GameRegistry.addShapelessRecipe(CardStack50m, CardStack10m,
                    CardStack10m, CardStack10m, CardStack10m, CardStack10m); // Down
            GameRegistry.addShapelessRecipe(new ItemStack(MithrilCard, 2),
                    CardStack100m);

            // 100mCard //Up
            GameRegistry.addShapelessRecipe(CardStack100m, CardStack50m,
                    CardStack50m); // Down
            GameRegistry.addShapelessRecipe(new ItemStack(AdamantiumCard, 5),
                    CardStack500m);

            // 500mCard //Up
            GameRegistry.addShapelessRecipe(CardStack500m, CardStack100m,
                    CardStack100m, CardStack100m, CardStack100m, CardStack100m); // Down
            GameRegistry.addShapelessRecipe(new ItemStack(TartariteCard, 2),
                    CardStack1b);

            // 1bCard //Up
            GameRegistry.addShapelessRecipe(CardStack1b, CardStack500m,
                    CardStack500m); // NODown
        }
    }
}