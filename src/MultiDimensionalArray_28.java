public class MultiDimensionalArray_28 {
        public static void main(String[] args) {
            // Two dimensional array
        int arr[][];
        arr = new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        }
    }


