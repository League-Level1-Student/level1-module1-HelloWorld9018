package _99_extra;

public class WhiteBoardMarker {
	private int inkLeft;

    private String color;



   public WhiteBoardMarker (int inkLeft, String color) {
this.inkLeft= inkLeft;
this.color = color;

}
   
   int getInkLeft() {
	   return inkLeft;
   }
   
   String getColor() {
	   return color;
   }

}
