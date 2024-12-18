import java.util.*;

public class FavoriteGame {
    private HashMap<String, LinkedList<String>> map;

    public FavoriteGame() {
        map = new HashMap<String, LinkedList<String>>();
    }

    public void put(String key, String value) {
        if (!map.containsKey(key)) {
            map.put(key, new LinkedList<String>());
        }

        map.get(key).add(value);
    }

    public int size(String key) {
        LinkedList<String> list = map.get(key);
        return list != null ? list.size() : 0;
    }
	int maxElements = 0;
	
    public String getKeyWithMaxElements() {
        
        String keyWithMaxElements = null;

        for (Map.Entry<String, LinkedList<String>> entry : map.entrySet()) {
            int currentSize = entry.getValue().size();
            if (currentSize > maxElements) {
                maxElements = currentSize;
                keyWithMaxElements = entry.getKey();
            }
        }

        return keyWithMaxElements;
    }

    public static void main(String[] args) {
        FavoriteGame FavoriteGame = new FavoriteGame();

        Scanner sc=new Scanner(System.in);
		int n;
		
		do{
			System.out.println("enter the number");
			n=sc.nextInt();
		}while(n>=10000 && n<=1);
		
		String name;
		String game;
		int l;
		int i=0;
		
		
		while(i<n){
			
			do{
				System.out.println("enter the name and game");
				name=sc.next();
				game=sc.next();
				l=name.length()+game.length();
			}while(l>12);
			FavoriteGame.put(game,name);
			i++;
		}
		System.out.println("football "+FavoriteGame.size("football"));
		System.out.print(FavoriteGame.getKeyWithMaxElements()+" "+String.valueOf(FavoriteGame.maxElements));
		
    }
}
