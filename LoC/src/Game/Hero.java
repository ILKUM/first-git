/*
 Version : 2.4
 だ橾貲 : Hero.java
 濛撩橾濠 : 2019-09-21
 撲貲 : 議葛攪曖 в蹂и 賅萇 匙菟
 */
package Game;

import java.io.Serializable;
import Item.Armor;
import Item.HpPotion;
import Item.Item;
import Item.MpPotion;
import Item.Weapon;
import Monster.Monster;

public class Hero implements Serializable{  //偌羹盪濰擊 嬪п 霜溺�倥雩� й 熱 氈啪
	private static Hero hero; //諒旋驛瞳辨
	private int storyIndex; // 盪濰衛 ⑷營 蝶饜葬霞ч嬪纂
	private final String hName;//議葛攪檜葷
	private int hLv;//議葛攪 溯漣
	private int hMaxhp;//譆渠Hp
	private int hMaxmp;//譆渠Mp
	private int hHp;//⑷營 Hp
	private int hMp;//⑷營mp
	private int hAtt;//馨葛攪 奢問溘
	private int hDef;//議葛攪 寞橫溘
	private int hExp;//議葛攪 唳я纂
	private int[] hLexp;//溯漣機縑 в蹂и 唳я纂蒂 氬擊 л熱 //蟾晦�� 0918 檜遵營 
	private int hPos;//議葛攪 ⑷營嬪纂
	private Item[] inventory;//嬴檜蠱 氬朝 檣漸饜葬
	private Item[] item;//濰雜醞檣 嬴檜蠱
	private int[][] hLStatus;//溯漣機縑評艇 議葛憮 Status 撲薑 高 0918 檜遵營 蹺陛

	//議葛攪 儅撩 諒旋驛
	private Hero(String hName) {//儅撩衛 1溯漣
		this.hLStatus = new int[][] {{0,0,0,0},{50, 0, 15, 15},{60,50,20,20},{70,60,25,25},{80,70,30,30},{100,100,100,100}};
		this.hName = hName;
		this.hLv = 1;
		this.hMaxhp = hLStatus[1][0];
		this.hMaxmp = hLStatus[1][1]  ;
		this.hHp = this.hMaxhp;
		this.hMp = this.hMaxmp;
		this.hExp = 0;
		this.hAtt = hLStatus [1][2];
		this.hDef = hLStatus [1][3];
		this.hPos = 1;
		this.inventory = new Item[10];
		this.item = new Item[2];
		this.hLexp = new int[] {0,10,20,30,40};
	}

	//議葛攪朝 ж釭虜 氈橫撿л 諒旋驛 //л熱檜葷 滲唳0919
	static Hero mkHero(String hName) {
		if( hero == null) {
			hero = new Hero(hName);
		}
		return hero;	
	}
	//碳楝螃晦 衛 餌辨ж朝 諒旋驛 儅撩 л熱 (螃幗煎註)
	static Hero mkHero(Hero hero1) {
		hero = hero1;
		return hero;
	}

	//⑷營 蝶饜葬 塭檣 盪濰 л熱 //0920 薑ж
	void storyIndex(Story story) {
		this.storyIndex = story.getStoryIndex();
	}

	//奢問л熱 遵營
	void hAttack(Monster monster) {
		int gap;
		int attPoint;
		if(hLv!=1){
			gap = hLStatus[this.hLv][2]-hLStatus[this.hLv-1][2];
			attPoint = (int)(Math.random()*gap) + hLStatus[this.hLv-1][2] + 1 - monster.getmDef(); //+ (Weapon)(item[0]).getwAtt;
			attPoint = item[0]==null? attPoint:attPoint+ ((Weapon)(item[0])).getwAtt();
			if(attPoint<0){
				attPoint =1;
			}


		}else{
			attPoint = (int)(Math.random()*2)+ hAtt;
		}
		System.out.println(attPoint+"曖 Яп蒂 殮⑼棻");
		monster.setmHp(monster.getmHp()-attPoint);// -= attPoint;
	}

