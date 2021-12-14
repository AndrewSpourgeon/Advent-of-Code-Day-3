import java.io.*;
import java.util.ArrayList; 
class Main {
  public static void main(String[] args) throws Exception {
   FileReader file=new FileReader("input.txt");
  BufferedReader br=new BufferedReader(file);
 String s=null,val=null;
int a=0,b=0;
int a1=0,b1=0;
int a2=0,b2=0;
int a3=0,b3=0;
int a4=0,b4=0;
int a5=0,b5=0;
int a6=0,b6=0;
int a7=0,b7=0;
int a8=0,b8=0;
int a9=0,b9=0;
int a10=0,b10=0;
int a11=0,b11=0;
      ArrayList<String> ars2=new ArrayList<String>();
      ArrayList<String> ars3=new ArrayList<String>();
      ArrayList<String> ars=new ArrayList<String>();
 while((s=br.readLine())!=null){
   ars.add(s);
 }
String tp[]= ars.toArray(new String[ars.size()]);
//part1
            for(int i=0;i<1000;i++){
              val=tp[i];
            if(val.charAt(0)=='1'){
              a=a+1;
            }
            else if(val.charAt(0)=='0'){
              b=b+1;
            }
              }

  //part 2
              for(int i=0;i<1000;i++){
              val=tp[i];
            if(val.charAt(1)=='1'){
              a1=a1+1;
            }
            else if(val.charAt(1)=='0'){
              b1=b1+1;
            }
              }

//part 3
                for(int i=0;i<1000;i++){
                val=tp[i];
              if(val.charAt(2)=='1'){
                a2=a2+1;
              }
              else if(val.charAt(2)=='0'){
                b2=b2+1;
              }
                }

//part 4
              for(int i=0;i<1000;i++){
              val=tp[i];
            if(val.charAt(3)=='1'){
              a3=a3+1;
            }
            else if(val.charAt(3)=='0'){
              b3=b3+1;
            }
              }

//part 5
            for(int i=0;i<1000;i++){
            val=tp[i];
          if(val.charAt(4)=='1'){
            a4=a4+1;
          }
          else if(val.charAt(4)=='0'){
            b4=b4+1;
          }
            }

//part 6
              for(int i=0;i<1000;i++){
              val=tp[i];
            if(val.charAt(5)=='1'){
              a5=a5+1;
            }
            else if(val.charAt(5)=='0'){
              b5=b5+1;
            }
              }

//part 7
              for(int i=0;i<1000;i++){
              val=tp[i];
            if(val.charAt(6)=='1'){
              a6=a6+1;
            }
            else if(val.charAt(6)=='0'){
              b6=b6+1;
            }
              }

//part 8
              for(int i=0;i<1000;i++){
              val=tp[i];
            if(val.charAt(7)=='1'){
              a7=a7+1;
            }
            else if(val.charAt(7)=='0'){
              b7=b7+1;
            }
              }

//part 9
            for(int i=0;i<1000;i++){
            val=tp[i];
          if(val.charAt(8)=='1'){
            a8=a8+1;
          }
          else if(val.charAt(8)=='0'){
            b8=b8+1;
          }
            }

//part 10
            for(int i=0;i<1000;i++){
            val=tp[i];
          if(val.charAt(9)=='1'){
            a9=a9+1;
          }
          else if(val.charAt(9)=='0'){
            b9=b9+1;
          }
            }

 //part 11
          for(int i=0;i<1000;i++){
          val=tp[i];
        if(val.charAt(10)=='1'){
          a10=a10+1;
        }
        else if(val.charAt(10)=='0'){
          b10=b10+1;
        }
          }

//part 12
        for(int i=0;i<1000;i++){
        val=tp[i];
      if(val.charAt(11)=='1'){
        a11=a11+1;
      }
      else if(val.charAt(11)=='0'){
        b11=b11+1;
      }
        }


//part 1
  if(a>b){
    ars2.add("1");
  }
  if(a<b){
    ars2.add("0");
  }

  //part 2
  if(a1>b1){
    ars2.add("1");
  }
  if(a1<b1){
    ars2.add("0");
  }

  //part 3
  if(a2>b2){
    ars2.add("1");
  }
  if(a2<b2){
    ars2.add("0");
  }

  //part 4
  if(a3>b3){
    ars2.add("1");
  }
  if(a3<b3){
    ars2.add("0");
  }

  //part 5
  if(a4>b4){
    ars2.add("1");
  }
  if(a4<b4){
    ars2.add("0");
  }

  //part 6
  if(a5>b5){
    ars2.add("1");
  }
  if(a5<b5){
    ars2.add("0");
  }

  //part 7
  if(a6>b6){
    ars2.add("1");
  }
  if(a6<b6){
    ars2.add("0");
  }

  //part 8
  if(a7>b7){
    ars2.add("1");
  }
  if(a7<b7){
    ars2.add("0");
  }

  //part 9
  if(a8>b8){
    ars2.add("1");
  }
  if(a8<b8){
    ars2.add("0");
  }

  //part 10
  if(a9>b9){
    ars2.add("1");
  }
  if(a9<b9){
    ars2.add("0");
  }

  //part 11
  if(a10>b10){
    ars2.add("1");
  }
  if(a10<b10){
    ars2.add("0");
  }

  //part 12
  if(a11>b11){
    ars2.add("1");
  }
  if(a11<b11){
    ars2.add("0");
  }

String ls = String.join("", ars2);
int gam=Integer.parseInt(ls,2);
String tpres[]= ars2.toArray(new String[ars2.size()]);

        for(int y=0;y<12;y++){
          if(tpres[y]=="0"){
            ars3.add("1");
          }
          if(tpres[y]=="1"){
            ars3.add("0");
          }
        }

String res2=String.join("",ars3);
int eps=Integer.parseInt(res2,2);
System.out.println(gam*eps);

}
  }
