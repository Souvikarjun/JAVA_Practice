package Lab6;

import java.util.Scanner;
class Box {
    int height;
    int width;    
    int depth;
    
    int volume(int height, int width, int depth){
        int voll = height*width*depth;
        
        return voll;
    }
}

class boxWeight extends Box{
    int distance;
    int CoPKm;
    int Cost(int voll, int distance, int CoPKm){    //CoPKm cost per Km
        int cost = distance*voll* CoPKm;

        return cost;
    }
}

public class BoxMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boxWeight box = new boxWeight();
        
        System.out.println("Input Height");
        box.height = scanner.nextInt();
        System.out.println("Input Width");
        box.width = scanner.nextInt();
        System.out.println("Input Depth");
        box.depth = scanner.nextInt();
        System.out.println("Input Distance");
        box.distance = scanner.nextInt();
        System.out.println("Input Cost per KM");
        box.CoPKm = scanner.nextInt();
        
        int volume = box.volume(box.height, box.width, box.depth);
        int cost = box.Cost(volume, box.distance, box.CoPKm);

        System.out.println("Volume = "+volume+" And Cost = "+cost);
        scanner.close();
    }
    
}