	//斬曖奢衝 蝶鑒 遵營
	void cSkillOne(Monster monster) {
		int attPoint = (int)(Math.random()*hLStatus[this.hLv][2])+13;
		this.hMp-=10;
		System.out.println("     *      _______________");
		System.out.println("   *   *   {  sin昌+cos昌=1!!! )");
		System.out.println("     *      \\_______________/ ");
		System.out.println("  *  *  *     蓬蓬蓬蔥!!");
		System.out.println(" *   *    *");
		System.out.println("     *     ");
		System.out.println("  *  *  *  ");
		System.out.println(" *       * ");
		System.out.println(" *       * ");
		System.out.println("*********************");
		System.out.println("**"+attPoint+"曖 Яп蒂 殮⑼棻**");
		System.out.println("*********************");
		monster.setmHp(monster.getmHp()-attPoint);
		//sin昌+cos昌=1
	}

	//嘐碟瞳碟 蝶鑒 遵營
	void cSkillTwo(Monster monster) {
		int attPoint = (int)(Math.random()*hLStatus[this.hLv][2])+18;
		this.hMp-=15;
		System.out.println("     *      _______________");
		System.out.println("   *   *   {  ♁f(x)dx!!!!!!! )");
		System.out.println("     *      \\_______________/ ");
		System.out.println("  *  *  *     攜攜櫺!!");
		System.out.println(" *   *    *");
		System.out.println("     *     ");
		System.out.println("  *  *  *  ");
		System.out.println(" *       * ");
		System.out.println(" *       * ");
		System.out.println(attPoint+"曖 Яп蒂 殮⑼棻");
		System.out.println("***************");
		System.out.println("**"+attPoint+"曖 Яп蒂 殮⑼棻**");
		System.out.println("***************");
		monster.setmHp(monster.getmHp()-attPoint);
	}

	// 餌辨醞檜湍 嬴檜蠱 璽堅縑 厥橫輿晦 //0919 梯薑ж 蹺陛
	void hUseInventory(Item item) { 
		//int count = 0; // 璽堅縑 嬴檜蠱檜 菟擎 寞曖 偎熱羹觼
		for ( int index = 0; index < this.inventory.length ; index++) { // 璽堅偎熱虜躑 for 僥 褒ч
			if(this.inventory[index] == null) { // 璽堅陛 綠橫氈戲賊
				this.inventory[index] = item;
				System.out.printf("%s 陛寞縑 厥歷蝗棲棻.\n",this.inventory[index].getiName());
				return;
			}
		}
	}

