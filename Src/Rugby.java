import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {
        Integer[] arrayT1=new Integer[25];
        Integer[] arrayT2=new Integer[25];

        int min=18;
        int max=40;
        int sumT1=0;
        int sumT2=0;

        for (int i = 0; i <arrayT1.length ; i++) {
            arrayT1[i]=(int)((Math.random()*(max-min+1))+min);
            sumT1+=arrayT1[i];
        }
        String res1= Arrays.toString(arrayT1).replace("[","").replace("]","");
        System.out.println("Вік гравців команди 'T1': \t"+res1);
        System.out.println("Середній вік гравців: "+sumT1/arrayT1.length);

        for (int i = 0; i <arrayT1.length ; i++) {
            arrayT2[i]=(int)((Math.random()*(max-min+1))+min);
            sumT2+=arrayT2[i];
        }
        String res2=Arrays.toString(arrayT2).replace("[","").replace("]","");
        System.out.println("Вік гравців команди 'T2': \t"+res2);
        System.out.println("Середній вік гравців: "+sumT2/arrayT2.length);
    }

}
