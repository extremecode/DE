package com.grokkeking.twopointers;

public class BackspaceCompare {
    public boolean isEqual(String input1,String input2){
        int l1 = input1.length()-1,l2 = input2.length()-1;
        while (l1>=0 || l2>=0){
            l1 = getBackspaceNumber(input1,l1);
            l2 = getBackspaceNumber(input2,l2);

            if(l1<0 && l2<0)
                return true;

            if(l1<0 || l2<0)
                return false;

            if(input1.charAt(l1)!=input2.charAt(l2))
                return false;

            l1--;
            l2--;
        }
        return true;
    }

    private int getBackspaceNumber(final String input,int index){
        int backspaceCount=0;
        while (index>=0){
            if(input.charAt(index)=='#'){
                backspaceCount++;
            }else if(backspaceCount>0){
                backspaceCount--;
            }else {
                break;
            }
            index--;
        }
        return index;
    }
}