	//嬴檜蠱餌辨л熱 薑ж 0919 1523 熱薑
	boolean hUse(String choice) { 
		boolean ischoice = false;
		Item item = hItemDelete(choice); // 摹鷗и 嬴檜蠱擊 璽堅縑憮 薯剪

		if( item != null ) {
			ischoice = true;
			System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式\n");
			if ( item instanceof Weapon) { //餌辨и 嬴檜蠱檜 鼠晦賊 item 寡翮 0廓寞縑 厥堅 棻遴議蝶た �� 奢問溘 陛螳諦憮 渦п輿晦
				Weapon newWeapon = (Weapon)item;
				if ( this.item[0] != null) {
					hUseInventory(this.item[0]); // 雜辨醞 嬴檜蠱 檣漸饜葬煎
					Weapon oldWeapon = (Weapon)this.item[0];
					this.hAtt -= oldWeapon.getwAtt();
					System.out.printf("%s 濰雜п薯!!\n (奢問溘檜 □%d■ 馬模腎歷蝗棲棻.)\n\n",oldWeapon.getiName(),oldWeapon.getwAtt());
				}			
				this.item[0] = item;
				this.hAtt += newWeapon.getwAtt();
				System.out.printf("%s 濰雜諫猿!!\n (奢問溘檜 □%d■ 隸陛腎歷蝗棲棻.)\n\n",newWeapon.getiName(),newWeapon.getwAtt());
			} else if (item instanceof Armor) { // 寞橫掘賊 item 寡翮 1廓寞縑 厥堅 棻遴議蝶た �� 寞橫溘 陛螳諦憮 渦п輿晦
				Armor newArmor = (Armor)item;
				if ( this.item[1] != null) {
					hUseInventory(this.item[1]); // 雜辨醞 嬴檜蠱 檣漸饜葬煎
					Armor oldArmor = (Armor)this.item[1];
					this.hDef -= oldArmor.getaDef();
					System.out.printf("%s 濰雜諫猿!!\n (寞橫溘檜 □%d■ 馬模腎歷蝗棲棻.)\n\n",oldArmor.getiName(),oldArmor.getaDef());
				}
				this.item[1] = item;
				this.hDef += newArmor.getaDef();
				System.out.printf("%s 濰雜諫猿!!\n (寞橫溘檜 □%d■ 隸陛腎歷蝗棲棻.)\n\n",newArmor.getiName(),newArmor.getaDef());
			}else if ( item instanceof HpPotion) { //HPん暮檜賊 �蛹僩� 陛螳諦憮 渦п輿晦
				HpPotion hpPotion = (HpPotion)item;

				if ( (this.hHp+hpPotion.getHpRecover()) > this.hMaxhp ) { // ん暮擊 詳橫憮 隸陛и HP陛 譆渠HP 爾棻 觼賊 譆渠 HP梱雖虜 ル衛п輿晦
					this.hHp = this.hMaxhp;
				} else {
					this.hHp += hpPotion.getHpRecover();
				}
				System.out.printf("%s 餌辨諫猿!!\n(HP陛 □%d■ �蛹僱Ц�蝗棲棻.)\n",hpPotion.getiName(),hpPotion.getHpRecover());
			}else { // Mp ん暮檜賊 �蛹僩� 陛螳諦憮 渦п輿晦
				MpPotion mpPotion = (MpPotion)item;

				if ( (this.hMp+mpPotion.getMpRecover()) > this.hMaxmp ) { // ん暮擊 詳橫憮 隸陛и MP陛 譆渠MP 爾棻 觼賊 譆渠 MP梱雖虜 ル衛п輿晦
					this.hMp = this.hMaxmp;
				} else {
					this.hMp += mpPotion.getMpRecover();
				}
				System.out.printf("%s 餌辨諫猿!!\n(MP陛 □%d■ �蛹僱Ц�蝗棲棻.)\n",mpPotion.getiName(), mpPotion.getMpRecover());
			}
			System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
		}
		return ischoice;
		
	}

	//溯漣機л熱 遵營
	void hLvUp() {
		if(hero.hExp>hLexp[hLv]) {
			System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
			System.out.println("溯漣機 ж艘蝗棲棻");
			System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
			this.hLv++;
			this.hMaxhp = hLStatus[hLv][0];
			this.hHp = this.hMaxhp;
			this.hMaxmp = hLStatus[hLv][1];
			this.hMp = this.hMaxmp;
			this.hExp = 0;
			this.hAtt = hLStatus[hLv][2];
			this.hDef = hLStatus[hLv][3];

		}
	}

	//議葛攪 檜翕л熱 薑ж
	void hMove() {
		hPos++;
	}

	//嬴檜蠱 �僱磈埮� 薑擎 // 氬晦蒂 摹鷗й 衛 薑擎 // 0920 0937
	void hGet(Item item) { 
		int i;
		for (i = 0; i < inventory.length; i++) {// 檣漸饜葬陛 綠橫氈棻賊
			if (inventory[i] == null) {
				inventory[i] =item; // 嬴檜蠱擊 厥橫 邀
				System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
				System.out.println("☆ "+hero.hName + " ★ 椒擎 " + item.getiName() + "擊 �僱磈蔇懂炴�.");
				System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
				System.out.println("Ⅰ 陛寞縑 [" + item.getiName() + "] 蹺陛");
				break;
			}
		}

		if (i >= inventory.length) { //檣漸饜葬陛 陛菜 獺棻賊
			System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
			System.out.println("\t陛寞檜 陛菜 離 氈橫 渦檜鼻 氬擊 熱 橈蝗棲棻.");
			System.out.println("\t雖釭除 幗蝶朝 棻衛 給嬴螃雖 彊蝗棲棻.棻擠睡攪朝 薑褐 欽蛤 離葬撮蹂.");
			System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
		}
	}

