package Tokens;

public class TokenPass
{
    static int [] arr;
    static int position;

    public TokenPass(int playerCount)
    {
       arr = new int[playerCount];
       for(int i=0;i<arr.length;i++)
       {
           arr[i]=(int)(Math.random()*8)+1;
       }
       position= (int)(Math.random()*playerCount);
    }
    public void printBoard()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("       "+position);
        System.out.println();
    }
    public static void distributeCurrentPlayerToken()
    {
       int nextPlayer = position;
       int numToDis=arr[position];

       arr[position]=0;
       while(numToDis>0)
       {
           nextPlayer =(nextPlayer+1)% arr.length;
           arr[nextPlayer]++;
           numToDis--;
       }
    }
    public static void nextPlayer()
    {
        if(position<arr.length)
        {
            position+=1;
            if(position>=arr.length)
            {
                position=0;
            }
        }


    }
    public int gameOver()
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                return i;
            }
        }
        return -1;
    }
}
