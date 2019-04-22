package org.java.design_patterns.org_print;

public class Officer{
	
	SoldierInfo captain;
	
	public Officer() {
		this.captain = new SoldierInfo("문통신", 2);
		
		SoldierInfo Platoon_Commander_1 = new SoldierInfo("김가설", 22); 
		SoldierInfo Platoon_Commander_2 = new SoldierInfo("한운용", 22);
		SoldierInfo AL_management = new SoldierInfo("강행정", 22);
		
		Platoon_Commander_1.addMySoldier(new SoldierInfo("허준O", 3));
		Platoon_Commander_1.addMySoldier(new SoldierInfo("하찬O", 3));

		Platoon_Commander_2.addMySoldier(new SoldierInfo("한재O", 3));
		Platoon_Commander_2.addMySoldier(new SoldierInfo("김대O", 3));
		Platoon_Commander_2.addMySoldier(new SoldierInfo("장성O", 3));
		
		AL_management.addMySoldier(new SoldierInfo("이창O", 3));
		AL_management.addMySoldier(new SoldierInfo("김광O", 3));
		
		captain.addMySoldier(Platoon_Commander_1);
		captain.addMySoldier(Platoon_Commander_2);
		captain.addMySoldier(AL_management);
	}
	
	public void printOrg(SoldierInfo soldier) {
		if(soldier.hasMySoldiers()) {
			for(int i = 0; i < soldier.getMySoldiers().size(); i++) {
				printOrg(soldier.getMySoldiers().get(i));
			}
		}
		soldier.print();
	}
	
	public static void main(String[] args) {
		Officer o = new Officer();
		o.printOrg(o.captain);
	}
}