	//議葛攪 檣漸饜葬 褻�裔埮� 惜團 諫撩
	boolean hInventory(){
		int count = 0;
		boolean hasSomething = true;
		System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
		System.out.println("\t\t◇  陛  寞  ◆");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < this.inventory.length; i++) {
			if (this.inventory[i] != null) {
				System.out.printf("\t▲(%d)◎ %s\n",(i+1),this.inventory[i].getiName());
				System.out.println("-------------------------------------------");
				count++;
			}
		}
		if ( count == 0 ) {
			hasSomething = false;
			System.out.println("菟橫氈朝 嬴檜蠱檜 橈蝗棲棻.");
		}
		System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
		return hasSomething;
	}

	//議葛攪薑爾褻�� л熱 惜團 諫撩
	void hStatus(){
		System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
		System.out.println("\t⑷營Lv : " + this.hLv);
		System.out.println("\t⑷營HP : " + this.hHp +" / " + this.hMaxhp);
		System.out.println("\t⑷營MP : " + this.hMp +" / " + this.hMaxmp);
		System.out.println("\t⑷營唳я纂 : " + this.hExp);
		System.out.println("\t⑷營奢問溘 : " + this.hAtt);
		System.out.println("\t⑷營寞橫溘 : " + this.hDef);
				
		if ( this.item[0] != null ) System.out.println("\t⑷營 雜辨醞檣 鼠晦 : " + this.item[0].getiName());
		if( this.item[1] != null) System.out.println("\t⑷營 雜辨醞檣 寞橫掘 : " + this.item[1].getiName());
		System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
	}

	// 摹鷗и 嬴檜蠱擊 璽堅縑憮 餉薯 item return //0919 梯薑ж 蹺陛
	Item hItemDelete(String choice) { 
		Item item = null;
		int choiceInt = (Integer.parseInt(choice))-1;

		if ( this.inventory[choiceInt] != null ) {
			item = this.inventory[choiceInt];
			this.inventory[choiceInt] = null;
			System.out.println("陛寞縑憮 疏麻棻");
		} else {
			System.out.println("≠≧≠≧薑褐離溥!!≠≧≠≧");
		}
		//System.out.printf("%s 嬴檜蠱擊 陛寞縑憮 疏麻蝗棲棻.\n",item.getiName());
		return item;
	}

	//----------------------------------------------getter setter----------------------------------

	// mAttack() 縑憮 餌辨 //0919 檜遵營
	public int gethHp() {
		return hHp;
	}

	// mAttack() 縑憮 餌辨 //0919 檜遵營
	public void sethHp(int hHp) {
		this.hHp = hHp;
	}

	// mAttack() 縑憮 餌辨 //0919 檜遵營
	public int gethDef() {
		return hDef;
	}

	// eHpInfo(Hero hero) 縑憮 餌辨 //0919 薑擎
	public String gethName() {
		return hName;
	}

	public int gethMp() {
		return hMp;
	}

	public int gethExp() {
		return hExp;
	}

	public int gethPos() {
		return hPos;
	}

	//遵營餌辨
	public void sethExp(int hExp) {
		this.hExp = hExp;
	}

	// 薑ж餌辨
	public int getStoryIndex() {
		return storyIndex;
	}
	
	//瞪癱衛 hpInfoл熱縑 餌辨 0921 檜遵營
	public int gethMaxhp() {
		return hMaxhp;
	}
	
	//瞪癱衛 hpInfoл熱縑 餌辨 0921 檜遵營
	public int gethMaxmp() {
		return hMaxmp;
	}
	

}
