static int stringReduction(string s) {
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int lengthStr = s.Length;
        
        foreach(var i in s)
        {
            if(i == 'a')
                countA++;

            if(i == 'b')
                countB++;
    
            if(i == 'c')
                countC++;
        }

        if (countA==lengthStr || countB==lengthStr || countC==lengthStr)
            return lengthStr;
            
        if((countA%2==0 && countB%2==0 && countC%2==0)||
            (countA%2==1 && countB%2==1 && countC%2==1))
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }
