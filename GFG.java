import java.io.*;
import java.util.*;
import java.util.*;
class GFG
{
static void getStudentslist(String[] file)
{
int avgScore;
int maxAvgscore = Integer.MIN_VALUE;
ArrayList<String> names = new ArrList<>();
for (int i=0;i<file.length;i+=4)
{
avgScore = (Integer.parseInt(file[i+1])+Integer.parseInt(file[i+2])+Integer.parseInt(file[i+3]))/3;
if(avgScore > maxAvgScore)
{
maxAvgScore = avgScore;
names.clear();
names.add(file[i]);
}
for (int i=0;i<names.size();i++)
{
System.out.println(names.get(i) +" ");
}
System.out.println(maxAvgScore);
}
public static void main(String args[])
String[] file = {"Nirishma","20","50","20","Reddy","100","28","50","Reddy","100","28","50"};
getStudentslist(file);
}
}