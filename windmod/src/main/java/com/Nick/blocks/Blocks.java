package com.Nick.blocks;

	import net.minecraft.creativetab.CreativeTabs;
	import net.minecraft.item.Block;
	import net.minecraftforge.fml.common.registry.GameRegistry;
	
	public class Blocks {

		public static void mainRegistry(){
			initializeBlock();
			registerBlock();
		}
		public static Block grass;
		public static void initializeBlock(){
			grass = new Item().setUnlocalizedName("block").setCreativeTab(CreativeTabs.tabBlock);
		}
		public static void registerBlock(){
			GameRegistry.registerItem(Grass, Grass.getUnlocalizedName());
		}
	}
	/*
	public Blocks(){
		fillArray();
	}
	// method from RedboxMachine used to read in from a text file.
	private void fillArray()
	   {
	      try{
	         Scanner sn = new Scanner(new File("blocks.txt"));
	         while(sn.hasNextLine())
	            returnMovie(sn.nextLine());
	              
	      }catch(FileNotFoundException e){
	         String s = "File not found! Make sure that MovieList.txt ";
	         s = s + "is in the same folder as the class.";
	         System.out.println(s);
	      }
	   }*/
