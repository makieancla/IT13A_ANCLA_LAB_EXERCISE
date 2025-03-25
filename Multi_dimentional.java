
package ancla_midterm;


public class Multi_dimentional {
    public static void main(String[] args){
        
        int[][] ancla = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        
        for (int i = 0; i < ancla.length; i++){
            
            System.out.print("The Elements in row " + (i + 1) + " : ");
        
        for (int j = 0; j < ancla[i].length; j++) 
        {
        
        System.out.print(ancla[i][j] + " ");
        }
        
        System.out.println();
        
    }
            
    } 
}
