package Tokens;

public class TokenPass
{
    static int [] arr;
    static int position;

    public TokenPass(int playerCount)
    {
       arr = new int[playerCount];
       for(int i=0;i<arr.length-1;i++)
       {
           arr[i]=(int)(Math.random()*10)+1;
       }
       position= (int)(Math.random()*playerCount)-1;
    }
    public void printBoard()
    {
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print(arr[i]+"-");
        }
        System.out.println();
    }
    public static void distributeCurrentPlayerToken()
    {
        int i=0;
        int placeholder=arr[position];
        arr[position]=0;
        for(int k=0;k<placeholder;k++)
        {
            arr[i] += 1;
           i++;
        }

    }
    public static void nextPlayer()
    {
        if(position>arr.length-2)
        {
            position=0;
        }
        else if(position<arr.length-1)
        {
            position+=1;
        }


    }
    public int gameOver()
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==0)
            {
                return i;
            }
        }
        return -1;
    }


}
