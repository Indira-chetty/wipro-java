import java.io.*;
import java.util.";
class UserMainCode
{
public int countEvensOdds (int input1, int input2, int input3, int input4, int input5,String input6){
int counteven=0;
int countodd=0;
//int s-Integer.parseInt(input);
if(input1<0) {input1=input1*(-1);}
if(input2<0) {input2-input2*(-1);} 
if(input3<0) {input3-input3*(-1);}
if(input4<0) {input4=input4*(-1);} 
if(input5<0) {input5=input5*(-1);}
if(input.equalsIgnoreCase("even")){
    if(input1%2==0){
      counteven++;
    }
  if(input2%2==0){
        counteven++; 
   }
    if(input3%2==0){
      counteven++;
    }
  if(input4%2==0){
        counteven++; 
   }
    if(input4%2==0){
      counteven++;
    }
  return counteven;
}
  if(input.equalsIgnoreCase("odd")){
    if(input1%2!=0){
      countodd++;
    }
  if(input2%2!=0){
        countodd++; 
   }
    if(input3%2!=0){
      countodd++;
    }
  if(input4%2!=0){
        countodd++; 
   }
    if(input4%2!=0){
      countodd++;
    }
  return countodd;
}
