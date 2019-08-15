package session9;

import java.util.ArrayList;
import java.util.Comparator;

public class HDTVMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HDTV> tvOptions=new ArrayList<HDTV>();
		
		tvOptions.add(new HDTV("Samsung",55));
		tvOptions.add(new HDTV("TvBrand",65));
		tvOptions.add(new HDTV("Samsung",45));
		tvOptions.sort(new TvComp());
		for(HDTV i:tvOptions) {
			System.out.println(i.getInSize());
		}
	}
	static class TvComp implements Comparator<HDTV> {
		public int compare(HDTV tv1,HDTV tv2) {
			if(tv1.getInSize()>tv2.getInSize()) {
				return 1;
			}
			else if(tv2.getInSize()>tv1.getInSize()) {
				return -1;
			}
			return 0;
		}
	}

}
