package gababo.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import gababo.swing.frame.All_Interface;
import gababo.swing.panel_04.FourLabel_String;

public class RankSystem {

	ArrayList<String[]> rank = logic_interface.id_pass;
	Iterator<String[]> irank = rank.iterator();
	String[] a;
	int total;
	
	ArrayList<FourLabel_String> arrd = new ArrayList<>();
	
	public RankSystem(){}

	public void playRank_reversed() {
		
		arrd.add(All_Interface.four_rank1);
		arrd.add(All_Interface.four_rank2);
		arrd.add(All_Interface.four_rank3);
		arrd.add(All_Interface.four_rank4);
		arrd.add(All_Interface.four_rank5);
		arrd.add(All_Interface.four_rank6);
		arrd.add(All_Interface.four_rank7);
		arrd.add(All_Interface.four_rank8);
		arrd.add(All_Interface.four_rank9);
		arrd.add(All_Interface.four_rank10);
		
		while (irank.hasNext()) {
			
			a = irank.next();
			
			total += Integer.parseInt(a[3]);
		}
		
		Collections.sort(rank,Comparator.comparing((String[] arr) ->Integer.parseInt(arr[3])).reversed());
		
		for (int i = 0; i < rank.size(); i++) {
		
			try {arrd.get(i).setText("총 게임수: "+rank.get(i)[3]+" 승리: "+rank.get(i)[4]+" 패배: " + rank.get(i)[5] + " 무승부: " + rank.get(i)[6]   +" 승률: " + rank.get(i)[7] + " ID:" +rank.get(i)[0]);} 
			catch (Exception e) {}
			
		}
	}
	
public void playRank() {
		
		arrd.add(All_Interface.four_rank1);
		arrd.add(All_Interface.four_rank2);
		arrd.add(All_Interface.four_rank3);
		arrd.add(All_Interface.four_rank4);
		arrd.add(All_Interface.four_rank5);
		arrd.add(All_Interface.four_rank6);
		arrd.add(All_Interface.four_rank7);
		arrd.add(All_Interface.four_rank8);
		arrd.add(All_Interface.four_rank9);
		arrd.add(All_Interface.four_rank10);
		
		while (irank.hasNext()) {
			
			a = irank.next();
			
			total += Integer.parseInt(a[3]);
		}
		
		Collections.sort(rank,Comparator.comparing((String[] arr) ->Integer.parseInt(arr[3])));
		
		for (int i = 0; i < rank.size(); i++) {
		
			try {arrd.get(i).setText("총 게임수: "+rank.get(i)[3]+" 승리: "+rank.get(i)[4]+" 패배: " + rank.get(i)[5] + " 무승부: " + rank.get(i)[6]   +" 승률: " + rank.get(i)[7] + " ID:" +rank.get(i)[0]);} 
			catch (Exception e) {}
			
		}
	}
	

public void playRank_ASC() {
	
	arrd.add(All_Interface.four_rank1);
	arrd.add(All_Interface.four_rank2);
	arrd.add(All_Interface.four_rank3);
	arrd.add(All_Interface.four_rank4);
	arrd.add(All_Interface.four_rank5);
	arrd.add(All_Interface.four_rank6);
	arrd.add(All_Interface.four_rank7);
	arrd.add(All_Interface.four_rank8);
	arrd.add(All_Interface.four_rank9);
	arrd.add(All_Interface.four_rank10);
	
	while (irank.hasNext()) {
		
		a = irank.next();
		
		total += Integer.parseInt(a[3]);
	}
	
	Collections.sort(rank,Comparator.comparing((String[] arr) -> Double.parseDouble((arr[7]))).reversed());
	
	for (int i = 0; i < rank.size(); i++) {
	
		try {arrd.get(i).setText("총 게임수: "+rank.get(i)[3]+" 승리: "+rank.get(i)[4]+" 패배: " + rank.get(i)[5] + " 무승부: " + rank.get(i)[6]   +" 승률: " + rank.get(i)[7] + " ID:" +rank.get(i)[0]);} 
		catch (Exception e) {}
		
	}
}

public void playRank_DESC() {
	
	arrd.add(All_Interface.four_rank1);
	arrd.add(All_Interface.four_rank2);
	arrd.add(All_Interface.four_rank3);
	arrd.add(All_Interface.four_rank4);
	arrd.add(All_Interface.four_rank5);
	arrd.add(All_Interface.four_rank6);
	arrd.add(All_Interface.four_rank7);
	arrd.add(All_Interface.four_rank8);
	arrd.add(All_Interface.four_rank9);
	arrd.add(All_Interface.four_rank10);
	
	while (irank.hasNext()) {
		
		a = irank.next();
		
		total += Integer.parseInt(a[3]);
	}
	
	Collections.sort(rank,Comparator.comparing((String[] arr) -> Double.parseDouble((arr[7]))));
	
	for (int i = 0; i < rank.size(); i++) {
	
		try {arrd.get(i).setText("총 게임수: "+rank.get(i)[3]+" 승리: "+rank.get(i)[4]+" 패배: " + rank.get(i)[5] + " 무승부: " + rank.get(i)[6]   +" 승률: " + rank.get(i)[7] + " ID:" +rank.get(i)[0]);} 
		catch (Exception e) {}
		
	}
}
	
}
