class main
{
 public static void main(String args[])
 {
   String name="Siva";
   char code='b';
   int price=231;
   double quantity=5.5;
   double discount=0,gst=0;
   double total=price*quantity;
   System.out.println("WELCOME TO PRODUCT APPLICATION");
   if(total>=0&&total<=500)
   {
    discount=5.0/100*total;
    gst=3.0/100*total;
    }
   else if(total>=500&&total<=1000)
    {
      discount=10.0/100*total;
      gst=5.0/100*total;
    }
   else if(total>=1000&&total<=1500)
   {
    discount=15.0/100*total;
    gst=7.5/100*total;
    }
   else
    {
     discount=20.0/100*total;
     gst=9.0/100*total;
     }
     System.out.println("discount"+discount);
     System.out.println("gst"+gst);
     total=gst+total-discount;
     System.out.println("total bill"+total);
   }
}
     


   
  
  
  