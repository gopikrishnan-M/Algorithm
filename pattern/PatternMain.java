package pattern;

public class PatternMain {
    public static int n=5;

    //full square
    public static void square1(){
        for (int row=1; row<=n; row++) {
          for(int col=1;col<=n;col++) {
              System.out.print(" * ");
          }
            System.out.println();
        }
    }
    //parallel bars
    public static void square2(){
        for (int row=1; row<=n; row++) {
            for(int col=1;col<=n;col++) {
                if(col==1||col==n) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
    //hallo
    public static void square3(){
        for (int row=1; row<=n; row++) {
            for(int col=1;col<=n;col++) {
                if(col==1||col==n||row==1||row==n) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
    //cross
    public static void square4(){
        for (int row=1; row<=n; row++) {
            for(int col=1;col<=n;col++) {
                if(row==col||row+col==n+1) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
    //left straight
    public static void rightTriangle1(){
        for (int row=1; row<=n; row++) {
            for(int col=1;col<=row;col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    //left inverted
    public static void rightTriangle2(){
        for (int row=1; row<=n; row++) {
            for(int col=row;col<=n;col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    //right inverted
    public static void rightTriangle3(){
        for (int row=1; row<=n; row++) {
            for(int spaces=1;spaces<=row-1;spaces++){
                System.out.print("   ");
            }
            for(int col=row;col<=n;col++) {
                System.out.print(" * ");
            }

            System.out.println();
        }

    }
    //right straight
    public static void rightTriangle4(){
        for (int row=1; row<=n; row++) {
            for(int spaces=1;spaces<=n-row;spaces++){
                System.out.print("   ");
            }
            for(int col=1;col<=row;col++) {
                System.out.print(" * ");
            }

            System.out.println();
        }

    }
    //right based 0r double right triangle
    public static void pyramid1(){
        int shift=0;
        for (int row=1;row<=2*n-1;row++) {
            shift=row<n?row:2*n-row;
            for(int col=1;col<=shift;col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    //left based (or) double right triangle
    public static void pyramid2(){
        int shift=0;
        int sshift=0;
        for (int row=1;row<=2*n-1;row++) {
            shift=row<n?row:2*n-row;
            sshift=row<n?n-row:row-n;
            for(int spaces=1;spaces<=sshift;spaces++){
                System.out.print("   ");
            }
            for(int col=1;col<=shift;col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    //straight pyramid
    public static void pyramid3(){
        for (int row=1; row<=n; row++) {
            for(int spaces=1;spaces<=n-row;spaces++){
                System.out.print("   ");
            }
            for(int col=1;col<=2*row-1;col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    //inverted pyramid
    public static void pyramid4(){
        for (int row=1; row<=n; row++) {
            for(int spaces=1;spaces<=row-1;spaces++){
                System.out.print("   ");
            }
            for(int col=1;col<=2*n-2*row-1;col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    //triangular pyramid(pascal)
    public static void pyramid5(){
        for(int row=1;row<=n;row++){
            for(int spaces=1;spaces<=n-row;spaces++){
                System.out.print(" ");
            }
            int num=1;
            for(int col=1;col<=row;col++){
                System.out.print(" "+num);
                num=num*(row-col)/(col);
            }
            System.out.println();
        }
    }
    //dimond
    public static void diamond1(){
        for (int row=1; row<=2*n-1; row++) {
            int sshift=row>n?row-n:n-row;
            int bottom=4*n-2*row;
            int shift=row>n?bottom-1:2*row-1;
            for(int spaces=1;spaces<=sshift;spaces++){
                System.out.print("   ");
            }
            for(int col=1;col<=shift;col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    //dimond org
    public static void diamond2(){
        for (int row=1; row<=2*n-1; row++) {
            int sshift=row>n?row-n:n-row;
            int shift=row>n?2*n-row:row;
            for(int spaces=1;spaces<=sshift;spaces++){
                System.out.print(" ");
            }
            for(int col=1;col<=shift;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    //dimond org 90
    public static void diamond3(){
        for (int row=1; row<=2*n-1; row++) {
            int sshift=row>n?row-n:n-row;
            int shift=row>n?2*n-row:row;
            for(int spaces=1;spaces<=sshift;spaces++){
                System.out.print("    ");
            }
            for(int col=1;col<=shift;col++) {
                System.out.print("  *     ");
            }
            System.out.println();
        }

    }
    //dimond  border
    public static void diamond4(){
        for (int row=1; row<=2*n-1; row++) {
            int sshift=row>n?row-n:n-row;
            int bottom=4*n-2*row;
            int shift=row>n?bottom-1:2*row-1;
            for(int spaces=1;spaces<=sshift;spaces++){
                System.out.print("   ");
            }
            for(int col=1;col<=shift;col++) {
                if(col==1||col==shift) {
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
//    dimond X
    public static void diamond5(){
        for (int row=1; row<=2*n-1; row++) {
            int sshift=row>n?2*n-row-1:row-1;
            int bottom=2*row-2*n;
            int shift=row>n?bottom+1:2*n-2*row+1;
            for(int spaces=1;spaces<=sshift;spaces++){
                System.out.print("   ");
            }
            for(int col=1;col<=shift;col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    //ultimate open diamond
    public static void diamond6(){
        for (int row=1; row<=2*n; row++) {
            int shift=row>n?2*n-row+1:row;
            for(int col=1;col<=2*n;col++) {
                if(col<=n-shift+1||col>n+shift-1)
                System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }

    }
    //distant square(on my way)
    public static void squarez(){
        int a=1;
        for (int row=1; row<=2*n-1; row++) {
          for(int col=1;col<=2*n-1;col++) {
              if(col==1||row==1||col==2*n-1||row==2*n-1){
                System.out.print(" "+(a)+" ");
              }
              else if (col==2||row==2||col==2*n-2||row==2*n-2) {
                  System.out.print(" "+(a+1)+" ");
              }
              else if (col==3||row==3||col==2*n-3||row==2*n-3) {
                  System.out.print(" "+(a+2)+" ");
              }
              else if (col==4||row==4||col==2*n-4||row==2*n-4) {
                  System.out.print(" "+(a+3)+" ");
              }
              else
                  System.out.print(" "+(a+4)+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pyramid5();
        //do the diamond pascal,distant
    }

}
