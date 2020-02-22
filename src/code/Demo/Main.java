package code.Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.Attributes;

public class Main {
    static int pre[] = new int[100010];
    static int Size[] = new int[100010];
    static boolean vis[] = new boolean[1000010];

    public static void init(int n)
    {
        Arrays.fill(vis, false);
        for(int i = 1; i <= n; i++)
        {
            pre[i] = i;
            Size[i] = 1;
        }
    }

    public static int Find(int x)
    {
        if(x == pre[x])
        {
            return pre[x];
        }
        else
        {
            pre[x] = Find(pre[x]);
        }
        return pre[x];
    }

    public static void Union(int x, int y)
    {
        x = Find(x);
        y = Find(y);
        if(x != y)
        {
            pre[x] = y;
            Size[y] += Size[x];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        init(n);
        for(int i = 1; i <= m; i++)
        {
            int x = in.nextInt(), y = in.nextInt();
            Union(x, y);
        }
        int sum = 0, ans = 0;
        for(int i = 1; i <= n; i++)
        {
            int val = Find(i);
            if(Size[val] == 1)
            {
                ans++;
                continue;
            }
            if(!vis[val])
            {
                vis[val] = true;
                sum += Size[val] / 2;
                if(Size[val] % 2 == 1)
                    sum++;
            }
        }
        sum += ans / 2;
        if(ans % 2 == 1)
            sum++;
        System.out.println(sum);

        in.close();
    }
}