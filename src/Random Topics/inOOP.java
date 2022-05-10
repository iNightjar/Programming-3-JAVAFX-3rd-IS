// public class inOOP {
//     static rectangle exampleOfRectangle = new rectangle(22, 30);
//     public static void displayRectangle()
//     {
//         //display the length and the width
//         System.out.println("Length: " + exampleOfRectangle.getLength()  + 
//         " , Width: " + exampleOfRectangle.getWidth() ) ;
//     }
//     public static void main(String[] args) {
//         displayRectangle();
//         comparison();
//         stock exampleOneStock = new stock("dragon", 100);
//         stock exampleTwoStock = new stock(exampleOneStock);
//         exampleTwoStock.disPlay();

//     }
//     public static void comparison(){
//         rectangle room1 = new rectangle(10,50);
//         rectangle room2 = new rectangle(10,50);
//         if (room1 == room2) // This is a mistake.
//         System.out.println("The objects are the same."); else
//         System.out.println("The objects are not the same.");
//     }
// }
// class rectangle{
//     private double length;
//     private double width;
//     public rectangle(double len, double wid)
//     { 
//         setLength(len);
//         setWidth(wid);
//     }
//     public void setLength(double lengthValue){
//         this.length = lengthValue;
//     }
//     public void setWidth(double widthValue){
//         this.width = widthValue;
//     }
//     public double getLength()
//     {
//         return length;
//     }
//     public double getWidth()
//     {
//         return width;
//     }
// }

// class stock{
//     private String symbol ;
//     private int sharePrice ;
    
//     public stock(String symbolValue, int sharePricaValue)
//     { // paramitarised constructor
//         this.symbol = symbolValue;
//         this.sharePrice = sharePricaValue;
//     }
//     public stock(stock exampleOneStock)
//     { // copy constructor
//         symbol = exampleOneStock.symbol;
//         sharePrice = exampleOneStock.sharePrice;
//     }
//     public void disPlay()
//     {
//         System.out.println("symbol is : " + symbol);
//         System.out.println("sharePrice is : " + sharePrice);
//     }
// }