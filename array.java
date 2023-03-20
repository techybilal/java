// public class Array {

//     public static void main(String[] args)
//     {
        
//         int[] anArray = new int[2];
//         anArray[0] = 100;
//         anArray[1] = 200;
//         // for (int i=0;i<2;i++){
//         //     System.out.println(anArray[i]);
//         // }
//         System.out.println("Elements of index 0 :"+ anArray[0]);
        
//         // String[] cars = {"Volvo","BMW","Ford"};
//         // System.out.println(cars[0]);

//         // int[] array = {1,2,3,5};
//         // System.out.println("Elements :" + array[0]);


//         int[] a = new int[10];
//         for(int i = 0;i<10;i++){
//             a[i] = i;
//         }

//         for(int i = 0;i<10;i++){
//             System.out.println(a[i]);
//         }

        


//      }
    
// }

// addition of two array

public class Array{
    public static void main(String[] args){
        int a[] = new int[5],num = 5;
        int b[] = new int[5];
        int c[] = new int[5];
        for( int i = 0;i<5;i++){
            a[i] = i;
            
        }
        for(int i = 0;i<5;i++){
            b[i] = num;
            num++;
        }
        System.out.print("Value of Array A: ");
        for(int i = 0;i<5;i++){
            System.out.print(a[i] + " ");
        }

        System.out.print("\nValue of Array B: ");
        for(int i = 0;i<5;i++){
            System.out.print(b[i] + " ");
        }

        for(int i=0;i<5;i++){
            c[i] = a[i] + b[i];   
        }
        
        System.out.print("\nValue of Array C: ");
        for(int i = 0;i<5;i++){
            System.out.print(c[i] + " ");
        }


    }


}
