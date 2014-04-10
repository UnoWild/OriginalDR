package me.vaqxine.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import me.vaqxine.HearthstoneMechanics.Hearthstone;
import me.vaqxine.ItemMechanics.PlayerArrowReplace;
import me.vaqxine.PartyMechanics.Party;
import me.vaqxine.holograms.Hologram;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.WeatherType;
import org.bukkit.block.Block;
import org.bukkit.block.Furnace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

@SuppressWarnings("deprecation")
public class PlayerModel {
	
	private String name;
	private List<String> achievements = new ArrayList<String>();
	private long globalChatDelay;
	private Location deathLocation;
	private long muteTime;
	private Hologram chatHologram;
	private String lastReply;
	private long lastPMTime;
	private List<String> buddyList = new ArrayList<String>();
	private List<String> localConfirmedBuddies = new ArrayList<String>();
	private List<String> ignoreList = new ArrayList<String>();
	private List<String> localConfirmedIgnores = new ArrayList<String>();
	private List<String> toggleList = new ArrayList<String>(); // TODO Convert toggles to ENUM's
	private long lastOnline;
	private long lastBookClick;
	private long rollDelay;
	private int serverNum;
	private int destructionWandUseCount;
	private long destructionWandCooldown;
	private long destructionWandLastUse;
	private boolean flameTrail;
	private boolean flamingArmor;
	private boolean musicSprites;
	private boolean demonicAura;
	private boolean goldCurse;
	private Location musicBoxPlacement;
	private Location musicBoxLocation;
	private long musicBoxCooldown;
	private String ecashStorage;
	private int fatigueEffect;
	private float energyRegenData;
	private float oldEnergy;
	private long lastAttack;
	private boolean sprinting;
	private boolean starving;
	private int health;
	private int thrownPotion;
	private int healthData;
	private int healthRegen;
	private long inCombat;
	private long lastEnvironmentalDamage;
	private Location lastHitLocation;
	private int noobPlayerWarning;
	private boolean combatLogger;
	private boolean noobPlayer;
	private Hearthstone hearthstone;
	private Location hearthstoneLocation;
	private int hearthstoneTimer;
	private boolean pendingUpload;
	private boolean noUpload;
	private boolean beingUploaded;
	private boolean locked;
	private boolean firstLogin;
	private boolean onlineToday;
	private boolean killingSelf;
	private List<Object> remotePlayerData = new ArrayList<Object>();
	private String localPlayerIP;
	private List<String> playerIP = new ArrayList<String>();
	private Inventory playerInventory;
	private Location playerLocation;
	private double playerHP;
	private int playerLevel;
	private int playerFoodLevel;
	private ItemStack[] playerArmorContents;
	private int playerEcash;
	private int playerSDaysLeft;
	private List<Integer> playerPortalShards = new ArrayList<Integer>();
	private long playerFirstLogin;
	private String playerBio;
	private ItemStack playerItemInHand;
	private Inventory playerMuleInventory;
	private long logoutTime;
	private long lastSync;
	private int safeLogout;
	private String toKick;
	private int forumUserGroup;
	private long loginTime;
	private String serverSwap;
	private Location serverSwapLocation;
	private String serverSwapPending;
	private boolean loaded;
	private List<Integer> totalTiming = new ArrayList<Integer>();
	private int averageTiming;
	private long instanceTiming;
	private String playerInstance;
	private List<String> instanceParty = new ArrayList<String>();
	private Location savedLocationInstance;
	private long processingMove;
	private List<Integer> armorData = new ArrayList<Integer>();
	private List<Integer> damageData = new ArrayList<Integer>();
	private PlayerArrowReplace arrowReplace;
	private int strength;
	private int dexterity;
	private int vitality;
	private int intelligence;
	private int fireResistance;
	private int iceResistance;
	private int poisonResistance;
	private int dodge;
	private int block;
	private int thorn;
	private int reflection;
	private int itemFind;
	private int gemFind;
	private long lastOrbUse;
	private int tier;
	private List<ItemStack> armorContents = new ArrayList<ItemStack>();
	private boolean needUpdate;
	private boolean noNegation;
	private boolean processingDamageEvent;
	private boolean processingProjectileEvent;
	private ItemStack spoofedWeapon;
	private boolean processWeapon;
	private String alignment;
	private int alignTime;
	private String plastHit;
	private long lastHit;
	private long lastPlayerAttack;
	private List<ItemStack> savedGear = new ArrayList<ItemStack>();
	private String lostGear;
	private Location savedLocation;
	private int lootSpawnStep;
	private String lootSpawnData;
	private Location lootSpawnLocation;
	private Location lastOpenedLootChest;
	private int itemBeingBought;
	private int orbBeingBought;
	private int dyeBeingBought;
	private int skillBeingBought;
	private int ecashItemBeingBought;
	private int shardItemBeingBought;
	private String lookingIntoOfflineBank;
	private int reportStep;
	private int particleEffects;
	private String reportData;
	private long lastUnstuck;
	private int muteCount;
	private int kickCount;
	private int banCount;
	private boolean usedStuck;
	private boolean vanished;
	private List<Inventory> bankContents = new ArrayList<Inventory>();
	private int bankLevel;
	private String bankUpgradeCode;
	private int bank;
	private int split;
	private int withdraw;
	private String withdrawType;
	private int mobSpawnStep;
	private String mobSpawnData;
	private Location mobSpawnLocation;
	private long playerSlow;
	private String passiveHunter;
	private long lastMobMessage;
	private int mountBeingBought;
	private Location horseSageLocation;
	private int summonMount;
	private Location summonLocation;
	private ItemStack summonItem;
	private Entity mount;
	private Entity mule;
	private Inventory muleInventory;
	private String muleItemList;
	private boolean inShop;
	private String partyInvite;
	private long partyInviteTime;
	private Party party;
	private String partyLoot;
	private int partyLootIndex;
	private boolean partyOnly;
	private String rank;
	private int rankForumGroup;
	private List<String> pets = new ArrayList<String>();
	private long petSpawnDelay;
	private List<Entity> petEntities = new ArrayList<Entity>();
	private Location namingPet;
	private String petType;
	private List<String> phraseList = new ArrayList<String>();
	private int slowMining;
	private long lastSwing;
	private Location playerFishingSpot;
	private HashMap<Block, Furnace> furnaceInventory = new HashMap<Block, Furnace>();
	private boolean ignoreFurnaceOpenEvent;
	private int fishCaughtCount;
	private int fishHealthRegen;
	private int fishEnergyRegen;
	private int fishBonusDamage;
	private int fishBonusArmor;
	private int fishBonusBlock;
	private int fishBonusLifesteal;
	private int fishBonusCriticalHit;
	private int currentItemBeingBought;
	private int shopPage;
	private String shopCurrency;
	private long recentMovement;
	private Location savedOutOfRealmLocation;
	private String portalMapCoords;
	private Location inventoryPortalMap;
	private boolean hasPortal;
	private long portalCooldown;
	private String realmUpgradeCode;
	private String realmPercent;
	private String realmTitle;
	private int realmTier;
	private int savedLevels;
	private boolean realmLoadedStatus;
	private long safeRealm;
	private long flyingRealm;
	private long realmResetCooldown;
	private List<String> buildList = new ArrayList<String>();
	private boolean readyWorld;
	private boolean corruptWorld;
	private long godMode;
	private int deaths;
	private List<Integer> kills = new ArrayList<Integer>();
	private int mobKills;
	private List<Integer> duelStatistics = new ArrayList<Integer>();
	private int inventoryUpdate;
	private long warnedDurability;
	private ItemStack repair;
	private Item itemRepair;
	private Location anvil;
	private int repairState;
	private String zoneType;
	private boolean recentCraft;
	private boolean inInventory;
	private boolean recentBlockEvent;
	private int shopLevel;
	private Block inverseShop;
	private Inventory shopStock;
	private ItemStack itemBeingStocked;
	private int shopServer;
	private String shopBeingBrowsed;
	private String shopUpgradeCode;
	private long lastShopOpen;
	private Inventory collectionBin;
	private boolean priceUpdateNeeded;
	private boolean openingShop;
	private boolean needSQLUpdate;
	private String tp;
	private int tpEffect;
	private Location tpLocation;
	private long processingMoveTeleport;
	private Location warp;
	private Player trade;
	private Player tradePartners;
	private Inventory tradeSecure;
	private long lastInventoryClose;
	private List<String> quest = new ArrayList<String>();
	private List<String> completionDelay = new ArrayList<String>();
	private boolean skipConfirm;
	private boolean leaveConfirm;
	private boolean enchantScroll;
	private boolean onIsland;
	private WeatherType weather;
	
	public PlayerModel(String name) {
		this.name = name;
	}
	
	public Player getPlayer() {
		return Bukkit.getPlayerExact(name);
	}
	
	public OfflinePlayer getOfflinePlayer() {
		return Bukkit.getOfflinePlayer(name);
	}
	
}
